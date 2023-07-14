// 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요.
package dataStructure;

import java.util.Random;

public class exerciseQ3 {
	
	static int sumOf(int[] a) {
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] ar = new int[5];
		
		for(int i=0; i<ar.length; i++) {
			ar[i] = ran.nextInt(10);
			System.out.println("ar["+i+"]: "+ar[i]);
		}
		
		
		
		System.out.println("sumOf(ar) = "+sumOf(ar));
	}

}
