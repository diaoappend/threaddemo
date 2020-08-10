package com.diao;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import javafx.concurrent.Task;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author: chenzhidiao
 * @date: 2020/8/9 9:28
 * @description: 线程创建的方式
 * @version: 1.0
 */
public class ThreadCreate {
    public static void main(String[] args) {
        Thread2 thread2 = new Thread2();
        thread2.start();
        Thread thread1 = new Thread(new Thread1());
        thread1.start();
        new ThreadFactoryBuilder();
        ThreadPoolExecutor service = new ThreadPoolExecutor(3, 3, 14, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
        service.execute(new Thread1());
    }

}

class Thread1 implements Runnable{

    public void run() {
        System.out.println("实现Runnable接口");
    }
}

class Thread2 extends Thread{


    public void run(){
        System.out.println("继承Thread类");
    }

}