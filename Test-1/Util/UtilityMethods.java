package Util;

import java.util.Scanner;

public class UtilityMethods {
  // print element of array
  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // take input of in array
  @SuppressWarnings("unchecked")
  public static <T> void input(T[] arr, int length) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < length; i++) {
      arr[i] = (T) sc.next();
    }
    System.out.println();
    sc.close();
  }

}
