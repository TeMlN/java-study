package thread.create_thread;

/**
 * Thread를 상속해서 Thread를 생성하는 방법
 *
 * Thread를 상속해서 써야하는 상황 Override 즉 재정의 할게 많다면 Thread를 이용하여야 한다
 * run, start, interrupted등 거의 모든 메소드들을 Override할 수 있다.
 */
public class CreateThreadByThread extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        CreateThreadByThread createThread = new CreateThreadByThread();
        createThread.start();
    }

}
