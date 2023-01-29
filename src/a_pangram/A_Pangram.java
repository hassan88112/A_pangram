
package a_pangram;

import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeString;

public class A_Pangram {
    
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


   /*
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       int size=input.nextInt();
       if (size < 26){
           System.out.println("NO");
           System.exit(0);
       }
       String word=input.next();
       for(int i=0 ;i<size ;i++) {
        word[i]=Character.toLowerCase(word[i]);
       }
       
       
    }
    
}
*/