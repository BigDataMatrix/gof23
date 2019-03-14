package com.gof.jdk;

import java.util.concurrent.*;

public class Tp1 {

    static ThreadPoolExecutor tpe = new CustomTpe(10, 10, 1L, TimeUnit.MINUTES,
            new LinkedBlockingQueue<Runnable>(5), new ThreadFactory() {
                public Thread newThread(Runnable r) {
                    Thread t = new Thread(r, "自定义线程");
                    t.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                        public void uncaughtException(Thread t, Throwable e) {
                            System.out.println("线程 "+t.getId()+" "+t.getName()+" 发生未捕获异常...");
                        }
                    });
                    return t;
                }
    }, new RejectedExecutionHandler(){
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            System.out.println("处理不过来了");
        }
    });

    public static void main(String[] args) {

        for(int lp = 0; lp <= 20; lp ++){
            tpe.submit(new Runnable() {
                public void run() {
                    System.out.println("提交一个任务~~~~");
                    try {
                        Thread.sleep(1000L * 30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

    }



}
