package com.study.thread;

public class MyThread extends Thread {

    /**
     * If this thread was constructed using a separate
     * {@code Runnable} run object, then that
     * {@code Runnable} object's {@code run} method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of {@code Thread} should override this method.
     *
     * @see #start()
     * @see #stop()
     * @see #Thread(ThreadGroup, Runnable, String)
     */
    @Override
    public void run() {
        System.out.println("Doing MyThread Processing - START - "+ Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            doProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Doing MyThread Processing - END - "+ Thread.currentThread().getName());
    }

    private void doProcessing() throws InterruptedException {
        Thread.sleep(4000);
    }
}
