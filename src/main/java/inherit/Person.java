package inherit;

public class Person {
    String name;
    Integer birthDay;

    void walk() {
        System.out.println("do walk");
    }

    void sleep() {
        System.out.println("do sleep");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDay(Integer birthDay) {
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public Integer getBirthDay() {
        return birthDay;
    }
}
