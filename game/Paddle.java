package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Paddle extends Sprite {
    private int dx;
    
    public Paddle() {
        initPaddle();
    }
    
    private void initPaddle() {
        // Set the paddle dimensions
        this.width = 60; // You can adjust this value for the paddle width
        this.height = 10; // You can adjust this value for the paddle height
        
        resetState();
    }
    
    void move() {
        x += dx;
        
        if (x <= 0) {
            x = 0;
        }
        
        if (x >= Commons.WIDTH - width) {
            x = Commons.WIDTH - width;
        }
    }
    
    void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
        }
        
        if (key == KeyEvent.VK_RIGHT) {
            dx = 1;
        }
    }
    
    void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
        
    }
    
    private void resetState() {
        x = Commons.INIT_PADDLE_X;
        y = Commons.INIT_PADDLE_Y;
    }

    // Override the draw method to draw a filled rectangle
    @Override
    void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(x, y, width, height);
    }
}
