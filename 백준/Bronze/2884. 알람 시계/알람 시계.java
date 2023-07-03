import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int m = sc.nextInt();
		
		if(m<45) {
			
			H--;
			m = 60 - (45-m);
			
			if(H<0) {
				H=23;
			}
			System.out.println(H + " " + m);
		}else {
			System.out.println(H + " " + (m - 45));
		}


	}
}