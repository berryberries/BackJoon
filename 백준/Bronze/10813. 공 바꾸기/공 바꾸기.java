import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//바구니 개수 1~N개
		int N = sc.nextInt();
		int [] array = new int[N];
		
		// 공을 바꾸는 횟수
		int M = sc.nextInt();
		
		//임시저장 공간 변수 = temp
		int temp;
		
		// 바구니 공 초기화
		for(int i=0; i<array.length;i++) {
			array[i]= i+1;
		}
		
		for(int j=0; j<M; j++) {
			
			// I번 바구니와 J번 바구니 선택
			int I = sc.nextInt();
			int J = sc.nextInt();
			
			// 해당 바구니들 교환
			temp = array[I-1];
			array[I-1] = array[J-1];
			array[J-1] = temp;
			
		}
		
		for(int k=0;k<array.length;k++) {
			
			System.out.print(array[k] + " ");
		}
	}

}