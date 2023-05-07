package game;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Sprite {
	
    private int xdir;
    private int ydir;
    
    public Ball() {
        initBall();
    }
    
    private void initBall() {
        xdir = 1;
        ydir = -1;
        
        // Set the ball dimensions
        this.width = 10; // You can adjust this value for the ball diameter
        this.height = 10; // You can adjust this value for the ball diameter
        
        resetState();
    }
    
    void move() {
        x += xdir;
        y += ydir;
        
        if (x == 0) {
            setXDir(1);
        }
        if (x == Commons.WIDTH - width) {
            setXDir(-1);
        }
        if (y == 0) {
            setYDir(1);
        }
    }
    
    private void resetState() {
        x = Commons.INIT_BALL_X;
        y = Commons.INIT_BALL_Y;
    }
    
    void setXDir(int x) {
        xdir = x;
    }
    
    void setYDir(int y) {
        ydir = y;
    }
    
    int getXDir() {
        return xdir;
    }
    
    int getYDir() {
        return ydir;
    }

    // Override the draw method to draw a filled circle
    @Override
    void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillOval(x, y, width, height);
    }
}
