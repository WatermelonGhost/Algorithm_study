import java.util.Scanner;

public class algorithm01_Q13 {

	public static void main(String[] args) {
//		입력한 수를 한 볁으로 하는 정사각형을 *로 출력하는 프로그램을 작성하라.
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("n의 값 : ");
		n = stdIn.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
