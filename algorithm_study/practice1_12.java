import java.util.Scanner;

public class practice1_12 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("+와 -를 번갈아서 n개 출력합니다.");
		
		System.out.println("n의 값 : ");
		n =stdIn.nextInt();
		
//		for(int i=0; i<n;i++) {
//			if(i%2 == 0) {
//				System.out.print("+");
//			}else {
//				System.out.print("-");
//			}
//		}
		
//		for(int i=1; i<=n; i++) {
//			if(i%2 == 0) {
//				System.out.print("-");
//			}else {
//				System.out.print("+");
//			}
//		}
		
		for(int i=0; i<n/2;i++) {
			System.out.print("+-");
		}
		
		if(n%2 != 0) {
			System.out.print("+");
		}
	}

}
