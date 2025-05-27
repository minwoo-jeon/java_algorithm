package array;

import java.util.Scanner;

public class day2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 학생수
        int[] studentTall = new int[n]; //학생수만큼 학생키를 저장할 배열생성
        int max = studentTall[0];
        int count = 1;

        for (int i = 0; i < n; i++) {
            studentTall[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            if (studentTall[i] > max) {
                max = studentTall[i];
                count++;
            }
        }

        System.out.println(count);;
    }
}
