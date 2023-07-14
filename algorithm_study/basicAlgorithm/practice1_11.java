import java.util.Scanner;

public class practice1_11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구하시오.");
		
		do {
			System.out.println("n의 값 : ");
			n = stdIn.nextInt();
		}while(n<=0);
		
		int sum = 0;
		
		for(int i=1; i<n; i++) {
			System.out.print(i+"+");
			sum+=i;
		}
		
		System.out.print(n+"="+(sum += n));
		//sum += n;
		
		//System.out.println(sum);
	}
}
