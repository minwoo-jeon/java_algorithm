package pointer;

import java.util.Scanner;

public class day16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n]; //입력받을 배열 

        //하나씩 값을 받으면 배열에 저장
        for (int i = 0; i < n; i++) {   
            arr[i] = sc.nextInt();
        }
        
        
        //포인터변수,합,답 감을 변수선언
        int lt = 0, sum = 0, answer = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt]; //pointer rt 변수를 증가시키면서 sum값에 저장한다.
//            int sum += arr[rt];  선언과 대입연산자는 함께 쓸수없음
            if (sum == m) { //m값이랑 같을경우 answer값을 1증가
                answer++;
            }
            while (sum >= m) { // sum이 m값을 넘기거나,같을떄 sum에서 pointer lt 변수에 값을 하나 감소시키고 lt 증가
                sum -= arr[lt++];
                if (sum == m)
                    answer++;
            }//while
        }//for
        System.out.println("answer = " + answer);
    }
}