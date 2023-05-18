//Program
    //Import
      import java.util.Arrays;
    //Class
      public class DuplicatingArray {
        //Main method
            public static void main(String[] args){
                int[] a = {6,7,8,9};

                System.out.println(Arrays.toString(a));
            }
        //Print method
        public static void print(int[] a) {
            System.out.printf("{%d", a[0]);
            for (int i = 1; i < a.length; i++) {
                System.out.printf(", %d", a[i]);
            }
            System.out.println("}");
        }
       }