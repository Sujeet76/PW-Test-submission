import Util.UtilityMethods;

public class Question_1 {
  public static void main(String[] args) {
    int arr[] = { 1, 0, 1 };
    shiftZero(arr);
    UtilityMethods.print(arr);
  }

  // Another approach -> two pointer approach
  public static void shiftZero(int[] nums) {
    int curr = 0;
    int next = 1;
    while (next < nums.length) {
      if (nums[curr] == 0 && nums[next] != 0) {
        int temp = nums[curr];
        nums[curr] = nums[next];
        nums[next] = temp;
        next++;
        curr++;
      } else if (nums[curr] != 0) {
        next++;
        curr++;
      } else {
        next++;
      }
    }

  }
}