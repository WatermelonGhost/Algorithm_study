// 키뿐만 아니라 사람 수도 난수로 생성하도록 실습 2-4
package dataStructure;

import java.util.Random;

public class exerciseQ1 {
	static int maxOf(int[] a) {
		int max = a[0];
		
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) max = a[i];
		}
		return max;
	}
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("키의 최댓값을 구합니다.");
		int num = rand.nextInt(10);
		System.out.println("사람의 수 : "+num);
		
		int[] height = new int[num];
		
		for(int i=0; i<height.length; i++) {
			height[i] = 100+rand.nextInt(101);
			System.out.println("height["+i+"]: "+height[i]);
		}
		System.out.println("최댓값은 "+maxOf(height)+"입니다.");
		
	}

}
