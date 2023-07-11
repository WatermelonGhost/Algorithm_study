
public class algorithm01_Q2 {
	public static void main(String[] args) {
		System.out.println(min3(9,8,7));
	}
	static int min3(int a, int b, int c) {
		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;
		return min;
	}
}
