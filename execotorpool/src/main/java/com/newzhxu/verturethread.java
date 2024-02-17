package com.newzhxu;

import lombok.Cleanup;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class verturethread {
    // verturethread
    public static void main(String[] args) {
        @Cleanup
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
        executor.execute(() -> {
            System.out.println("线程池执行任务1");
            throw new RuntimeException("线程池执行任务1异常");
        });
    }
}
