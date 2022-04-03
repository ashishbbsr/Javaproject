package first;

public class Binary_search {
	public static int binary(int arr[],int li,int hi, int key) {
		while(li<=hi) {
			int mi=li+(hi-li)/2;
			if(arr[mi]==key)
				return mi;
			if(arr[mi]<key) return binary(arr,mi+1,hi,key);
			else return binary(arr,li, mi-1, key);
		}
		return -1;
	}
	public static void main(String[] args) {
		int a[]= {12,23,33,35,36,38,45,67,70,75};
		// in binary search array is in ascending order
		int key=75;
		int result=binary(a,0,a.length-1,key);
		if(result==-1) {
		System.out.println("Element is not found ");
		}
		else {
			System.out.println("Element is found at index : "+result);
		}
	}

}
