package com.joey.learn.canal;

import com.wwjd.starter.canal.annotation.EnableCanalClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: wangyw
 * @Description:
 * @Date: 2019/10/22
 */
@SpringBootApplication
@EnableCanalClient
public class Application {
    public static  void main(String... args){
        SpringApplication.run(Application.class,args);
    }
}
