package finalizer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    @DisplayName("일반회원이 송금을 할때")
    void 일반사람() {
        Account account = new Account("martial");
        account.transfer(100000, "태민");
        //actual: success
    }

    @Test
    @DisplayName("블랙 리스트가 송금을 할때")
    void 블랙리스트() {
        Account account = new Account("블랙리스트");
        account.transfer(1000000, "martial");
        //actual: java.lang.IllegalArgumentException: 블랙 리스트는 접근이 불가능합니다.

        //생성자에서 "블랙리스트"라는 이름을 검증하기 때문에 생성자에서 막힌다.
        //하지만 Java에서는 Finalizer 공격을 통해 블랙리스트가 이 검증을 뚫을 수 있다.
    }

    @Test
    @DisplayName("Finalizer 공격을 통해 블랙리스트가 송금")
    void 공격_블랙리스트() throws InterruptedException {
        Account account = null;
        try {
            account = new FinalizerAccount("블랙리스트");
        } catch (Exception ex) {
            System.out.println("블랙리스트의 공격이 성공함");
        }

        System.gc();
        Thread.sleep(3000L);
        //actual:
        //블랙리스트의 공격이 성공함
        //transfer 10000000 from 블랙리스트 to martial
    }


    @Test
    @DisplayName("가비지 컬렉터를 호출하지 않는다면?")
    void 가비지컬렉터를_호출하지않음() throws InterruptedException {
        Account account = null;
        try {
            account = new FinalizerAccount("블랙리스트");
        } catch (Exception ex) {
            System.out.println("블랙리스트의 공격이 성공함");
        }

        Thread.sleep(3000L);
        //actual: 블랙리스트의 공격이 성공함
    }
}