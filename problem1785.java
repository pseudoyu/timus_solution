import java.util.*;

public class problem1785 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
	  in.close();
	  
	  String len;
	  if (n >= 1000) {
		  len = "legion";
	  } else if (n >= 500 && n <= 999) {
		  len = "zounds";
	  } else if (n >= 250 && n <= 499) {
		  len = "swarm";
	  } else if (n >= 100 && n <= 249) {
		  len = "throng";
	  } else if (n >= 50 && n <= 99) {
		  len = "horde";
	  } else if (n >= 20 && n <= 49) {
		  len = "lots";
	  } else if (n >= 10 && n <= 19) {
		  len = "pack";
	  } else if (n >= 5 && n <= 9) {
		  len = "several";
	  } else {
		  len = "few";
	  }
	  
	  System.out.println(len);
   }
}