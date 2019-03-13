package com.akikun.tetris.ui;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Toolkit;
import java.awt.Dimension;

public class FrameGame extends JFrame {

    public FrameGame() {

        this.setTitle("俄罗斯方块");

        // 点红叉叉默认关闭
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 设置游戏窗口长宽大小，并且不允许改变窗口大小
        this.setSize(1200, 700);
        this.setResizable(false);

        // 游戏窗口居中
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screen = toolkit.getScreenSize();
        int gameX = (screen.width  - this.getWidth())  / 2;
        int gameY = (screen.height - this.getHeight()) / 2;
        this.setLocation(gameX, gameY);

    }
}
