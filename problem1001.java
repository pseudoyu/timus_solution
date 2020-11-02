import java.util.*;

public class problem1001 {
   public static void main(String[] args) {
       ArrayList<Long> list = new ArrayList<>();
       Scanner in = new Scanner(System.in);
       while (in.hasNextLong()) {
           long e = in.nextLong();
           list.add(e);
       }
       in.close();

       for (int i = list.size() - 1; i >= 0; i--) {
           System.out.printf("%.4f%n", Math.sqrt((double) list.get(i)));
       }
   }
}