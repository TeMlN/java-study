package inherit;

public class Main {
    public static void main(String[] args) {
        Martial martial = new Martial();
        martial.setName("martial");
        martial.setBirthDay(1214);

        martial.sleep();
        martial.walk();

        martial.introduce();
    }
}
