import java.util.Scanner;

public class J030{
    public static void main(String[] args){
        J030 pStudio = new J030();
        pStudio.J030();
    }
    public void J030(){
        Scanner s = new Scanner(System.in);
        String[] names = {"James","David","Simon","Peter","Jason"};
        int[][] sheet = new int[5][10];
        int[] answer = {1,2,3,4,1,2,3,4,3,2};
        int[] grade = new int[5];
        int count = 0;

        int count1 = 0, count2 = 0, count3 = 0;
    
        for(int i=0; i<5; i++){
            for(int j=0; j<10; j++){
                sheet[i][j] = s.nextInt();
                if(sheet[i][j] == answer[j])
                    count++;
            }
            if(count == 9 || count == 10)
                grade[i] = 1;
            else if(count == 7 || count == 8)
                grade[i] = 2;
            else if(count <= 6)
                grade[i] = 3;
            count = 0;
        }
        for(int i=0; i<5; i++){
            if(grade[i] == 1)
                count1++;
            else if(grade[i] == 2)
                count2++;
            else
                count3++;
        }

        System.out.printf("1st : ");
        for(int i=0; i<5; i++)
            if(grade[i] == 1){
                System.out.printf("%s ",names[i]);
            }
        System.out.printf("(%d)\n",count1);

        System.out.printf("2nd : ");
        for(int i=0; i<5; i++)
            if(grade[i] == 2){
                System.out.printf("%s ",names[i]);
            }
        System.out.printf("(%d)\n",count2);

        System.out.printf("Fail : ");
        for(int i=0; i<5; i++)
            if(grade[i] == 3){
                System.out.printf("%s ",names[i]);
            }
        System.out.printf("(%d)\n",count3);
            

    }

}