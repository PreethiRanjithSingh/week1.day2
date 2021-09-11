package week1.day2;

public class MissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 3, 4, 5, 6, 7 };
		for (int i = 0; i <= numbers.length; i++) {
			if (numbers[i] != i + 1) {
				numbers[i] = numbers[i] - 1;
				System.out.println("The missing number in the given array is " + numbers[i]);
				break;
			}
		}

	}

}
