import java.util.Scanner;

public class algorithm01_Q09 {
	public static void main(String[] args) {
		/* 두 변수 a,b에 정수를 입력하고
		 * b-a를 출력하는 프로그램을 작성하시오.
		 * 변수 b에 입력한 값이 a값 이하이면 변수 b 값을 다시 입력하시오.
		 */
		Scanner stdIn = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("a의 값 : ");
		a = stdIn.nextInt();
		
		do {
			System.out.println("b의 값 : ");
			b = stdIn.nextInt();
			
			if(b<=a) {
				System.out.println("a 보다 큰 값을 입력하시오.");
			}
		}while(b<=a);
		
		System.out.println("b-a = "+(b-a));
		
	}
}
