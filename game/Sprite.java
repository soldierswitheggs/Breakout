package game;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Sprite {
    int x;
    int y;
    int width;
    int height;

    protected void setX(int x) {
        this.x = x;
    }

    int getX() {
        return x;
    }

    protected void setY(int y) {
        this.y = y;
    }

    int getY() {
        return y;
    }

    int getWidth() {
        return width;
    }

    int getHeight() {
        return height;
    }

    Rectangle getRect() {
        return new Rectangle(x, y, width, height);
    }

    // Add a draw method that subclasses can override
    void draw(Graphics g) {
        // Default implementation does nothing
    }
}
