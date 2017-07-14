package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.FunnyBird;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = FunnyBird.WIDTH;
		config.height = FunnyBird.HEIGHT;
		config.title = FunnyBird.TITLE;
		new LwjglApplication(new FunnyBird(), config);
	}
}
