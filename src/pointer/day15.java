package pointer;

import java.util.Arrays;
import java.util.Scanner;

public class day15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];


        //배열에 입력값을 넣음
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int lt = 0; //왼쪽 포인터
        int cnt = 0;//0을 만난횟수
        int answer = 0;


        //오른쪽 끝을 한 칸씩 늘려가며,0을 만나면 cnt 값을 1 증가시킴
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) cnt++;
                while (cnt > k ){ //바꿀수 있는 0의 개수인 k를 초과하면, 왼쪽 포인터를 오른쪽으로 이동시켜 0의 개수를 하나씩 줄임
                    if(arr[lt] == 0) cnt--;
                    lt++;
                }
            answer = Math.max(answer, rt - lt + 1);
        }
        System.out.println("answer = " + answer);
    }
}
