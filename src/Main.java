public class Main {

    public static void main(String[] args) {
	    int fib = 0;
	    int nextFib = 1;
	    while (fib < 100) {
	        System.out.println(fib);
	        nextFib = nextFib + fib;
	        fib     = nextFib - fib;
	    }
    }
    
}
