package Program;

public class Duplicateelemnt {

	public static void main(String[] args) {

		// Print the duplicate element

		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2 };
		System.out.println("Duplicate Element in an array");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}

			}

		}
	}

}