package com.newzhxu;

import lombok.Cleanup;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

@Slf4j
public class RejectedExecutionExceptionTest {
    public static void main(String[] args) {
        int corePoolSize = 3; //线程池维护线程的最少数量
        int maxPoolSize = 5; //线程池维护线程的最大数量
        long keepAliveTime = 1; //线程池维护线程所允许的空闲时间（解释：当线程池的数量超过corePoolSize时，多余的空闲线程的存活时间。）
        //缓存队列可以放多少个线程
        BlockingDeque<Runnable> queue = new LinkedBlockingDeque<>(2);
        RejectedExecutionHandler rejectedExecutionHandler = new ThreadPoolExecutor.AbortPolicy();
        ThreadFactory factory = (Runnable r) -> {
            //创建一个线程
            Thread t = new Thread(r);
            //给创建的线程设置UncaughtExceptionHandler对象 里面实现异常的默认逻辑
            Thread.setDefaultUncaughtExceptionHandler((Thread thread1, Throwable e) -> {
                log.error("线程池执行任务异常", e);
            });
            return t;
        };
        //创建一个线程池
        @Cleanup
        ExecutorService executor = new ThreadPoolExecutor(corePoolSize, maxPoolSize, keepAliveTime, TimeUnit.SECONDS, queue, factory, rejectedExecutionHandler);
        executor.execute(() -> {
            System.out.println("线程池执行任务1");
            throw new RuntimeException("线程池执行任务1异常");
        });
    }


}