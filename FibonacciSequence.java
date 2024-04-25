// This program takes a max number and prints a Fibonacci Sequence of length of that number
public class FibonacciSequence{
    // method to print Fibonacci Sequence Recursively
	public static int fibonacciRecursion(int n){
	if(n == 0){
		return 0;
		// return 0 if n is 0
	}
	if(n == 1 || n == 2){
			return 1;
			// if n is 1 or 2, return 1
		}
	return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
	// reursively return the fibonacci sequence
	}
	// driver code
    public static void main(String args[]) {
    // max number
	int maxNumber = 10;
	// print out the Fibonacci Sequence
	System.out.print("Fibonacci Sequence of "+maxNumber+" numbers: ");
	// using for loop to recursively print with a one number increment on n
	for(int i = 0; i < maxNumber; i++){
			System.out.print(fibonacciRecursion(i) +" ");
		}
	}
}

/* Recursion for Fibonacci sequence creates a stack, 
each call adds memory for parameters and local variables. 
With large inputs, stack size grows exponentially, 
leading to high memory consumption and potential stack overflow errors, 
making it less memory efficient compared to iterative solutions. */