import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Checker {
    public static boolean checking(String record){
        boolean result = true;

       if(record.contains("A") || record.contains("LL")){
            result = false;
        }
        return result;
    }
}
class Attendancereward {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String record = input.nextLine();

        boolean result = Checker.checking(record);
        System.out.println(result);
    }
}