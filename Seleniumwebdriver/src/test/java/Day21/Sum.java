package Day21;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int result = sum(10);
	    System.out.println(result);
	  }
	  public static int sum(int k) {
	    if (k > 0) {
	      return k + sum(k - 1);
	    } else {
	      return 0;
	    }
	  }
	}
