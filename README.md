<div align="center">

# ⚔️ Runnable vs Callable

[![GitHub stars](https://img.shields.io/github/stars/Shubh2-0/Runnable_vs._Callable?style=for-the-badge&logo=github&color=yellow)](https://github.com/Shubh2-0/Runnable_vs._Callable/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/Shubh2-0/Runnable_vs._Callable?style=for-the-badge&logo=github&color=blue)](https://github.com/Shubh2-0/Runnable_vs._Callable/network/members)

### Understanding Java Concurrent Interfaces

*When to use Runnable vs Callable for multithreading*

</div>

---

## 🎯 About

Explore the differences between **Runnable** and **Callable** interfaces in Java concurrent programming.

## 📊 Comparison

| Feature | Runnable | Callable |
|---------|----------|----------|
| Return Value | void | V (Generic) |
| Exception | No checked exceptions | Can throw exceptions |
| Method | run() | call() |
| Package | java.lang | java.util.concurrent |
| Use with | Thread, ExecutorService | ExecutorService only |

## 💻 Examples

```java
// Runnable - No return value
Runnable task = () -> System.out.println("Running");
new Thread(task).start();

// Callable - Returns value
Callable<Integer> task = () -> 42;
Future<Integer> future = executor.submit(task);
int result = future.get();
```

## 🛠️ Technologies

Java | Concurrency | ExecutorService | Future

## 📬 Contact

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/shubham-bhati-787319213/)
[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:shubhambhati226@gmail.com)

---

**Keywords:** Java Runnable Callable Multithreading Concurrency Future ExecutorService









