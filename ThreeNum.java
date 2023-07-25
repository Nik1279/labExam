import java.util.Scanner;
public class ThreeNum{
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the three numbers");
        int a =sc.nextInt();int b=sc.nextInt();int c=sc.nextInt();
        System.out.println("average of number is"+(a+b+c)/3);
        if(a>b && b>c) System.out.println("largest is "+a);
        else if(b>a && b>c)System.out.println("largest is"+b);
        else
        System.out.println("largest is " + c);

    }
}