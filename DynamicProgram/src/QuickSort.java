
public class QuickSort {

	public int[] quickSort(int start,int end,int[] arr){


		int pivot = end;
		int wall = start;

		for(int i=start;i<=end;i++){

			if(arr[i] < arr[pivot]){
				int temp = arr[wall];
				arr[wall] = arr[i];
				arr[i] = temp;
				wall++;
			}
		}
		int temp = arr[wall];
		arr[wall] = arr[end];
		arr[end] = temp;

		if(wall != end){
			quickSort(wall,end,arr);
		}
		return arr;
	}



	
	public static void main(String arr[]){
		
		int a[] = {10, 7, 8, 9, 1, 5};
		QuickSort quick = new QuickSort();
		int[] w = quick.quickSort(0, a.length-1, a);

		for(int i=0;i<w.length;i++){
			System.out.println(w[i]);
		}

	}

}
