package thread;

/**
 * Thrad를 상속해서 Thread를 생성하는 방법
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
