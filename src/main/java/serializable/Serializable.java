package serializable;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Base64;

/**
 *  직렬화를 할 수 있는 조건
 *  직렬화를 할 클래스가 serializable 클래스를 재정의(implements, 재정의하는 메소드는 없음)하고 있어야 한다.
 *  기본 primitive 타입이어야 한다
 */
public class Serializable {
    public static void main(String[] args) {
        Member member = new Member("김태민", "s20014@gsm.hs.kr", 19);
        byte[] serializedMember = new byte[0];

        try(ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            try(ObjectOutputStream oos = new ObjectOutputStream(baos)) {
                oos.writeObject(member);
                //serializedMember -> 직렬화된 member객체
                serializedMember = baos.toByteArray();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // byte배열로 생성된 직렬화 데이터를 base64로 반환
        String base64Member = Base64.getEncoder().encodeToString(serializedMember);
        System.out.println("base64Member = " + base64Member);
    }
}