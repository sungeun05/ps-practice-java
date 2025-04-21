import java.util.Scanner;

public class J031{
    public static void main(String[] args){
        J031 pStudio = new J031();
        pStudio.J031();
    }
    public void J031(){
        Scanner s = new Scanner(System.in);

        String userid;
        String password;
        String name;


        userid = s.nextLine();
        password = s.nextLine();
        name = s.nextLine();

        if(password.length() < 3)
            System.out.println("Error! password is too short,");
        else
        System.out.printf("User Id: %s\n",userid);
        
        System.out.printf("Password: %s",password.substring(0,2));
        for(int i = 2; i<password.length(); i++){
            System.out.printf("*");
        }

        System.out.printf("\nUser Name: %s\n",name);
      
    
    }
}