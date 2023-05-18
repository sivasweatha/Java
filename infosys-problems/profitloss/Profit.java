import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class Checker{
    public static String checking(long CP, long SP){
        String result = "Profit";
        if(CP > SP ){
            result = "Loss";
        }
        return result;
    }
}
class Profit{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String prices = input.nextLine();
        List<Long> numbers = Arrays.stream(prices.split(",")).map(Integer::parseInt).collect(Collectors.toList());
        String result = Checker.checking(numbers.get(0), numbers.get(1));
        System.out.println(result);
    }
}