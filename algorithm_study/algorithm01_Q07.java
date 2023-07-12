
public class algorithm01_Q07 {

	public static void main(String[] args) {
		/* 1~10의 합은 (1+10)*5와 같이 구할 수 있다.
		 * 이를 '가우스의 덧셈'이라고 하는데
		 * 이 방법을 이용하여 1부터 n까지 정수의 합을 구하라.
		 * */
		int sum = 0;
		
		for(int i=1; i<=5; i++) {
			sum += i+(11-i);
		}
		System.out.println(sum);
	}

}
