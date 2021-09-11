package week1.day2;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 3, 4, 16, 8, 10, 2, 2, 16, 16, 20 };
		int count;
		
		for (int i = 0; i < a.length; i++) {
			count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}

			}
			if (count > 0)
				System.out.println("Duplicate Elements are: "+a[i]+" No. of occurrence: " +count);
		} 
			
		}

	}


