//Program
    //Import
    import java.util.Arrays;
    //Class
      public class ArrFill {
        //Main method
            public static void main(String[] args) throws InterruptedException{
                System.out.println("Comic of the day: Type the Code Away");
                printComic("Read it in ArrFill.java Young Programers!", 2000);
                printComic("Young Programers : Ok, lets run ArrFill to read the Comic", 2000);
                printComic("Young Programers : typing (javac ArrFill.java)", 2000);
                printComic("Young Programers : typing (java ArrFill.java)", 2000);
                printComic("Young Programers : Oh Man, how many times would I do that ?!", 2000);
                printComic("Young Programers : typing (java ArrFill)", 2000);
                printComic("Comic: ", 2000);
                int[] x = {10,20,30,40,50,00,70};
                printComic("Computer prints: ", 2000);
                print(x);
                printComic("Yogi: Hey, that 0 should be 60!", 2000);
                printComic("Computer: Ok, Changing Now....", 2000);
                Arrays.fill(x,5,6,60);
                System.out.print("Computer prints again: ");
                print(x);
                printComic("Yogi: Now, that's good!", 2000);
                printComic("Moral of the story is: ", 2000);
                printComic("Use Arrays.fill() to change a part in a Array Object", 500);

            }
        //Print method
            public static void print(int[] a) {
                System.out.printf("{%d", a[0]);
                for (int i = 1; i < a.length; i++) {
                    System.out.printf(", %d", a[i]);
                }
                System.out.println("}");
            }
        // Print Comic method
            public static void printComic(String str, int pause) throws InterruptedException{
                Thread.sleep(pause);
                System.out.print(str +"\r");
            }
        }