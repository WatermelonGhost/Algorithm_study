// 직각이등변삼각형을 출력하는 부분을  아래와 같은 메서드로 작성하시오
public class algorithm01_Q14 {

	public static void main(String[] args) {
//		triangleLB(5);
//		triangleLU(5);
//		triangleRU(5);
		triangleRB(5);
	}
	
	// 왼쪽 아래가 직각인 이등변삼각형을 출력
	static void triangleLB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 왼쪽 위가 직각인 이등변삼각형을 출력
	static void triangleLU(int n) {
		for(int i=n; i>0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 오른쪽 위가 직각인 이등변삼각형을 출력
	static void triangleRU(int n) {
		for(int i=n; i>0; i--) {
			int sub = n-i;
			for(int j=1; j<=n; j++) {
				if(sub==0) {
					System.out.print("*");
				}else {
					System.out.print(" ");
					sub--;
				}
			}
			System.out.println();
		}
	}

	// 오른쪽 아래가 직각인 이등변삼각형을 출력
	static void triangleRB(int n) {
		for(int i=1; i<=n; i++) {
			int sub = n-i;
			for(int j=1; j<=n; j++) {
				if(sub != 0) {
					System.out.print(" ");
					sub--;
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
