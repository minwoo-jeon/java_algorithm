package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class day18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //15
        String str = sc.next(); //BACBACCACCBDEDE

        char answer =' ';

        HashMap<Character, Integer> map = new HashMap<>();
        //Str문자열을 char 배열로 만들어 문자열 하나를 꺼내고 map 객체에 하나씩 put 한다.
        for(char x : str.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        //확인 하는 코드 map에 키값을 하나씩 읽어와 set객체에 저장하고 그 저장된 set,객체에  문자열 하나씩 뽑아냄
//        for(char x : map.keySet()){
//            System.out.println(x + " " + map.get(x));
//        }

        int max = Integer.MIN_VALUE;

        //map에 키값을 하나씩 꺼내 해당 value값을 찾고 그 값이 max값보다 크다면 max 변수에 저장하고, answer 변수에 해당 키값 저장
        for(char key : map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }
        System.out.println("answer = " + answer);
    }
}
