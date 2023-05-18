//Program
    //Import
      import java.util.Scanner;

    //Class
    class GetCasing {

        public static String checkUpperLower(char a) {
            String result = "Lowercase";
            char c;
            for(c = 'A'; c <= 'Z'; ++c){
                if(a == c){
                    result = "Uppercase";
                }
            }
            return result;
        }
    }

    class Checkcasing{
        private static Scanner in;

        public static void main(String[] args) {
            in = new Scanner(System.in);
            String a = in.next();
            String result = GetCasing.checkUpperLower(a.charAt(0));
            System.out.println(result);
        }
    }