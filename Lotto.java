import java.util.Scanner;
import java.util.Random;

public class Lotto{
    int[] numbers;

    public Lotto(){
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
    public static void main(String[] args){
        Lotto l = new Lotto();

        l.printNumbers();
        l.remakeAuto();
        l.printNumbers();
    }
}