package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainReflectionRunner {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        /**
         * Class 타입 인스턴스를 추출하는 3가지 방법
         * 아래 코드 차례대로
         * 1. FQCN으로 추출
         * 2. 타입의 클래스 직접조회
         * 3. 이미 생성된 인스턴스를 통한 타입조회
         */
        Class<?> fqcn = Class.forName("reflection.TransferService");

        Class<TransferService> clazz = TransferService.class;

        TransferService transferService = new TransferService();
        Class<? extends TransferService> instance = transferService.getClass();


        /**
         * Reflection을 이용해 인스턴스를 생성및 사용하는 방법
         */
        Constructor<?> fcqnConstructor = fqcn.getConstructor();
        Constructor<?> clazzConstructor = clazz.getConstructor();
        Constructor<?> instanceConstructor = instance.getConstructor();

        /**
         * Class 인스턴스의 생성자를 통해 실제 인스턴스 생성하기 (형변환을 하지 않으면 상위 타입의 Object 타입으로 생성되기 때문에 형변환)
         */
        TransferService fqcnTransferService = (TransferService) fcqnConstructor.newInstance();
        TransferService classTransferService = (TransferService) clazzConstructor.newInstance();
        TransferService instanceTransferService = (TransferService) instanceConstructor.newInstance();

        fqcnTransferService.transfer(100);
        classTransferService.transfer(20000);
        instanceTransferService.transfer(7900);

    }
}
