import java.util.Scanner;

public class algorithm01_Q10 {
	public static void main(String[] args) {
		/* 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하시오.
		 * 예를 들어 135를 입력하면 '그 수는 3자리입니다.'라고 출력하고,
		 * 1314를 입력하면 '그 수는 4자리입니다.'라고 출력합니다.
		 */
		Scanner stdIn = new Scanner(System.in);
		int n;
		int digit = 0;
		
		do {
			System.out.println("n의 값 : ");
			n = stdIn.nextInt();
			if(n<=0) {
				System.out.println("n의 값은 0보다 커야합니다.");
			}
		}while(n<=0);
		
		while(true) {
			n /= 10;
			digit++;
			if(n<1) break;
		}
		
		System.out.println("그 수는 "+digit+"자리입니다.");
	}
}
