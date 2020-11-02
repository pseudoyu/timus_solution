import java.util.*;

public class problem1877 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
	  int b = in.nextInt();
	  in.close();
	  String result;
	  if (a % 2 == 1 && b % 2 == 0) {
		  result = "no";
	  } else {
		  result = "yes";
	  }

	  System.out.println(result);
   }
}