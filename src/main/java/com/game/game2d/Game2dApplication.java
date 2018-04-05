package com.game.game2d;

import com.game.game2d.frontend.gui.OpenGUI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class Game2dApplication {

	public static void main(String[] args) {
		//SpringApplication.run(Game2dApplication.class, args);
        new OpenGUI();
	}
}
