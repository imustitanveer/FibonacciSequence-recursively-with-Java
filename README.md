# Fibonacci Sequence Generator

This Java program generates a Fibonacci Sequence based on a specified maximum number. It provides both recursive and iterative approaches to generate the sequence.

## Recursive Approach

The program implements a recursive method to generate the Fibonacci Sequence. However, it's worth noting that the recursive approach may not be memory-efficient for large inputs due to the creation of a stack for each recursive call.

## Iterative Approach

An iterative method is not implemented in this code but is recommended for generating Fibonacci Sequences efficiently, especially for large inputs. It avoids the potential stack overflow errors associated with the recursive approach.

## Usage

1. Compile the Java file `FibonacciSequence.java`.
2. Run the compiled Java class `FibonacciSequence`.
3. The program will generate and print the Fibonacci Sequence based on the specified maximum number.

## Implementation Details

- The program utilizes a recursive method `fibonacciRecursion()` to generate the Fibonacci Sequence.
- For each number `n` in the sequence, the method recursively computes the sum of the two preceding numbers.
- The main method initializes the maximum number of elements in the sequence and prints the generated sequence using the recursive method.

## Note
Recursion for Fibonacci sequence creates a stack, each call adds memory for parameters and local variables. With large inputs, stack size grows exponentially, leading to high memory consumption and potential stack overflow errors, making it less memory efficient compared to iterative solutions. Therefore, for generating Fibonacci Sequences efficiently, especially for large inputs, it's recommended to use an iterative approach.
