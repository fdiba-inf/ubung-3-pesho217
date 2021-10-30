package exercise3;

import java.util.Scanner;
import java.lang.Math;

public class Triangle {
  public static void main(String []args) {
    Scanner input = new Scanner(System.in);

    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    double p;
    double S;

    do {
      if ((a + b) > c && (a + c) > b && (b + c) > a) {
        p = (a + b +c)/2;
        S = Math.sqrt(p*(p - a)*(p - b)*(p - c));
        System.out.println("Area: " + S);
        if (a == b || a == c || b == c ) {
          System.out.println("Triangle: isosceles");
          break;
        } else if (a == b && c == b && a == c) {
          System.out.println("Triangle: equilateral");
          break;
        } else {
          System.out.println( "Triangle: scalene");
          break;
        } 
        } else {
          System.out.println("Values are not correct");
          break;
      } 
    } while ( a > 0 && b > 0 && c > 0);
  }
}