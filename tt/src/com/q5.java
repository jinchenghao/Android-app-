/*ţţ�õ���һ���ر�ͼ��˳�Ųر�ͼ��ָʾ��ţţ������һ���ر��У��ر�������һ�����أ�����ÿ�λ���ʾ�����ַ��� s �� t�����ݹ��ϵĴ�˵��
ţţ��Ҫÿ�ζ��ش� t �Ƿ��� s �������С�ע�⣬�����в�Ҫ����ԭ�ַ������������ģ����紮 abc�����������о��� {�մ�, a, b, c, ab, ac, bc, abc} 8 �֡� 
��������:
ÿ���������һ������������ÿ�����������������г��Ȳ����� 10 �Ĳ������ո�Ŀɼ� ASCII �ַ�����


�������:
���һ�� ��Yes�� ���� ��No�� ��ʾ�����

��������:
x.nowcoder.com
ooo

�������:
Yes*/
package com;

import java.util.Scanner;

public class q5 {
	public static void main(String[] argv){
		Scanner scanner= new Scanner(System.in);
		String s1 = scanner.next();
		String s2 = scanner.next();
		int i=0,j=0;
		while(i<s1.length() && j<s2.length()){
			if(s1.charAt(i) == s2.charAt(j)){
				i++;
				j++;
			}
			else i++;
		}
		if(j==s2.length()) System.out.print("Yes");
		else System.out.print("No");
			
	}
}
