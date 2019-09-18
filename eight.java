import java.util.Scanner;
import java.util.Random; 

public class eight{
    public static void main(String[] args){
        Random rand = new Random(); 
        int target = rand.nextInt(100); 
        Scanner scanner = new Scanner(System.in);
        int s=scanner.nextInt();
        if(s>target){
            System.out.print("Number guessed is more than original number");
        }
        if(s<target){
            System.out.print("Number guessed is less than original number");
        }
        if(s==target){
            System.out.print("Number guessed is equal to the original number");
        }
    }
}