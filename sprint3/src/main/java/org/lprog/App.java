package org.lprog;

import org.lprog.bootstrap.RepoBootstrap;
import org.lprog.repo.RepoStore;
import org.lprog.ui.MainMenu;

public class App implements Runnable {

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

    @Override
    public void run() {
        new RepoBootstrap().run();
        new MainMenu().run();
    }
}