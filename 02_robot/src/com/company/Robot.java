package com.company;

public class Robot {
    int y, x;

    public Robot () {
        this.y = 0;
        this.x = 0;
    }

    public void mover (int x, int y) {
            this.x += x;
            this.y += y;
    }

    public boolean movimientoPosible (int x, int y) {
       return (((x == 0 ^ y == 0) && ((Math.abs(x) == 1) ^ (Math.abs(y) == 1))) &&
                this.x + x > -11 && this.x + x < 11 && this.y + y > -11 && this.y + y < 11);
    }
}
