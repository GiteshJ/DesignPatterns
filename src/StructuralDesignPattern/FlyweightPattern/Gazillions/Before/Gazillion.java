package StructuralDesignPattern.FlyweightPattern.Gazillions.Before;

public class Gazillion {
    private static int num = 0;
    private int row, col;

    public Gazillion(int maxPerRow) {
        row = num / maxPerRow;
        col = num % maxPerRow;
        num++;
    }

    public void report() {
        //System.out.print(" " + row + col);
    }
}