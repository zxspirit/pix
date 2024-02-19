package com.newzhxu.config;

import com.newzhxu.interceptor.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.Closeable;
import java.io.IOException;

@Configuration
public class WebCOnfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/*");
    }
    @Bean
    public A a() {
        return new A();
    }
    public static class A implements Closeable {
        @Override
        public void close() throws IOException {
            System.out.println("关了");
        }
    }
}
