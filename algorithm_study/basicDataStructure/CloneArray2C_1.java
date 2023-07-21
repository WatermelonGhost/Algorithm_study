// 배열을 복제
package basicDataStructure;

import java.util.Arrays;

public class CloneArray2C_1 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = a.clone();
		
		b[3] = 0;
		
		System.out.println("a = " + Arrays.toString(a));
		System.out.println("b = " + Arrays.toString(b));
	}

}
