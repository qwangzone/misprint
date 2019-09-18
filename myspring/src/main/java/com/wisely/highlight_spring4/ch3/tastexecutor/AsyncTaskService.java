package com.wisely.highlight_spring4.ch3.tastexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
//@Async
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务："+ i);
    }

    @Async
    public void executeAsyncTaskplus(Integer i){
        System.out.println("执行异步任务+1："+(i+1));
    }
}
