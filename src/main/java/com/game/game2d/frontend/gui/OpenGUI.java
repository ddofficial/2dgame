package com.game.game2d.frontend.gui;

import com.game.game2d.Session;
import com.game.game2d.configure.Config;

import javax.swing.*;

public class OpenGUI {
    public OpenGUI(){
        Session session = new Session();
        Config conf = new Config();
        session.frame = new JFrame(conf.game_name);
        session.frame.setSize(conf.win_width,conf.win_height);
        session.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        session.frame.setLocationRelativeTo(null);
        session.frame.setVisible(true);
    }
}
