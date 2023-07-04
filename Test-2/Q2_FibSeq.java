public class Q2_FibSeq {
  public static void main(String[] args) {
    int num = 3;
    fibonacciSeries(num);
  }

  // method
  public static void fibonacciSeries(int num) {
    // considering 1 index
    int prev = 0;
    int curr = 1;
    if (num == 1) {
      System.out.print(prev);
      return;
    } else if (num == 2) {
      System.out.print(prev + " ");
      System.out.print(curr + " ");
      return;
    }
    System.out.print(prev + " ");
    System.out.print(curr + " ");
    for (int i = 3; i <= num; i++) {
      int next = prev + curr;
      System.out.print(next + " ");
      prev = curr;
      curr = next;
    }
    System.out.println();
  }
}
