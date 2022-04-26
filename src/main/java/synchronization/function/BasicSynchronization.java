package synchronization.function;

public class BasicSynchronization {
    private String snapshot; //

    public static void main(String[] agrs) {

        BasicSynchronization temp = new BasicSynchronization();
        System.out.println("Test start!");
        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                temp.callMe("Thread1");
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                temp.callMe("Thread2");
            } }).start();
        System.out.println("Test end!");
    }

    public synchronized void  callMe(String whoCallMe) {
        snapshot = whoCallMe;
        try {
            long sleep = (long) (Math.random() * 100);
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (!snapshot.equals(whoCallMe)) {
            System.out.println(whoCallMe + " | " + snapshot);
        }
    }

    /**
     * synchronized 키워드를 붙히면 log가 발생하지 않지만
     * synchronized 키워드를 안붙히면 두 Thread가 한 객체를 계속 참조하기 때문에 동시성 문제가 일어남
     * 그래서 if (!snapshot.equals(whoCallMe)) 검증단계를 통과하지 못하기때문에 수많은 log가 발생
     */
}

