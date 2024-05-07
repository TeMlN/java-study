package annotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Arrays.stream(Service.class.getAnnotations()).forEach(System.out::println);
        Arrays.stream(ChildService.class.getAnnotations()).forEach(System.out::println);

        System.out.println();

        Arrays.stream(Service.class.getDeclaredAnnotations()).forEach(System.out::println);
        Arrays.stream(ChildService.class.getDeclaredAnnotations()).forEach(System.out::println);

        Arrays.stream(Service.class.getDeclaredAnnotations()).forEach(
                f -> {
                    if (f instanceof CustomAnnotation) {
                        CustomAnnotation customAnnotation = (CustomAnnotation) f;
                        System.out.println("dialect = " + customAnnotation.dialect() + ", ttl = " + customAnnotation.ttl());
                    }
                }
        );

    }
}
