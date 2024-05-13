package annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
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


        /**
         * Reflection을 이용해 인스턴스를 만들때 권장되는 방법
         */
        Class<?> service = Class.forName("annotation.Service");

        Constructor<?> deafultConstructor = service.getConstructor();
        Service firstServiceInstance = (Service) deafultConstructor.newInstance();

        Constructor<?> argsConstructor = service.getConstructor(String.class);
        Service secondServiceInstance = (Service) argsConstructor.newInstance("a modify variable");

        /**
         * 생성한 인스턴스 사용
         */
        firstServiceInstance.printB();
        secondServiceInstance.printB();


        /**
         * Reflection을 이용해 필드 조회
         */

        Field firstDeclaredField = Service.class.getDeclaredField("VARIABLE_A"); // 파라미터에 담은 값의 변수가 존재하지 않는다면 NoSuchFieldException 발생
        System.out.println("before modify = " + firstDeclaredField.get(null));
        firstDeclaredField.set(null,  9999999);
        System.out.println("after modify = " + firstDeclaredField.get(null));

        Field secondDeclaredField = Service.class.getDeclaredField("variableB");
        secondDeclaredField.setAccessible(true);
        System.out.println("secondDeclaredField = " + secondDeclaredField.get(firstServiceInstance));
    }
}
