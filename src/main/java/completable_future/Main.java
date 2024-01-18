package completable_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        runAsync();
        supplyAsync();
    }

    public static void runAsync() throws ExecutionException, InterruptedException {
        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.runAsync(() ->
                System.out.println("RunAsync Future Thread: " + Thread.currentThread().getName())
        );

        voidCompletableFuture.get();
        System.out.println("RunAsync Main Thread: " + Thread.currentThread().getName());
    }

    public static void supplyAsync() throws ExecutionException, InterruptedException {
        CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() ->
                "SupplyAsync Future Thread: " + Thread.currentThread().getName()
        );

        System.out.println(stringCompletableFuture.get());
        System.out.println("SupplyAsync Main Thread: " + Thread.currentThread().getName());

    }
}
