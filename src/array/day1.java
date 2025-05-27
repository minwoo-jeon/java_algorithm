package array;

import java.util.ArrayList;
import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        ArrayList<Integer> arrayList = new ArrayList<>();

        //배열에 값을 담는다
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt(); //arr = {7,3,9,5,6,12}
        }

        //하나씩 비교해서 arrayList에 값을 넣는다
        arrayList.add(arr[0]);
        for (int i = 1; i < num; i++) {
            if(arr[i] > arr[i-1]){
                arrayList.add(arr[i]);
            }
        }

        for (int n : arrayList) {
            System.out.print(n + " ");
        }
    }

}
