# Runnable_vs._Callable

Since Java's early days, multithreading has been a major aspect of the language. Runnable is the core interface provided for representing multithreaded tasks, and Java 1.5 provided Callable as an improved version of Runnable.


# What is Runnable?
Runnable is an interface that classes implementing it are going to be executed in threads. Here, you can see the Runnable interface. All your logic that needs to be executed in a thread will be in the overridden run method. You will notice that it is a void method.

  # public class MyRunnable implements Runnable {
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
  #}

# What is Callable?
Everything I wrote about Runnable is valid for the Callable interface except one thing, return type. The method call will return any type after it completes its execution.

# Execution Mechanism ⚒️
Both interfaces are designed to represent a task that can be run by multiple threads. We can run Runnable tasks using the Thread class or ExecutorService, whereas we can only run Callables using the latter.

# Return Values
The Runnable interface is a functional interface and has a single run() method that doesn't accept any parameters or return any values.
The Callable interface is a generic interface containing a single call() method that returns a generic value V:


<img src="https://1.bp.blogspot.com/-hPABQB_W9D0/X7J67eFrReI/AAAAAAAAkcM/6xbW-nnmbbIj_gKcdDuI-67DyST55ly2QCLcBGAsYHQ/w400-h278/Difference%2Bbetween%2BCallable%2Band%2BRunnable%2Bin%2BJava.png" />
