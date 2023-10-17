import java.util.HashMap;
import java.util.Scanner;

public class RomanTOInt{
    public static void main(String[] args)
    {
        // input roman number from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a RomanNumber:");
        String romanNum = scanner.nextLine().toUpperCase();
        int integer = romanToInt(romanNum);
        System.out.println("RomanNumber To Integer: " + integer);
    }

    //define romanTOInteger method 
    public static int romanToInt(String s){
        HashMap<Character, Integer> romanNums = new HashMap<>();
        romanNums.put('I', 1);
        romanNums.put('V', 5);
        romanNums.put('X', 10);
        romanNums.put('L', 50);
        romanNums.put('C', 100);
        romanNums.put('D', 500);
        romanNums.put('M', 1000);

    //    creating two local variable with initial value 0 for swaping etc..
        int result = 0;
        int prevValue = 0;

        for(int i = s.length()-1; i>=0; i--)
        {
            int currentVal = romanNums.get(s.charAt(i));
            if(currentVal < prevValue){
                result -= currentVal;
            }
            else{
                result += currentVal;
            }
            prevValue = currentVal;
        }
        return result;
    }
}