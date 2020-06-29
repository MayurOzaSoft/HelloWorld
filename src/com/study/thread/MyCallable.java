package com.study.thread;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MyCallable implements Callable<String> {
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return Thread.currentThread().getName();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<String>> futureList = new ArrayList<>();

        Callable<String> stringCallable = new MyCallable();

        for (int i = 0; i < 100; i++) {
            Future<String> stringFuture = executorService.submit(stringCallable);
            futureList.add(stringFuture);
        }

        for (Future<String> stringFuture : futureList) {
            System.out.println(LocalTime.now() + " :: " + stringFuture.get());
        }

        executorService.shutdown();
    }
}
