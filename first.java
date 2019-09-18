import java.util.Scanner;

public class first{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int s=input.nextInt();
        Palindrome(s);
        // System.out.print(Math.pow(10,2)); 
    }
    static void Palindrome(int n){
        int r,sum=0,temp,i=0;    
        temp=n;    

        while(n>0){    
            r=n%10; 
            sum=(sum*10)+r;    
            n=n/10;  
            i++;
        }
        if(temp==sum)    
            getSum(temp);
        else    
            System.out.println("It's not palindrome");    
    }

    static int reverse(int n) 
    { 
        int rev = 0; 
        while (n != 0) { 
            rev = (rev * 10) + (n % 10); 
            n /= 10; 
        }   
        return rev; 
    } 
    
    static void getSum(int n) 
    { 
        int temp=n;
        n = reverse(n); 

        int sumEven = 0, c = 1; 
  
        while (n != 0) { 

            if (c % 2 == 0) 
                sumEven += n % 10;             
            n /= 10; 
            c++; 
        } 
        if(sumEven>25){
            System.out.println(temp+" is a palindrome and the sum of even numbers is greater than 25"); 

        }
        else{
            System.out.println(temp+" is a palindrome and the sum of even numbers is less than 25"); 
        }
    } 

}