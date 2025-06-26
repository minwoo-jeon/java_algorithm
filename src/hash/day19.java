package hash;

import java.util.HashMap;
import java.util.Scanner;

public class day19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String answer = "YES";
        HashMap<Character,Integer> map = new HashMap<>();


        for (char x : str1.toCharArray()) {
            map.put(x,map.getOrDefault(x,0) + 1);
        }

        for (char x : str2.toCharArray()) {
            //만약 해당키값이 없으면 false리턴하자나 근데 ! 만나서 true
            //map객체에 x 키값이 존재하지 않거나 , 해당 키의 value 값이 0일 경우 아나그램이 아니기떄문에 no를 리턴해준다.
            if(!map.containsKey(x) || map.get(x) == 0){
                 answer = "NO";
            }
            //존재할경우 해당 키의 value값을 -1 감소 해준다.
            else{
              map.put(x,map.get(x)-1);
            }
        }
        System.out.println("answer = " + answer);
    }
}
