#include <stdio.h>
// 순환적인 방법
double power(double x, int n) {
    if (n == 0)
    {
        printf("n == 0 이므로 1을 반환합니다.\n");
        return 1;
    }
    else if (n % 2 == 0){
        printf("n_2 == 0 실행\n");
        return power(x * x, n / 2);
    }
    else
    {
        printf("else문 실행\n");
        return x * power(x * x, (n - 1) / 2);
    }
}