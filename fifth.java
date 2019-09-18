import java.util.Scanner;
import java.util.Arrays;


public class fifth{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String ss=s.nextLine();
        String[] sss = ss.split(" ");

        // System.out.println("output string: " + Arrays.toString(sss));

        int sum=0;
        for(int i=0;i<sss.length;i++){
            sum+=Integer.parseInt(sss[i]);
        }
        System.out.println(sum);

    }
}