package reflection;

public class TransferService {
    private int amount;

    public void transfer(int amount) {
        System.out.println("martial님이" + amount + "원 만큼 송금하였습니다.");
    }

    private void privateMethod() {
        System.out.println("이 메소드는 자기자신 클래스에서만 접근이 가능해요!");
    }
}
