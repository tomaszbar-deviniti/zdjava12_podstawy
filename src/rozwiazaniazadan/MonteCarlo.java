package rozwiazaniazadan;

import solutions.sol1.Point;

import java.util.Random;

public class MonteCarlo {
    public static void main(String[] args){
        for(int i=10;i<=500;i+=10) {
            System.out.println(getPiFromPoints(i));
        }
    }
    
    //bardzo fajnie roziwązane! z użyciem klasy Point :) można by tylko pominąć tworzenie tablicy pointsArrray i od razy zliczać
//pubkty, które "wpadły" do koła i wszystkie punkty

    public static double getPiFromPoints(int numberOfPoints){
        Point[] pointsArray = new Point[numberOfPoints];
        int pointsInCircle = 0;
        for(int i=0;i<pointsArray.length;i++){
            pointsArray[i] = new Point(new Random().nextDouble()*20-10,new Random().nextDouble()*20-10);
            if(pointsArray[i].getDistanceFromZero() <= 10){
                pointsInCircle++;
            }
        }
        return (4.0*pointsInCircle)/numberOfPoints;
    }
}
