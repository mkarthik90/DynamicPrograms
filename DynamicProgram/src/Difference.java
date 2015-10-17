import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Difference {

	public static void main(String[] args) {

		String a = "-11 1 1 2 5 4 5 8 6 421 1";
		
		String[] arr = a.split(" "); 
		int[] values = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			values[i] = Integer.parseInt(arr[i]);
		}

		// Sorting the array
		Arrays.sort(values);
		int minDifference = 0;
		int finalMinDifference = 0;
		List<Integer> listOfDifferenceValues = new ArrayList<Integer>();
		
		for (int i = 1; i < values.length; i++) {
			minDifference = values[i] - values[i - 1];
			//If its first value add it to the list since it will be the least difference.
			if (i==1 | minDifference < finalMinDifference) {
				listOfDifferenceValues.clear();
				finalMinDifference = minDifference;
			}
			if (minDifference == finalMinDifference) {
				listOfDifferenceValues.add(values[i]);
				listOfDifferenceValues.add(values[i - 1]);
			}
		}

		StringBuffer finalOutput = new StringBuffer();
		finalOutput.append(finalMinDifference);
		for (int i = 0; i < listOfDifferenceValues.size(); i = i + 2) {
			finalOutput.append(" ");
			finalOutput.append(String.valueOf(listOfDifferenceValues.get(i)));
			finalOutput.append(" ");
			finalOutput.append(String.valueOf(listOfDifferenceValues.get(i + 1)));
		}
		System.out.println(finalOutput);
	}

}
