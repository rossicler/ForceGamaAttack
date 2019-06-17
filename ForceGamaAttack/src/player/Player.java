package player;
import jplay.Keyboard;

import jplay.Sprite;	

public abstract class Player extends Sprite{
	private Player player;
	double speed;
	String sprite = "src/graphics/img/spaceship.png";
	private Keyboard keyboard;
	
	private static final Player INSTANCE = new Player(360, 550);
	
	public Player(int x, int y, String sprite) {	
		super(sprite, 10);
		this.x = x;
		this.y = y;
		this.speed = 10.0;
	}
	
	public static Player getInstance() {
		return INSTANCE;
	}

	public void move() {
		
		player.moveY(10.0);
		player.moveX(10.0);
	}

	protected Keyboard getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}
	
}
