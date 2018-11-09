package com;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame=getFrame();
        JPanel jPanel=new JPanel();
        jFrame.add(jPanel);
        JButton jButton=new JButton("Submit");
      //  jButton.setDebugGraphicsOptions(DebugGraphics.LOG_OPTION);
        jPanel.add(jButton);

        RepaintManager.currentManager(jFrame.getRootPane()).setDoubleBufferingEnabled(false);
        ((JComponent)jFrame.getContentPane()).setDebugGraphicsOptions(DebugGraphics.FLASH_OPTION);
    }
    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 500);
        return jFrame;

    }
}
