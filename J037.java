// 애너그램 판별하기
// 두개의 문자열 속 의 알파벳이 동일한 개수만큼 포함된 것을 말함.

import java.util.Scanner;

public class J037{
    public static void main(String[] args){
        J037 pStudio = new J037();
        pStudio.J037();
    }
    public void J037(){
        Scanner s = new Scanner(System.in);

        String s1;
        String s2;
//97 - 122 소문자
        s1 = s.nextLine();
        s2 = s.nextLine();

        int[] c1 = new int[122];
        int[] c2 = new int[122];
        int count = 0;

        for(int i=0; i<s1.length(); i++)
            c1[s1.charAt(i)]++; 

        for(int i=0; i<s2.length(); i++)
            c2[s2.charAt(i)]++; 

        for(int i=97; i<122; i++)
            if(c2[i] != 0 && c1[i] != 0)
                if(c1[i] != c2[i]){
                    count = 1;
                    break;
                }

        if(count == 1)
                System.out.println("NO");
        else if(count == 0)
                System.out.println("Yes");
    }
}