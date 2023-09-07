import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N];
		
		
		for(int i=0; i<N;i++) {
			array[i] =sc.nextInt();
		}
		
		// max와 min의 초기값은 배열 입력받고나서 
		// 초기화를 할 수 있다
		int max = array[0];
		int min = array[0];
		
		for(int j=0; j<N;j++) {
			if(max<array[j]) {
				max=array[j];
			}
			
			if(min>array[j]) {
				min=array[j];
			}
		}
		
	System.out.println(min +" "+ max);
		
	}

}