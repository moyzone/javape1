import java.util.Scanner;
import java.util.Random;

public class menu{
    public static void main(String[] args){

        System.out.println("Please Select");
        System.out.println("1.Palindrome Check");
        System.out.println("2.Tom and Jerry Problem");
        System.out.println("3.Vowel/ Consonent Check");
        System.out.println("4.Iterating numbers");
        System.out.println("5.Adder function");
        System.out.println("6. Capittal or small");
        System.out.println("7.Sort and add");
        System.out.println("8.Guesser");
        System.out.println("9.Reverse string");
        System.out.println("10.Repeat the last");
        
        Scanner menus=new Scanner(System.in);
        int a=menus.nextInt();

        switch(a){
            case 1:
                first();
                break;
            
            case 2:
                second();
                break;
        
            case 3:
                third();
                break;
        
            case 4:
                fourth();
                break;
        
            case 5:
                fifth();
                break;
        
            case 6:
                sixth();
                break;
        
            case 7:
                seventh();
                break;

            case 8:
                eight();
                break;
        
            case 9:
                ninth();
                break;
            
            
            case 10:
                tenth();
                break;
        
    
        }
    }


        static void second(){
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


        static void third(){
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

        static void fourth(){
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=0;j<i;j++){
                    System.out.print(i);                
                }
            }
        }

        static void fifth(){
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=0;j<i;j++){
                    System.out.print(i);                
                }
            }
        }

        static void sixth(){
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

        static void seventh(){
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

        static void eight(){
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

        static void ninth(){
            Scanner s=new Scanner(System.in);
            String ss=s.nextLine();
            String reverse="";
            for(int i=ss.length()-1;i>=0;i--){
                reverse=reverse.concat(Character.toString(ss.charAt(i)));
            }
            System.out.print(reverse);
        }


        static void tenth(){
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

        static void first(){
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
