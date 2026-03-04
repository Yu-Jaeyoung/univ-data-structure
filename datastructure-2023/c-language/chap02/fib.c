//순환적인 방법
int fib(int n)
{
    if (n == 0) return 0; // Simple case
    if (n == 1) return 1; // Simple case
    return (fib(n-1) + fib(n-2));
}