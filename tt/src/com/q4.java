/*�����������һ��Ӷ��־��ܵ��������������������Ҫ�����ڷ���ͽ���Ĺ��̣���ѧ�Ҹ���ʵ�����ݹ��ƣ�����ڷ�������У������� x �̶ȵ���ģ�
��ô�ڽ���Ĺ����оͻ���� x2 �̶ȵ���ģ�����ɴ�������ĳ����������;öȣ��������ͻᱬը׹�١���һ���;ö�Ϊ h �ķ������������ڷ��й����в�������ģ���ôΪ�˱�֤����԰�ȫ�ĵ���Ŀ�ĵأ�ֻ���������⣬���෢������п��Գ��ܶ��ٳ̶ȵ���ģ� 
��������:
ÿ���������һ������������ÿ��������������һ��һ������ h ��1 <= h <= 10^18����


�������:
���һ��һ��������ʾ�����

��������:
10

�������:
2*/
package com;

import java.util.Scanner;

public class q4 {

	public static void main(String[] argv) {
		Scanner sca = new Scanner(System.in);
		Long h = sca.nextLong();
		Long mid = (long) 0;
		Long left = (long) Math.sqrt(h)-1, rightLong = h;
		/*
		 * Long i = sca.nextLong(); System.out.println(i*i);
		 */
		do {
			mid = (long) (left + rightLong) / 2;
			if(mid > (long) Math.sqrt(Math.pow(10, 18))){
				rightLong = mid;
				continue;
			}
			if ((mid + mid * mid <= h) && (mid + 1 + Math.pow(mid + 1, 2) > h)) {
				System.out.print(mid);
				break;
			} else if (mid + mid * mid < h) {
				left = mid;
			} else if (mid + mid * mid > h) {
				rightLong = mid;
			}
			// System.out.println("*");
		} while (left < rightLong);
		/*
		 * for(i = (long) Math.sqrt(h/2); i<Math.sqrt(h); i++){ if((i + i*i <=
		 * h) && (i+1+Math.pow(i+1, 2) > h)){ break; } } System.out.print(i);
		 */
	}

}
