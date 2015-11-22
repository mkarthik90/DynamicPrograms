import java.util.*;

class DuplicateElements{


	public static void main(String arr[]){

		Map<Integer,Integer> valueMap = new HashMap<Integer,Integer>();
		int a[] = {67,34,56,34,56,23,23,5,6,4,6,9};
		for(int i=0;i<a.length;i++){
			Integer valueFromMap = valueMap.get(a[i]);
			if(valueFromMap!=null){
				valueMap.put(a[i],valueFromMap+1);
			}
			else{
				valueMap.put(a[i],1);
			}
		}	
		System.out.println("Unique Values");
		for(Map.Entry<Integer,Integer> entry : valueMap.entrySet()){
			if(entry.getValue() == 1){
				System.out.println(entry.getKey());
			}
		}

	}

}