import java.util.Arrays;

public class ArrayIntersect {

	public static void main(String[] args) {

		int f[] = { 7, 7, 12, 13, 69 };
		int m[] = { 6910, 7010, 7, 12, 18, 15, 10450 };

		Arrays.sort(f);
		Arrays.sort(m);
		int sizeOfFemale = f.length;
		int sizeOfMale = m.length;
		int maximumValue = Math.max(f.length, m.length);
		int[] intersectArray = new int[maximumValue];
		int i = 0, j = 0, k = 0;
		while (i < sizeOfMale && j < sizeOfFemale) {
			if (m[i] < f[j]) {
				i++;
			} else if (m[i] > f[j]) {
				j++;
			} else if (m[i] == f[j]) {
				intersectArray[k] = f[j];
				// System.out.println(f[i]);
				k++;
				i++;
				j++;
			}
		}

		int j1 = 0;
		for (int i1 = 0; i1 < intersectArray.length; i1++) {
			if (intersectArray[i1] != 0)
				intersectArray[j1++] = intersectArray[i1];
		}
		int[] newArray = new int[j1];
		System.arraycopy(intersectArray, 0, newArray, 0, j1);

		int[] descendingArray = new int[newArray.length];
		for (int w = newArray.length, w1 = 0; w > 0; w1++, w--) {
			descendingArray[w1] = newArray[w - 1];
		}

	}

}
