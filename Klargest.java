package first;

public class Klargest {

	public static void main(String[] args) {
		int a[]= {10,23,12,45,67,89,34,11,25};
		int k=4;
		for(int i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i==k-1) {
				System.out.println( k+" th largest element is "+a[i]);
			}
		}
	}

}
