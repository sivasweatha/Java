import java.util.Scanner;

class Checker{
    public static String checking(int income){
        String result = "Below";
        if(income > 6250){
            result = "Above";
        }
        return result;
    }
}

class Povertychecker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int income = input.nextInt();
        String category = String.format("%s poverty line",Checker.checking(income));
        System.out.println(category);
    }
}