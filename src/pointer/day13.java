package pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //첫번쨰입력
        int input1 = sc.nextInt();
        int[] arr1 = readArr(sc,input1);

        //두번쨰입력
        int input2 = sc.nextInt();
        int[] arr2 = readArr(sc, input2);


        //오름차순,정렬된 값을 저장할 list 추가
        ArrayList<Integer> answer = new ArrayList<>();
        // 각 배열에 위치를 나타낼 포인터  생성
        int p1 = 0;
        int p2 = 0;


        //반복문 돌리는데 두개 배열중에 하나만 끝날때까지만
        while (p1 < input1 && p2 < input2) {
            if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1++]);
                p2++;
            } else if (arr1[p1] < arr2[p2]) { //arr1[p1]값이 p2 보다 더작을경우 p1에있는값이 p2에 있을 경우가 없기떄문에 p1값을 +1 증가시킨다
                p1++;
            } else
                p2++;
        }

        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }
    }


    //입력받은 배열값초기화하고 정렬까지 해서 리턴해줌
    public static int[] readArr(Scanner sc , int input){

        int[] arr = new int[input];
        for (int i = 0; i < input; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        return arr;
    }
}
