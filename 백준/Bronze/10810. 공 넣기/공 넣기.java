import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int [] baskets = new int[N];
		int M = sc.nextInt();
		
		for(int i=0;i<M;i++) {
			
			int I = sc.nextInt();
			int J = sc.nextInt();
			int K = sc.nextInt();
			
			// 배열의 인덱스는 0부터 시작해서 I-1해줘야함
			for(int j=I-1;j<J;j++) {
				baskets[j]=K;
			}
		}
		for(int k=0; k<baskets.length;k++) {
			System.out.print(baskets[k] + " ");
		}
	}

}