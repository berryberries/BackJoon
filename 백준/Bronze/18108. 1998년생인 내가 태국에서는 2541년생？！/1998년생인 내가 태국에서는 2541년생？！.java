import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
	
		// 불기 원년 544를 서기 년도에 더해준다.(일부국가 543)
		// 불기에서 서기를 구하는 거니까 입력값 - 543
		System.out.println(a-543);
		
	}

}