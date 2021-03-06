package com.study.thread;

public class MyThreadRunnable implements Runnable {

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println("Doing Heavy Processing - START - "+ Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            doProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Doing Heavy Processing - END - "+ Thread.currentThread().getName());
    }

    private void doProcessing() throws InterruptedException {
        Thread.sleep(5000);
    }
}
