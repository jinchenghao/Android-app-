/*ţţ�볢��һЩ�µ�����ÿ��������ҪһЩ��ͬ�Ĳ��ϣ���������е�������Ҫ׼�������ֲ�ͬ�Ĳ��ϡ� 
��������:
ÿ��������� 1 ������������ÿ�����������ĵ� i �У���ʾ��ɵ� i ��������Ҫ��Щ���ϣ����������ÿո����������ֻ������дӢ����ĸ�Ϳո������ļ������� 50 �У�ÿһ�в����� 50 ���ַ���


�������:
���һ��һ�����ֱ�ʾ�������������Ҫ�����ֲ�ͬ�Ĳ��ϡ�

��������:
BUTTER FLOUR
HONEY FLOUR EGG

�������:
4*/
package com;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class q1 {


    public static void main(String[] arg){
        Scanner scan=new Scanner(System.in);
        Set<String> res = new HashSet<>();
        while(scan.hasNext()){
            String s = scan.next();
            if(s.equals("end")) {
                break;
            }
            res.add(s);    
        }
        System.out.println(res.size());
        scan.close();
    }
}


