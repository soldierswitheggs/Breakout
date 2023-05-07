package game;

public interface Commons {
	int WIDTH = 300;
	int HEIGHT = 400;
	int BOTTOM_EDGE = 390;
	int NUM_BRICKS = 30;
	int INIT_PADDLE_X = (int)((WIDTH/3)*2);
	int INIT_PADDLE_Y = (BOTTOM_EDGE-30);
	int INIT_BALL_X = Math.min(INIT_PADDLE_X+30, WIDTH);
	int INIT_BALL_Y = (INIT_PADDLE_Y-5);
	int PERIOD = 20;
}
