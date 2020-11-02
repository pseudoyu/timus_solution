import java.util.*;

public class problem2012 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int f = in.nextInt();
	  in.close();
	  
	  String result;
	  if (f >= 7) {
		  result = "YES";
	  } else {
		  result = "NO";
	  }
	  
	  System.out.println(result);
   }
}