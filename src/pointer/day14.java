package pointer;

import java.util.Scanner;

public class day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[]arr = new int[n];
        int sum = 0; // k까지의 sum 값
        int answer = 0; //최대매출값


        //배열값 사용자 값을 받아 초기화 작업.
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        //처음에 배열에 k까지의 합을 구하고 sum 변수에 저장.
        for (int i = 0; i < k; i++) {
            sum += arr[i];  //sum = 12+15+11 = 38
            answer = sum;
        }
//        System.out.println("sum = " + sum); //38 ok!


        // i는 k부터 시작
        for (int i = k; i < n; i++) {
            sum -= arr[i-k]; // i의 값이 3부터 시작하면서 i=3 - k= 3  즉 앞에 있는원소값을 한개씩 값을뺴고
            sum += arr[i];  // 뒤에있는 현재 i번쨰 위치의 원소값 한개를 + sum값이랑 더한다
            answer = Math.max(answer,sum);
        }

        //화면에 answer 값을 출력한다.
        System.out.println("answer = " + answer);
    }
}
