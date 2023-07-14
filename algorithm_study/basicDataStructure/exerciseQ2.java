// 배열 요소를 역순으로 정렬하는 과정을 하나휴ㅏ나 나타내는 프로그램을 작성하시오
package dataStructure;

import java.util.Arrays;
import java.util.Random;

public class exerciseQ2 {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for(int i=0; i<a.length/2; i++) {
			swap(a, i,a.length-i-1);
			System.out.println("a["+i+"]과 a["+(a.length-i-1)+"]을 교환합니다.");
			System.out.println(Arrays.toString(a));
		}
	}
	
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] ar = new int[5];
		
		for(int i=0; i<ar.length; i++) {
			ar[i] = ran.nextInt(10);
			System.out.println("ar["+i+"]: "+ar[i]);
		}
		
		System.out.println(Arrays.toString(ar));
		
		reverse(ar);
		
		System.out.println("역순 정렬을 마쳤습니다.");
	}

}
