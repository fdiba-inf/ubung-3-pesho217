package exercise3;

import java.util.Scanner;
import java.lang.Math;

public class AngleCalculation {

  public static void main(String []args) {

    Scanner input = new Scanner(System.in);
    
    double radiant;
    double grad;
    char ch;

    do {
      int winkel = input.nextInt();
      ch = input.next().charAt(0);
      if ( ch == 'r' ) {
        grad = winkel/Math.PI *180;
        System.out.println("Angle: " + grad + "d" );
        
      } else {
        radiant = winkel*Math.PI/180;
        System.out.println("Angle: " + radiant + "r" );


      } 
      ch = input.next().charAt(0);
      
    }while (ch == 'r' || ch == 'd');
  }
}