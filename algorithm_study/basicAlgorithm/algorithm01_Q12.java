
public class algorithm01_Q12 {

	public static void main(String[] args) {
//		구구단 곱셈표를 변형하여 곱셈이 아니라 덧셈을 출력하는 프로그램을 작성하라
		System.out.print("    |");
		for(int i=1; i<10; i++) {
			System.out.printf("%3d",i);
		}
		
		System.out.println();
		System.out.println(" ---+----------------------------");
		
		for(int i=1; i<10; i++) {
			System.out.print("  "+i+" |");
			for(int j=1; j<10; j++) {
				System.out.printf("%3d",i+j);
			}
			System.out.println();
		}
		
	}

}
