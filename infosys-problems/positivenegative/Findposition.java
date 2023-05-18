import java.util.Scanner;

class Checker {
    public static String checking(int number){
       String result = "Positive";

       if(number < 0){
        result = "Negative";
       }
       return result;
    }
}
class Findposition {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String result = Checker.checking(number);
        System.out.println(result);
    }
}