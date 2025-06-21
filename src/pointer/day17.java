package pointer;

import java.util.Arrays;
import java.util.Scanner;

public class day17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //15
        int m = n/2 +1; // n이 15라고하면, 값을 1부터 15까지 받는게 아니라, 연속된 합이니깐 n을/반으로 나누고 +1 해주면 딱 그값으 다음값까지만 배열에 값을 받으면된다.
        int [] arr = new int[m]; //8칸인 배열생성. 즉 8개의 숫자를 넣을수있는 배열생성 m=8이면


        for (int i =0; i < arr.length; i++) {
            arr[i] = i+1;
        }

//        System.out.println(Arrays.toString(arr));

        int lt=0 , sum=0 , answer=0;

        for (int rt = 0; rt < arr.length; rt++) {
               sum += arr[rt];
            if (sum == n) {
                answer++;
            }
            while (sum >= n){
                sum -= arr[lt++];
                if(sum == n)
                    answer++;
            }
        }
        System.out.println("answer = " + answer);
    }
}
