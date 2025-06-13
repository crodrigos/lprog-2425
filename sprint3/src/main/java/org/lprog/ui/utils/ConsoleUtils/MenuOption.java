package org.lprog.ui.utils.ConsoleUtils;

public class MenuOption {

    private String header;
    private Runnable runnable;

    public MenuOption(String header, Runnable runnable) {
        this.header = header;
        this.runnable = runnable;
    }

    public String getHeader() {
        return header;
    }

    public Runnable getRunnable() {
        return runnable;
    }
}