import java.util.Scanner;

public class operators {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter First Number :- ");
        int num1 = obj.nextInt();

        System.out.println("Enter Second Number :- ");
        int num2 = obj.nextInt();


        
        int sum = num1%num2;
        int sum1 = num1+num2;
        int sum2 = num1-num2;
        float sum3 = num1/num2;
        int sum4 = num1*num2;
        
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
    }
    
}

// +
// -
// *
// /
// %
