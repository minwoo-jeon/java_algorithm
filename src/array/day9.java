package array;

import java.util.Arrays;
import java.util.Scanner;

public class day9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        int[][] arr = new int[num][num];

        //문제에서 최종 리턴할 가장 큰 합 변수 선언
        int answer = Integer.MIN_VALUE;
        //행의 합을 누적할 변수선언
        int sum1 = 0;
        //열의 합을 누적할 변수선언
        int sum2 = 0;


        //입력갑을 받아 2차원 배열에 값을 채운다.
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        //2차원 배열에 값을 꺼내면서 행과,열의 합을 구한다.
        for (int i = 0; i < num; i++) {
                 sum1=sum2= 0;
            for (int j = 0; j < num; j++) {
                sum1 += arr[i][j] ; //행의 순차적으로 돌면서 행의합 sum1값에 저장.
                sum2 += arr[j][i] ; //열을 순차적으로 돌면서 열의합 sum2값에 저장.
            }
            answer = Math.max(answer,sum1);
            answer = Math.max(answer,sum2); //0행 71저장
        }


        sum1=sum2=0; //대각선 양방향 합을 구하기위해 sum값 0으로 초기화.
        //2차원 배열에 값을 꺼내면서 대각선의 양방향의 합을 구한다.
        for(int i=0; i < num; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][num - i - 1];
        }

            answer = Math.max(answer,sum1);
            answer = Math.max(answer,sum2);

        System.out.println("answer = " + answer);
    }
}
