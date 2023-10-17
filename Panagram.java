import java.util.Scanner;

public class Panagram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = scanner.nextLine().toLowerCase();

        boolean panagram = isPanagram(str);
        if(panagram == true){
            System.out.println("Is a Panagram");
        }else{
            System.out.println("Is not a Panagram");
        }
    }
        
        public static boolean isPanagram(String s){
            if(s.length() < 26){
                return false;
            }
            else{
                for(char ch = 'a'; ch <= 'z'; ch++){
                    if(s.indexOf(ch) < 0){
                        return false;
                    }
                }
            }
            return true;
        }
}