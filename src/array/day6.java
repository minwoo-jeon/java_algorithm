package array;

import java.util.ArrayList;
import java.util.Scanner;

public class day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        ArrayList<Integer> list = new ArrayList();

        //사용자 입력 숫자 받고 배열에 저장
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //배열 안에있는 값을 하나씩 꺼넿어 숫자 뒤집기
        for (int i = 0; i < n; i++) {
            int tmp=arr[i]; //32
            int res=0; //앞뒤를 바꾼 숫자
            int t= 0;
            while (tmp>0 ){
                t = tmp%10; //나머지 2
                res = res * 10 + t ; //2
                tmp = tmp/10 ;  //3
            }
            //소수일 경우 arraylist에 추가
            if(prove(res)) list.add(res);
        }

        for (int answer : list) {
            System.out.println(answer + " ");
        }
    }

    //소수를 판별하는 메서드
    public static boolean prove(int res){
        if(res == 1) return false; //나를 호출한곳으로
        for (int i = 2; i < res; i++) {
            if(res%i == 0)return false;
        }
            return true;
    }
}
