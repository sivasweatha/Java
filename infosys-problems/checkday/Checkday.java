import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Checker {
    public static String checking(String day){
        List<String> weekdays = new ArrayList<String>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");

        String result = "Does not exist";

        if(weekdays.contains(day)){
            result = "Weekday";
        } else if(day.equals("Saturday") || day.equals("Sunday")){
            result = "Weekend";
        }

        return result;
    }
}

class Checkday {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String day = input.nextLine();
        String result = Checker.checking(day);
        System.out.println(result);
    }
}