import java.util.*;

public class Interest {
   static  final int rate = 10;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int value = sc.nextInt();
        int resultByThree = value % 3;       
        int resultByFive = value % 5;

        if(resultByFive ==0 && resultByThree == 0){
            System.out.println("FizzBuzz");
            int res1 = 100 + value;
            System.out.println(res1);  
        }
        else if(resultByThree == 0){
            System.out.println("Fizz");
            int res2 = 100 - value;
            System.out.println(res2);  
        }
        else if(resultByFive == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println("The number is"+value);
        }    
    }
}