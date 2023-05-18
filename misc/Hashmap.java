import java.util.HashMap;
    public class Hashmap {
        public static void main(String[] args){

            HashMap<String, String> fdict = new HashMap<>();

                fdict.put("yeux", "eyes");
                fdict.put("tete", "head");
                fdict.put("nager", "swim");
                fdict.put("noie", "drown");

                for (String i : fdict.keySet()) {
                    System.out.print(i+"\t"+"= ");
                    System.out.println(fdict.get(i));
                }

                fdict.replace("nager", "swimming");
                System.out.println(fdict.get("nager"));

                HashMap<Integer, String> map = new HashMap<>();

                map.put(1, "Taiwan");
                map.put(2, "Japan");
                map.put(3, "India");

                for (String i : map.values()) {
                    System.out.println(i);
                }
        }
    }