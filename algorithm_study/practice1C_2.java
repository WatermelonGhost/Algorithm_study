import java.util.Scanner;

public class practice1C_2 {
//	논리 연산과 드모르간 법칙
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;
		
		System.out.println("2자리의 양수를 입력하시오.");
		
		do {
			System.out.println("no의 값 : ");
			no = stdIn.nextInt();
		}while(!(no>=10 && no<=99));
//		while(no<10 || no>99);
		
		System.out.println("변수 no의 값은 "+no+"이 되었습니다.");
			
	}

}
