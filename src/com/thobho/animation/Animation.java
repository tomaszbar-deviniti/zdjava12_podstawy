package com.thobho.animation;

public class Animation {

    private final int xSize;
    private final int ySize;

    private int xPosition;
    private int yPosition;

    private boolean goingDown;
    private boolean goingRight;


    public Animation(int xSize, int ySize) {

        if (xSize <= 0 || ySize <= 0) {
            throw new IllegalArgumentException("Nieprawidłowe wymiary planszy");
        }

        this.xSize = xSize;
        this.ySize = ySize;
        this.xPosition = 0;
        this.yPosition = 0;
    }

    void move() {

        if (yPosition == ySize - 1) {
            goingDown = false;
        }

        if (yPosition == 0) {
            goingDown = true;
        }

        if (xPosition == xSize - 1) {
            goingRight = false;
        }

        if (xPosition == 0) {
            goingRight = true;
        }

        if (goingDown) {
            yPosition++;
        } else {
            yPosition--;
        }

        if (goingRight) {
            xPosition++;
        } else {
            xPosition--;
        }
    }

    void print() {
        clearTerminal();
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                printCell(i, j);
            }
            System.out.print("\n");
        }
    }

    private void clearTerminal(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("\n");
        };
    }

    private void printCell(int x, int y) {
        if (x == xPosition && y == yPosition) {
            System.out.print("o");
        } else {
            System.out.print("_");
        }
    }

    public static void main(String[] args) {
        Animation animation = new Animation(10, 20);
        while (true){
            animation.print();
            animation.move();

            sleep();
        }
    }

    private static void sleep(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
