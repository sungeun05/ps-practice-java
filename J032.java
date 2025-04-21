import java.util.Scanner;

public class J032{
    public static void main(String[] args){
        J032 pStudio = new J032();
        pStudio.J032();
    }
    public void J032(){
        Scanner s = new Scanner(System.in);

        String str;
        String reverse = "";

        str = s.nextLine();

        for(int i=str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }

        System.out.printf("%s\n",reverse);
    }
}