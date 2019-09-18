import java.util.Scanner;

public class second{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int s=input.nextInt();
        if(s%2==0){
            if(s>20 && s<30){
                System.out.println("Jerry");
            }
        }
        else{

            if(s>20 && s<30){
                System.out.println("Tom");
            }
        }

    }
}