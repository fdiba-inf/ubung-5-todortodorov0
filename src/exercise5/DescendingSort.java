package exercise5;

import java.util.Scanner;
import java.util.Arrays;

public class DescendingSort {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number count: ");
    int size = input.nextInt();

    int [] numbers = new int[size];

    System.out.println("Enter numbers: ");
    for (int index = 0; index < numbers.length; index++) {
      numbers[index] = input.nextInt();
    }
    
    for (int i = 0; i < numbers.length - 1; i++) {
      for (int j = 0; j < numbers.length - 1 - i; j++) {
        int next = j + 1;
        if(numbers[j] < numbers[next]) {
          int temp = numbers[j];
          numbers[j] = numbers[next];
          numbers[next] = temp;
        }
      }
    }

    String preslava = Arrays.toString(numbers);
    System.out.println("Sorted numbers: " + preslava);
  }
}