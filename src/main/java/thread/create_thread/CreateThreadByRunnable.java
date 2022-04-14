package thread.create_thread;

/**
 * Runnable를 상속해서 Thread를 만드는 방법
 *
 * Runnable을 사용해야 할때는 단순 run 밖에 재정의를 안할때 사용하면 된다.
 * 재정의 할 메소드가 run단 하나밖에 존재하지 않기 때문이다
 *
 * 또한 다른 클래스들을 확장(extends)을 할거면 Runnable을 사용하는것을 추천한다 자바는 단일상속만 가능하기 때문이다
 */
public class CreateThreadByRunnable {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();

    }
}
