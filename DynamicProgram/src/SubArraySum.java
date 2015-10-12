public class SubArraySum {

	public int maxSubArray(int[] arrayElements) {
		int finalMaxSum = 0;
		int currentMaxSum = 0;
		for (int i = 0; i < arrayElements.length; i++) {
			currentMaxSum = currentMaxSum + arrayElements[i];
			if (currentMaxSum > finalMaxSum && currentMaxSum > 0) {
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
	}

}
