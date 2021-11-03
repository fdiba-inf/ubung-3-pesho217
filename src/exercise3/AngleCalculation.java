package exercise3;

import java.util.Scanner;
import java.lang.Math;

public class AngleCalculation {

  public static void main(String []args) {

    Scanner input = new Scanner(System.in);
    int winkel = input.nextInt();
    char ch = input.next().charAt(0);
    double radiant;
    double grad;

    do {
      if ( ch == 'r' ) {
        grad = (winkel*180)/Math.PI;
        System.out.println("Angle: " + grad );
        
      } else {
        radiant = (winkel*Math.PI)/180;
        System.out.println("Angle: " + radiant );


      } 
      ch = input.next().charAt(0);
      
    }while (ch == 'r' || ch == 'd');
  }
}