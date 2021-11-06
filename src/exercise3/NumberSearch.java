package exercise3;

import java.util.Scanner;

public class NumberSearch {
  public static void main(String []args) {
    Scanner input = new Scanner(System.in);
    int counter = 0;
    for (int i = 100; i < 1000; i++) {
      if (counter < 9) {
      if (i%5 == 0 && i%6 == 0) {
      System.out.print(i + " ");
      counter++;
      }
      }else {
      if (i%5 == 0 && i%6 == 0) {
        System.out.println(i);
        counter = 0;
      }
      }
    }
  }
}