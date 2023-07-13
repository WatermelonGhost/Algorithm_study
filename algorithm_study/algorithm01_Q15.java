// n단 피라미드를 출력하는 메서드를 작성하세요.
public class algorithm01_Q15 {

	public static void main(String[] args) {
		spira(5);
	}
	static void spira(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i-1); j++) {
				System.out.print("*");
			}
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
