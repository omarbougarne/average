package average;

import java.util.Scanner;

public class Average{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first number:\t");
    int number1 = scanner.nextInt();
    System.out.println("Enter second number:\t");
    int number2 = scanner.nextInt();
    System.out.println("Enter third number:\t");
    int number3 = scanner.nextInt();
    int result = number1 + number2 +number3;
    int average = (result/3);
    System.out.print("the result is\t" + result + "\tthe average is\t" + average);
    scanner.close();
  }
}
