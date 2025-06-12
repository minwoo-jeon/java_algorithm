package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = readArray(sc,n1);
        int n2 = sc.nextInt();
        int[] arr2 = readArray(sc,n2);


        ArrayList<Integer> answer = new ArrayList<>(); //ㅅㅅㅅ
        int p1= 0 , p2 = 0;  //각 배열에 위치할 포인터를 생성 배열시작범위 0으로 초기화



        while (p1 < n1 && p2 < n2) {
            if(arr1[p1] < arr2[p2])answer.add(arr1[p1++]); //p1이 더작을경우 arr1[p1]의 위치에 값을 answer 리스트 배열에 값을 추가하고 p1값을 하나 증가
            else answer.add(arr2[p2++]); //위에랑 반대로 p2가 더작을경우
        }


        while (p1<n1) answer.add(arr1[p1++]); // 조건문에서 p2에 배열에 있는 값은 리스트에 다들어갔는데 p1에 값이 남아있는 경우 p1에값을 증가시켜 남아있는 값을 list에 add
        while (p2<n2) answer.add(arr2[p2++]); //반대

        for (Integer integer : answer) {
            System.out.print(integer+" ");
        }
    }


    //사용자의 값을 받아 배열에 초기화 시키는 메서드
    public static int[] readArray(Scanner sc , int size){
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]  = sc.nextInt();
        }
        return arr;
    }
}
