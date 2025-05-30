package array;

import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt(); //20
        int arr[] = new int[inputNum+1];
        int count = 0;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
            for(int j=i; j<arr.length; j=j+i){   //
                arr[j] = 1;
            }
        }

        System.out.println("count = " + count);
    }
}
