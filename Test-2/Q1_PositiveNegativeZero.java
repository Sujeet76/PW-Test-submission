public class Q1_PositiveNegativeZero{
  public static void main(String[] args) {
    int num = 4;
    // int num = -3;
    // int num = 0;
    checkNum(num);
  }

  // method
  public static void checkNum(int num){
    if(num > 0){
      System.out.println("Given number is greater then zero(positive)");
    }else if(num < 0){
      System.out.println("Given number is greater then zero(negative)");
    }else{
      System.out.println("Given number is zero");
    }
  }
}