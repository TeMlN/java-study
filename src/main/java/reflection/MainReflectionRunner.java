package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainReflectionRunner {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName("reflection.TransferService");

        //Reflection을 이용해 인스턴스를 생성및 사용하는 방법
        Constructor<?> constructor = clazz.getConstructor();
        TransferService transferService = (TransferService) constructor.newInstance();
        /**
         * TransferService로 형변환을 하는 이유: 형변환을 하지 않아도 .getClass로 찍어보면 reflection.TransferService가 찍히긴 하지만
         * Object 타입이라 인스턴스의 메소드를 사용하지 못한다.
         */
        transferService.transfer(2000000);

    }
}
