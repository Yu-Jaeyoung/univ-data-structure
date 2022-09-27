#include <stdio.h>

int factorial(int n)
{

    printf("factorial call %d\n",n);

    if(n<=1) //simple case, 순환 종료 조건
        return 1;
    else
        return n * factorial(n-1); // n * (n - 1)!
}