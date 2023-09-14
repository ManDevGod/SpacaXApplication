package com.example.spacexassignment.util;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class AppExecuter {

    private static AppExecuter instance;
    private final Executor executor;

    private AppExecuter(Executor executor) {
        this.executor = executor;
    }

    public static AppExecuter getInstance() {
        if (instance == null) {
            instance = new AppExecuter(Executors.newSingleThreadExecutor());
        }
        return instance;
    }

    public Executor getExecutor() {
        return executor;
    }
}
