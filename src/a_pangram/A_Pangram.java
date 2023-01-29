
package a_pangram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeString;

public class A_Pangram {

     public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       int size=input.nextInt();
       String s=input.next();
       Map<Character,Integer> m=new HashMap();  
       if (s.length() < 26){
           System.out.println("NO");
           System.exit(0);
       }else{
       s=s.toLowerCase();
       for(int i=0;i<s.length();i++){
       m.put(s.charAt(i), 0);
       }
       if(m.size() == 26){
           System.out.println("YES");
       }else{
           System.out.println("NO");
       }
       }
       
       
       
    }   
}
/*
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        input = input.toLowerCase();
        int frequency[]=new int[26];
        for(int i = 0;i<s1;i++)
        {
            frequency[input.charAt(i)-'a']++;
        }

        int count = 0;

        for(int i = 0;i<26;i++)
        {
            if(frequency[i]!=0)
            {
                count++;
            }
        }
        if(count==26)
        {
            System.out.println("YES");
        }
        else
            System.out.println("NO");

    }
}
*/

   /*
   
*/