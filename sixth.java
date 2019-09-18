import java.util.Scanner;

public class sixth{
    public static void main(String[] args){
        // Scanner s=new Scanner(System.in);
        // char m=s.nextChar();
        Scanner scanner = new Scanner(System.in);
        char m = scanner.next().charAt(0);
        if(m>='a' && m<='z'){
            System.out.print("It is a lower case character");
        }
        if(m>='A' && m<='Z'){
            System.out.print("It is a upper case character");
        }

        if (Character.isDigit(m)== true) 
            System.out.print("It is a number");
        else
            System.out.print("It is a special character");
    }
}