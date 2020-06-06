package solutions.sol1;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
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