package com.newzhxu;

import org.springframework.context.annotation.Configuration;

@Configuration

public class TestAutoConfig {

    public static void main(String[] args) throws InterruptedException {
        Thread.ofVirtual().name("asdsad").start(()->{
            System.out.println("Hello world!");
            System.out.println(Thread.currentThread().getName());
            System.out.println("Hello world!");
        });

        new Thread(()->{
            System.out.println("Hello world!");
            System.out.println(Thread.currentThread().getName());
            System.out.println("Hello world!");
        }).start();
    }
}
