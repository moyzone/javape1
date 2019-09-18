import java.util.Scanner;

public class seventh{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        int sum=0;
        char[] charArray = s.toCharArray();
        for(int i=0;i<charArray.length;i++){
            for(int j=i;j<charArray.length;j++){
                if(charArray[j]>charArray[i]){
                    char temp=charArray[j];
                    charArray[j]=charArray[i];
                    charArray[i]=temp;
                }
            }
        }

        for(int i=0;i<charArray.length;i++){
            if(charArray[i]%2==0){
                
                int a=Character.getNumericValue(charArray[i]); 
                sum=sum+a;
            }
        }

        System.out.print("Sorted number in non-increasing order:");
        System.out.println(charArray);
        System.out.print("Sum of even numbers is: ");
        System.out.println(sum);

        if(sum>=15){
            System.out.print("True");

        }
        else
            System.out.print("False");
    }
}