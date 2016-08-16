package com;



import java.util.Scanner;
 
public class gg {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentNumber = scanner.nextInt();
        int[] student = new int[studentNumber];
        for (int i = 0; i < student.length; i++) {
            student[i] = scanner.nextInt();
        }
        int selectK = scanner.nextInt();
        int difLess = scanner.nextInt(); // λ�ò����difLess
        solve(student, selectK, difLess);
        scanner.close();
    }
 
 
    // f[i][k] ��ʾ���һ������a[i]��β������
    // f[i,k] = Max {f[j, k -1] * a[i]} (i - j <= d);
    //�����Ƚ��鷳
    //-4 5 6 -8 2 4
    // kΪ3��ʱ������������
    //����һֱû��Ac
    public static void solve(int[] student, int selectK, int difLess) {
        long[][] maxMul = new long[student.length][selectK + 1];
        long[][] minMul = new long[student.length][selectK + 1];
        long maxResult = student[0];
        for (int i = 0; i < maxMul.length; i++) {
            maxMul[i][0] = 1; // ��ʼ��Ϊ1
            minMul[i][0] = 1; // ��ʼ��Ϊ1
        }
 
        for (int i = 0; i < maxMul.length; i++) {
            maxMul[i][1] = student[i];
            minMul[i][1] = student[i];
            if(student[i] > maxResult){maxResult = student[i];}
        }
        for (int k = 2; k < maxMul[0].length; k++) {
            for (int i = 0; i < maxMul.length; i++) {
                long tempMax , tempMin, curMax = Integer.MIN_VALUE, curMin = Integer.MAX_VALUE;
                //����Ҫ��k����
                if (i < k - 1 ) {
                    maxMul[i][k] = 1;
                    minMul[i][k] = 1;
                } else {
                    // �ҳ���������j
                    for (int j = k - 2; j < i; j++) {
                        if (j >= i - difLess) {
//                           int tempMax = nums[i]*curMax;
//                           int tempMin = nums[i]*curMin;
//                           curMax = max(nums[i], tempMax, tempMin);
//                           curMin = min(nums[i], tempMax, tempMin);
//                           max = Math.max(max, curMax);
                            tempMax = maxMul[j][k - 1] * student[i];
                            tempMin = minMul[j][k - 1] * student[i];
                            curMax = Math.max(curMax, Math.max(tempMax, tempMin));
                            curMin = Math.min(curMin, Math.min(tempMax, tempMin));
                            System.out.println(maxMul[0][1]);
                            //���������Ų�ʱ���֣�int����ˣ������������,�Ժ�ǧ��ע��
//                          if(k == 6 ){
//                              System.out.println("tempMax" + student[i] + "   "+ tempMax + "  " + tempMin +  "  " + curMax);
//                          }
                        }
                        maxMul[i][k] = curMax;
                        minMul[i][k] = curMin;
                        maxResult = Math.max(maxResult, curMax);
                    }
                }
            }
        }
        System.out.println(maxResult);
    }
}