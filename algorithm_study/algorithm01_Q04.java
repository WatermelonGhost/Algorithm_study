
public class algorithm01_Q04 {
	public static void main(String[] args) {
		System.out.println(med3(4,2,3));
	}
	static int med3(int a, int b, int c) {
		if(a>=b) {
			if(a<=c) return a;
			else if(b>=c) return b;
			else return c;
		}else if(a>c) {
			return a;
		}else if(b>c) {
			return c;
		}else
			return b;
	}
}

	