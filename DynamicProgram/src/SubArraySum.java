public class SubArraySum {

	public int maxSubArray(int[] arrayElements) {
		int finalMaxSum = 0;
		int currentMaxSum = 0;
		for (int i = 0; i < arrayElements.length; i++) {
			currentMaxSum = currentMaxSum + arrayElements[i];
			// Included for the first element alone. Irrespective of value of
			// first element, it is the greatest in the array.
			if (i == 0 | currentMaxSum > finalMaxSum) {
				finalMaxSum = currentMaxSum;
			}
			if (currentMaxSum < 0) {
				currentMaxSum = 0;
			}
		}
		System.out.println("Maximum sum of Sub Array" + finalMaxSum);
		return 0;
	}

	public static void main(String[] args) {
		int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		SubArraySum subArraySum = new SubArraySum();
		subArraySum.maxSubArray(arr);

		// Testing for all negative numbers
		int arr1[] = { -6, -3, -1, -5, -2 };
		subArraySum.maxSubArray(arr1);

		// Third test case
		int arr2[] = { 100, -2, -3, 12, 23, 45, 34, 56, -1, -5, 200, -6 };
		subArraySum.maxSubArray(arr2);
	}

}
