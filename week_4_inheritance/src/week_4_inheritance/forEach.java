/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_4_inheritance;

/**
 *
 * @author Robin
 */
import java.util.*;
import static java.util.Collections.sort;

public class forEach {

    public static void main(String[] args) {
//        int[] list={2,5,7,3,1,9,34,6};
//        for(int num:list){
//            System.out.println(num);
//        }
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//        int d = input.nextInt();
//
//        ArrayList<Integer> list2 = new ArrayList<>(4);
//        list2.add(a);
//        list2.add(b);
//        list2.add(c);
//        list2.add(d);
//        for (int s : list2) {
//            System.out.println(s);
//        }
//        Collections.sort(list2);
//        System.out.println(list2);

    java.math.BigInteger x = new java.math.BigInteger("3");
    java.math.BigInteger y = new java.math.BigInteger("7");
    x.add(y);
    System.out.println(x);
        String s1 = new String("Welcome to Java!");
    String s2 = new String("Welcome to Java!");

    if (s1 == s2)
      System.out.println("s1 and s2 reference to the same String object");
    else
      System.out.println("s1 and s2 reference to different String objects");
  }

}
