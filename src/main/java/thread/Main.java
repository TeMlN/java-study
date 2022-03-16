package thread;

public class Main {
    public static void main(String[] args) {

        Thread thread0 = new Thread(new ThreadWithRunnable());
        thread0.start();
        System.out.println("thread0.getThreadGroup() = " + thread0.getThreadGroup()); //기본으로 생성된 ThreadGroup은 최대 우선순위가 10, 이름은 main으로 자동 설정된다.

        ThreadGroup group = new ThreadGroup("myThread");
        group.setMaxPriority(7);

        Thread thread1 = new Thread(group, new ThreadWithRunnable());
        thread1.start();
        System.out.println("thread1.getThreadGroup() = " + thread1.getThreadGroup());

    }
}

