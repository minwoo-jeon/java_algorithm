package array;

import java.util.Scanner;

public class day8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr1[] = new int[num];
        int arr2[] = new int[num];



        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            int cnt = 1;
            for (int j = 0; j < arr1.length; j++) {
                if(arr1[j] > arr1[i] ){
                    cnt++;
                }
                arr2[i] = cnt;
            }
        }

        for (int i : arr2) {
            System.out.println(i +  " ");
        }
    }
}
