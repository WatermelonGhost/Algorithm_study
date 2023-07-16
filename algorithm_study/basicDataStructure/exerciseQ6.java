// 기수 변환 과정을 자세히 나타내는 프로그램 작성하시오.
package dataStructure;

import java.util.Scanner;

public class exerciseQ6 {

	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int remain =0;
			
		System.out.printf("%2d|%6d\n",r,x);
		System.out.println("  +------");
		
		do {
			d[digits++] = dchar.charAt(x%r);
			remain = x%r;
			x /= r;
			if(x !=0) {
				System.out.printf("%2d|%6d ···%2d\n",r,x,remain);
				System.out.println("  +------");
			}else {
				System.out.printf("   %6d ···%2d\n",x,remain);
			}
			
			
		}while(x != 0);
		
		for(int i=0; i<digits/2; i++) {
			char t = d[i];
			d[i] = d[digits-i-1];
			d[digits-i-1] = t;
		}
		
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no,cd,dno,retry;
		char[] cno = new char[32];
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.println("변환하는 음이 아닌 정수 : ");
				no = sc.nextInt();
			}while(no<0);
			
			do {
				System.out.println("어떤 진수로 변환할까요? (2~36) : ");
				cd = sc.nextInt();
			}while(cd<2 || cd>36);
			
			dno = cardConv(no,cd,cno);
			
			System.out.print(cd+"진수로 ");
			for(int i=0; i<dno; i++) {
				System.out.print(cno[i]);
			}
			System.out.println("입니다.");
			
			System.out.println("한 번 더 할까요? (1.예/0.아니오) : ");
			retry = sc.nextInt();
		}while(retry == 1);
		
	}

}
