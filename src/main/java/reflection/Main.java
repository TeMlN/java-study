package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {

        Class clazz = Person.class;
        Method[] methodList = clazz.getDeclaredMethods();
        Field[] fields = clazz.getDeclaredFields();

        System.out.println("methodList = " + methodList[0].invoke(clazz.newInstance()));
        System.out.println("field[0] = " + fields[0]);

    }
}
