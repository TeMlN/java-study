package finalizer;

public class Account {

    private String name;

    public Account(String name) {
        this.name = name;
        if (this.name.equals("블랙리스트")) {
            throw new IllegalArgumentException("블랙 리스트는 접근이 불가능합니다.");
        }
    }

    public void transfer(int amount, String receiver) {
        System.out.printf("transfer %d from %s to %s", amount, this.name, receiver);
    }
}
