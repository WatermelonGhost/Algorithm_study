// 배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성하시오.
package dataStructure;

import java.util.Arrays;
import java.util.Random;

public class exerciseQ4 {
	
	static void copy(int[] a, int[] b) {
		
		for(int i=0; i<a.length; i++) {
			a[i] = b[i];
		}
		
	}

	public static void main(String[] args) {
		int[] arA = new int[5];
		int[] arB = new int[5];
		Random ran = new Random();
		
		for(int i=0; i<arB.length; i++) {
			arB[i] = ran.nextInt(10);
			System.out.println("arB["+i+"] = "+arB[i]);
		}
		System.out.println("arB = "+Arrays.toString(arB));
		
		copy(arA,arB);
		
		System.out.println("arA = "+Arrays.toString(arA));
	}
}
