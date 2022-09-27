#include <stdio.h>

int factorial(int n);
int factorial_iter(int n);

int main(void)
{
    printf("factorial(3) = %d\n",factorial(3));
    printf("factorial(3) = %d\n",factorial_iter(3));

    return 0;
}