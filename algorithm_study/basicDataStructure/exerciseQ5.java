// 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 rcopy를 작성하시오.
package dataStructure;

import java.util.Arrays;
import java.util.Random;

public class exerciseQ5 {
	
	static void rcopy(int[] a, int[] b) {
		
		for(int i=0; i<b.length; i++) {
			a[a.length-i-1] = b[i];
		}
	}
	
	public static void main(String[] args) {
		int num = 5;
		Random ran = new Random();
		int[] arA = new int[num];
		int[] arB = new int[num];
		
		for(int i=0; i<num; i++) {
			arB[i] = ran.nextInt(10);
			
			System.out.println("arB["+i+"] = "+arB[i]);
		}
		System.out.println("arB = "+Arrays.toString(arB));
		
		rcopy(arA,arB);
		
		System.out.println("arA = "+Arrays.toString(arA));
		
	}
}
