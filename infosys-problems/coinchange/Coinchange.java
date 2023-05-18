import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class CoinCalculator {
    public static String coinsNeeded(int onesAvailable, int fivesAvailable, int change){
        String returnValue = "NP";

        int fivesNeeded = change / fivesAvailable;
        if(fivesNeeded > fivesAvailable){
            fivesNeeded = fivesAvailable;
        }

        int onesNeeded = change - (fivesNeeded * 5);
        if(onesNeeded <= onesAvailable && onesNeeded >= 1){
            returnValue = returnValue.format("%d and %d", fivesNeeded, onesNeeded);
        }
        return returnValue;
    }
}

class Coinchange {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		List<String> inputData = Arrays.stream(inputString.split(",")).collect(Collectors.toList());
		int fivesAvailable = Integer.parseInt(inputData.get(0));
		int onesAvailable = Integer.parseInt(inputData.get(1));
		int change = Integer.parseInt(inputData.get(2));
		String returnValue = CoinCalculator.coinsNeeded(onesAvailable, fivesAvailable, change);
		System.out.println(returnValue);
    }
}