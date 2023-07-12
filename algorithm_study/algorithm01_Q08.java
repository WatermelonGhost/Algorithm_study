
public class algorithm01_Q08 {

	public static void main(String[] args) {
		/* 정수 a,b를 포함하여 그사의 모든 정수의 합을 구하여 
		 * 반환하는 메서드를 작성하시오.
		 * a와 b의 대소 관계에 상관없이 합을 구하시오.
		 * ex)a=3,b=5또는 a=6,b=4와 같이
		 */
		System.out.println(sumof(5,7));
	}
	static int sumof(int a, int b) {
		int sum = 0;
		
		if(a<b) {
			for(;b>=a;a++) {
				sum += a;
			}
		}else {
			for(;a>=b;b++) {
				sum += b;
			}
		}
		return sum;
	}
}
