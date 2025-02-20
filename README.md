# Scala ListBuffer IndexOutOfBoundsException

This repository demonstrates a common error in Scala: an `IndexOutOfBoundsException` when accessing elements in a `ListBuffer`.  The example code attempts to access an index that is out of range, resulting in the exception. The solution shows how to avoid this error using safe indexing techniques.

## Running the code

1. Clone the repository:
   ```bash
git clone <repository_url>
```
2. Navigate to the directory:
   ```bash
cd <repository_directory>
```
3. Compile and run the code using the Scala compiler:
   ```bash
scala bug.scala
```
4. Observe the exception.

5. Compile and run the solution:
   ```bash
scala bugSolution.scala
```

## Solution

The solution demonstrates safe access of the ListBuffer using methods like `size` to check bounds,  `get` for optional access or using a `try-catch` block to handle potential exceptions.  The approach you use will depend on your error handling strategy.