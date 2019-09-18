import java.util.Scanner;
import java.lang.String;

public class third{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' || s.charAt(i)<='Z' || s.charAt(i)>='a' || s.charAt(i)>='z'){
                System.out.print("Error");
                return;
            }
        }
        for(int i=0;i<s.length();i++){
            char ch;
            ch=s.charAt(i);
    
            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
            ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
            ch=='u' || ch=='U')
            {
                System.out.print("Vowel ");
            }
            else{
                System.out.print("Consonent ");
    
            }  
        }
    }    
}