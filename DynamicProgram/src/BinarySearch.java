
public class BinarySearch {

	
	public int search(int startIndex,int endIndex,int[] arr,int element){
		
		
		int mid = (startIndex + endIndex) /2;
		
		if(arr[mid] == element) 
			return mid;
		else if(arr[mid]<element)
			return search(mid,endIndex,arr,element);
		else if(arr[mid]>element)
			return search(startIndex,mid,arr,element);
		//If element not found
		return -1;
	}
	
	public static void main(String[] args) {
		int[]  a = {5,6,9,10,23,45,76,89,99};
		BinarySearch bSearch = new BinarySearch();
		int position = bSearch.search(0,a.length,a,6);
		System.out.println(position);
	}

}
