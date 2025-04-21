//회문 검사 (palindrome)
import java.util.Scanner;

public class J036{
    public static void main(String[] args){
        J036 pStudio = new J036();
        pStudio.J036();
    }
    public void J036(){
        Scanner s = new Scanner(System.in);
        String str;
        String alp_str = "";
        int count = 0;

        str = s.nextLine();

        str = str.toLowerCase();

        for(int i = 0; i<str.length(); i++)
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                alp_str += str.charAt(i);

        for(int i=0,j=alp_str.length()-1; i<alp_str.length()/2; i++,j--){
            if(alp_str.charAt(i) != alp_str.charAt(j))
                count = 1;
                
        }

        if(count == 0)
            System.out.println("Yes");
        else if(count == 1)
            System.out.println("NO");

    }
}
