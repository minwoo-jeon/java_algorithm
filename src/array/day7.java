package array;

import java.util.Scanner;

public class day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        int sum=0;
        int cnt=0;

        for (int i = 0; i < num; i++) {
             arr[i] = sc.nextInt();
        }

        for (int i = 0; i < num; i++) {
            if (arr[i] == 1) {
                cnt++;
                sum += cnt;
            }else {
                cnt=0;
            }
        }
        System.out.println(sum);
    }
}
