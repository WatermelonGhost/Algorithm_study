import java.util.Scanner;

public class practice1_09 {

	public static void main(String[] args) {
		//양수만 입력받아 1부터 n까지의 합 구하기

		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구하라.");
		
		do {
			System.out.println("n값 : ");
			n = stdIn.nextInt();
		}while(n<=0);
		
		int sum = 0;
		
		for(int i=0; i<=n; i++) {
			sum+=i;
		}
		System.out.println("1부터 "+n+"까지의 합은"+sum+"입니다.");
	}

}
