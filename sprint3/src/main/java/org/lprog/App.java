package org.lprog;

import org.lprog.repo.RepoStore;

public class App {

    private static App instance;

    public final RepoStore Repos = new RepoStore();

    private App() {
    }

    public static App getInstance() {
        if (instance == null) {
            synchronized (App.class) {
                if (instance == null) {
                    instance = new App();
                }
            }
        }
        return instance;
    }

    public void run() {
        System.out.println("App is running...");
    }

    public static void main() {
        App app = App.getInstance();
        app.run();
    }
}