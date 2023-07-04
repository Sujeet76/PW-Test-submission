import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3_Avg_List {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers (enter -1 to stop):");

		int input;
		// take input
		do {
			input = scanner.nextInt();
			if (input != -1) {
				numbers.add(input);
			}
		} while (input != -1);
		// calculate avg
		double sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		double average = sum / numbers.size();
		System.out.println("Average: " + average);

		scanner.close();
	}
}
