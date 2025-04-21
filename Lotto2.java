
import java.util.Scanner;
import java.util.Random;

public class Lotto2{
    int[] numbers;

    public Lotto2(){
        numbers = new int[6];
        Random rand = new Random();

        for(int i = 0; i<6; i++){
            numbers[i] = rand.nextInt(45)+1;
            for(int j=0; j<i; j++)
                if(numbers[i] == numbers[j])
                    i--;
        }
    }
    public void printNumbers(){
        for(int i = 0; i<6; i++)
            System.out.printf("%d ",numbers[i]);
        System.out.println();
    }
    
    public void remakeAuto(){
        numbers = new int[6];
        Random rand = new Random();
        for(int i = 0; i<6; i++){
            numbers[i] = rand.nextInt(45)+1;
            for(int j=0; j<i; j++)
                if(numbers[i] == numbers[j])
                    i--;
        }
    }

    public void remake(){
        Scanner s = new Scanner(System.in);
        numbers = new int[6];
        int i = 0;
        int num = 0;

        while(i < 6){
            num = s.nextInt();

            if(num < 1 || num > 45){
                print();
                continue;
            }
            
            if(check(i,num)){
                print();
                continue;
            }

            numbers[i] = num;
            i++;

        }
    }

    public void print(){
        System.out.println("You can only write 1~45 numbers which don't repeat.");
    }

    public boolean check(int k, int m){
        int check = 0;
        for(int i=0; i<k; i++)
            if(numbers[i] == m)
                check = 1;
        
            if(check == 1)
                return true;
            else
                return false;
    }

    
    public static void main(String[] args){
        Lotto2 l = new Lotto2();

        l.printNumbers();
        l.remake();
        l.printNumbers();
    }

}