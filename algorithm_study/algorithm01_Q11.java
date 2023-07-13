
public class algorithm01_Q11 {

	public static void main(String[] args) {
//		위쪽과 왼쪽에 곱하는 수가 있는 구구단 곱셈표를 출력하는 프로그램을 작성하라.
		System.out.print("    |");
		for(int i=1; i<10; i++) {
			System.out.printf("%3d",i);
		}
		
		System.out.println();
		System.out.println(" ---+----------------------------");
		
		for(int i=1; i<10; i++) {
			System.out.print("  "+i+" |");
			for(int j=1; j<10; j++) {
				System.out.printf("%3d",i*j);
			}
			System.out.println();
		}
		
	}

}
