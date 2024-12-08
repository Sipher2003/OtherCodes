#fibonacci

def fibonacci(n):
    if n<=1:
        return n
    
    return fibonacci(n-1)+fibonacci(n-2)

num=10
fib_series=[fibonacci(i) for i in range(num)]
print(f"Fibonacci of {num} series is {fib_series}")