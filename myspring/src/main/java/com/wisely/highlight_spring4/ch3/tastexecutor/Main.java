package com.wisely.highlight_spring4.ch3.tastexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService taskService = context.getBean(AsyncTaskService.class);
        for (int i=0;i<10;i++){
            taskService.executeAsyncTask(i);
            taskService.executeAsyncTaskplus(i);
        }
        context.close();
    }
}
