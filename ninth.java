import java.util.Scanner;
import java.util.Arrays;


public class ninth{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String ss=s.nextLine();
        String reverse="";
        for(int i=ss.length()-1;i>=0;i--){
            reverse=reverse.concat(Character.toString(ss.charAt(i)));
        }
        System.out.print(reverse);
    }
}

