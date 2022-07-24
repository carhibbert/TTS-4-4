import java.util.Scanner;
import java.util.Arrays;

public class arrays{
    
    public static void main(String[] args){


        // Alternative:
        // Let user define size of array 
        Scanner array = new Scanner(System.in);
        System.out.println("How large would you like your array to be? Enter a number.");
        int arrayLength = Integer.parseInt(array.nextLine());
        int[] userArray = new int[arrayLength];
        
        // Declare empty variable for sum
        int sum = 0;
    
        System.out.println("Please enter " + arrayLength + " numbers:");

        // For given array length, populate each spot with user inputted number 
        for (int i = 0 ; i <arrayLength; i++){
            
            userArray[i] = Integer.parseInt(array.nextLine());
            sum += userArray[i];
            
        }
        System.out.println(Arrays.toString(userArray));
        System.out.println("The sum of your array is " + sum);
    }
}
