// This is incomplete. I am having difficulty when going to larger days.
import java.util.*;

public class MagicalCows
{
    public static void main(String [] args)
    {
        //taking user input for cow data
        Scanner input = new Scanner(System.in);
        int C = input.nextInt(); // max no of cows/farm = 1
        int N = input.nextInt(); //no of farms, which is 5
        int D = input.nextInt(); // days of regulator visits, 5
        int cow = 0;
        //cow per farm info
        int [] cowInFarm = new int[N];
        for (int p = 0; p < N; p++)
        {
            cowInFarm[p] = input.nextInt();
        }
        //days the regulator visits
        int [] daysData = new int[D];
        for (int q = 0; q < D; q++)
        {
            daysData[q] = input.nextInt();
        }



        //an arraylist for number of cows each day
        ArrayList<Integer> cowsData = new ArrayList<>();
        cowsData.add(cow);
        for (int i = 1; i < D; i++)
        {
            cowsData.add(2 * cowsData.get(i-1));
        }

        //an arraylist for no of farms when regulator comes
        // ArrayList<Integer> farmsToVisit = new ArrayList<>();
        // farmsToVisit.add(N);
        // for (int j = 1; j < D ; j++)
        // {
        //     farmsToVisit.add(cowsData.get(j)/C);
        // }

        //for loop for showing how many farms to visit per day
        for(int k = 0; k < daysData.size(); k++)
        {
            System.out.println(farmsToVisit.get(daysData.get(k)));
        }
    }
}
