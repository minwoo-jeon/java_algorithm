package array;

import java.util.Scanner;

public class day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); //초기값
        int arr[] = new int[number];
        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
                sum += cnt;
            }else {
                cnt = 0;
            }
        }
        System.out.println(sum);
    }
}
