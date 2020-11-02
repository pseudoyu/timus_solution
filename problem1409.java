import java.util.*;

public class problem1409 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
	  int b = in.nextInt();
	  in.close();
	  int sum = a + b -1;
	  int out1 = sum - a;
	  int out2 = sum - b;
	  System.out.println(out1 + " " + out2);
   }
}