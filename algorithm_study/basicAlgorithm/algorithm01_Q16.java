// 아래를 향한 n단의 숫자 피라미드를 출력하는 메서드를 작성하시오.
public class algorithm01_Q16 {

	public static void main(String[] args) {
		npira(9);
	}
	static void npira(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i-1); j++) {
				System.out.print(i);
			}
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}
