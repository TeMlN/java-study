package annotation;

import jdk.dynalink.beans.StaticClass;

@CustomAnnotation(dialect = Dialect.REDIS, ttl = 25600)
public class Service {

    public static Integer VARIABLE_A = 123;

    private String variableB = "asd";

    public Service() {
    }

    public Service(String variableB) {
        this.variableB = variableB;
    }

    public void printB() {
        System.out.println(variableB);
    }

    public void sumPrint(String first, String second) {
        System.out.println(first + second);
    }
}
