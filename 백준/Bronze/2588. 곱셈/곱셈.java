import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		sc.nextLine();
		String B = sc.nextLine();
		
		char[] arr = B.toCharArray();
		
		int[] numbers = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(String.valueOf(arr[i]));
        }
		
		System.out.println(A*numbers[2]);
		System.out.println(A*numbers[1]);
		System.out.println(A*numbers[0]);		
		System.out.println((A*numbers[0])*100 + (A*numbers[1])*10 + A*numbers[2]);

	
	}

}