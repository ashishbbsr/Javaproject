package first;

public class Fibo {

	public static void main(String[] args) {
		int first=0;
		int second=1;
		for(int i=0;i<10; i++) {
			System.out.print(first+" ");
			int next=first+second;
			first=second;
			second=next;
			
		}

	}

}
