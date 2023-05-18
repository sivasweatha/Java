import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Checker {
    public static float checking(int basicSalary, int transportAllowance, int houseAllowance){
       float gross = basicSalary + transportAllowance + houseAllowance;
       float tax = 0;

       if(gross >= 5000){
           tax = 0.3f;
        } else if(gross < 5000 && gross >= 1000) {
            tax = 0.2f;
        } else {
            tax = 0.1f;
        }

        tax = gross - (gross * tax/100);
        return tax;
    }
}
class Calculatesalary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String numbers = input.nextLine();
        List<Integer> prices = Arrays.stream(numbers.split(",")).map(Integer::parseInt).collect(Collectors.toList());
        float result = Checker.checking(prices.get(0),prices.get(1),prices.get(0));
        System.out.println(result);
    }
}