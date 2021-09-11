package week1.day2;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 1, 3, 4, 7, 8, 10, 2, 2, 7, 7, 20 };
		int[] num1 = new int[num.length];
		int count = -1, frequency = 1;
		;
		for (int i = 0; i < num.length; i++) {
			if (num1[i] != -1) {
				for (int j = i+1; j < num.length; j++) {
					if (num[i] == num[j]) {
						num1[j] = count;
						frequency++;
					}
				}
				num1[i] = frequency;
				frequency = 1;
			}
		}
		for (int i = 0; i < num1.length; i++) {
			if (num1[i] == -1) {
				continue;
			}
			System.out.println("The element " + num[i] + " occurred " + num1[i] + " times");
			;
		}

	}

}
