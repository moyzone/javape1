import java.util.Scanner;

public class tenth{
    public static void main(String[] args){
        
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int n=scanner.nextInt();
        int count=0;                
        for(int i=s.length();i>=n;i--){
            count++;
        }
        while(n>0){
            for(int i=count-1;i<s.length();i++){
                System.out.print(s.charAt(i));
            }
            n--;
        }
    }
}