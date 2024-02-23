package com.newzhxu;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class LearnWebfluxApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(LearnWebfluxApplication.class)
                .headless(false)
                .run(args);
    }
}
