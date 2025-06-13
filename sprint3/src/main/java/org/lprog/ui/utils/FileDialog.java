package org.lprog.ui.utils;

import javax.swing.*;
import java.io.File;

public class FileDialog {

    private JFrame frame;
    public FileDialog() {
        frame = new JFrame();

        frame.setVisible(true);
        BringToFront();
    }
    public File getFile() {
        JFileChooser fc = new JFileChooser();
        if(JFileChooser.APPROVE_OPTION == fc.showOpenDialog(null)){
            frame.setVisible(false);
            return fc.getSelectedFile();
        } else {}
        return null;
    }

    private void BringToFront() {
        frame.setExtendedState(JFrame.ICONIFIED);
        frame.setExtendedState(JFrame.NORMAL);

    }

}
