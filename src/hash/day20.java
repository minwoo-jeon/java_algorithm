package hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class day20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];


        //매출액 값을 하나씩 배열에 저장
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //매출액의 종류를 담을 list 추가
        ArrayList<Integer> answer = new ArrayList();
        HashMap<Integer, Integer> map = new HashMap<>();


        //슬라이딩 초기값 세팅 k-1값까지
        for (int i = 0; i < k - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }


        int lt = 0;

        for (int rt = k - 1; rt < n; rt++) {
            map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt])-1);
            //윈도우 왼쪽 lt 값 제거 
            if(map.get(arr[lt]) ==0 ) map.remove(arr[lt]);
            lt++;
        }

        for (int x : answer) {
            System.out.print(x + " ");
        }
    }
}
