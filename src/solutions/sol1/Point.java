package solutions.sol1;

public class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistanceFromZero(){
        return Math.sqrt((Math.pow(x,2) + Math.pow(y,2)));
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void showCoordinates(){
        System.out.println("("+x+","+y+")");
    }
    public void incrementCoordinate(String coordinate) {
        if (coordinate.toLowerCase() == "x") {
            x++;
        } else if(coordinate.toLowerCase() == "y"){
            y++;
        } else {
            System.out.println("Nie ma takiej współrzędnej");
        }
    }
    public void increaseCoordinate(String coordinate, int value) {
        if (coordinate.toLowerCase() == "x") {
            x += value;
        } else if(coordinate.toLowerCase() == "y"){
            y += value;
        } else {
            System.out.println("Nie ma takiej współrzędnej");
        }
    }
    public static void main(String[] args){
        Point point = new Point(10,12);
        point.showCoordinates();
        point.incrementCoordinate("x");
        point.showCoordinates();
        point.increaseCoordinate("y",20);
        point.showCoordinates();
    }
}