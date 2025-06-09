package array;

import java.util.Scanner;

public class day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        int answer = 0;



        //이중 포문을 통해 값세팅
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i+dx[k]; //행좌표
                    int ny = j+dy[k]; //열좌표
                    if( nx>= 0 && nx <n && ny>=0 && ny < n && arr[nx][ny] >= arr[i][j]){
                        flag = false; //봉우리가 아닐경우
                        break; //한방향이 봉우리가 아니면 다른방향은 볼필요없기떄문에 탈출
                    }
                }
                if(flag) answer++;
            }
        }
        System.out.println("answer = " + answer);
    }
}
