// 생년월일을 분해해 숫자 만들기

import java.util.Scanner;

public class J035{
    public static void main(String[] args){
        J035 pStudio = new J035();
        pStudio.J035();
    }
    public void J035(){
        Scanner s = new Scanner(System.in);

        String ymd;
        int y = 0;
        int m = 0;
        int d = 0;
        int total = 0;

        ymd = s.nextLine();

        for(int i = 0; i<4; i++)
            y += Character.getNumericValue(ymd.charAt(i));

        if(ymd.charAt(4)!='0'){
                m += Character.getNumericValue(ymd.charAt(4)) * 10;
                m += Character.getNumericValue(ymd.charAt(5));
        }
        else
            m += Character.getNumericValue(ymd.charAt(5));

        if(ymd.charAt(6)!='0'){
            d += Character.getNumericValue(ymd.charAt(6)) * 10;
                d += Character.getNumericValue(ymd.charAt(7));
        }
        else
            d += Character.getNumericValue(ymd.charAt(7));

        total = y + m + d;

        System.out.printf("%d",total);

            


        

    }
}