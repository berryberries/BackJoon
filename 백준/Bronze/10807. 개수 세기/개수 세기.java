import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 배열에 넣을 숫자 개수
		int num = sc.nextInt();
		// 배열
		int[] numArray= new int[num];
		//카운트
		int count=0;
	
		
		for(int i=0;i<num;i++) {
			// 배열에 입력할 숫자
			numArray[i] = sc.nextInt();	
		}
		
		// 배열에 동일한 숫자 찾기
		int b = sc.nextInt();
		
		for(int j=0;j<numArray.length;j++) {
			if(b==numArray[j]) {
				
				count++;
			}
		}

		
		System.out.println(count);
		
	}

}