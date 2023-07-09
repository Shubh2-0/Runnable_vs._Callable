# Runnable Vs Callable 🤜🤛

This GitHub repository contains three projects that demonstrate the implementation and usage of `Runnable` and `Callable` interfaces in Java.

Since Java's early days, multithreading has been a major aspect of the language. Runnable is the core interface provided for representing multithreaded tasks, and Java 1.5 provided Callable as an improved version of Runnable.

# What is Runnable?
Runnable is an interface that classes implementing it are going to be executed in threads. Here, you can see the Runnable interface. All your logic that needs to be executed in a thread will be in the overridden run method. You will notice that it is a void method.

**Example** :-

```
   public class MyRunnable implements Runnable {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+" ");
        }
    }
    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
     }
  }
```
# What is Callable?
Everything I wrote about Runnable is valid for the Callable interface except one thing, return type. The method call will return any type after it completes its execution.
**Example :-**
```
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable<Integer> {
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) throws Exception {
        Callable<Integer> myCallable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(myCallable);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println(futureTask.get());
    }
}
```

# Execution Mechanism ⚒️
Both interfaces are designed to represent a task that can be run by multiple threads. We can run Runnable tasks using the Thread class or ExecutorService, whereas we can only run Callables using the latter.

# Return Values
1️⃣ The Runnable interface is a functional interface and has a single run() method that doesn't accept any parameters or return any values.\
2️⃣ The Callable interface is a generic interface containing a single call() method that returns a generic value V:

<p align="center">
<img src="https://1.bp.blogspot.com/-hPABQB_W9D0/X7J67eFrReI/AAAAAAAAkcM/6xbW-nnmbbIj_gKcdDuI-67DyST55ly2QCLcBGAsYHQ/w400-h278/Difference%2Bbetween%2BCallable%2Band%2BRunnable%2Bin%2BJava.png" />

</p>
 

## Getting Started
🚀 To run any of the projects in this repository, follow the instructions in their respective directories. Each project contains a README file with detailed explanations and steps to execute the code.

## Requirements
⚙️ To compile and execute the projects, ensure you have the following prerequisites:
- Java Development Kit (JDK) 8 or higher
- An integrated development environment (IDE) or a command-line interface (CLI) to build and run Java code

## Contributing
🤝 Contributions to this repository are welcome. If you find any issues or want to enhance the existing projects, feel free to open a pull request. Please make sure to follow the repository's guidelines and code of conduct.

## Acknowledgements
🙏 This repository was created to provide a simple and practical demonstration of the `Runnable` and `Callable` interfaces. It draws inspiration from various Java programming resources and examples available online. Special thanks to the contributors and developers of these resources for sharing their knowledge.

If you have any questions or suggestions, please feel free to reach out by creating an issue in this repository. Enjoy exploring the `Runnable` and `Callable` interfaces!



