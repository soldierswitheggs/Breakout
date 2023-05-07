package game;

import java.awt.Color;
import java.awt.Graphics;

public class Brick extends Sprite {
    private boolean destroyed;
    private Color color;

    public Brick(int x, int y, Color color) {
        initBrick(x, y, color);
    }

    private void initBrick(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;

        // Set the brick dimensions
        this.width = 40;
        this.height = 10;

        this.destroyed = false;
    }

    boolean isDestroyed() {
        return destroyed;
    }

    void setDestroyed(boolean var) {
        destroyed = var;
    }

    // Override the draw method to draw a filled rectangle
    @Override
    void draw(Graphics g) {
        if (!destroyed) {
            g.setColor(color);
            g.fillRect(x, y, width, height);
        }
    }
}
