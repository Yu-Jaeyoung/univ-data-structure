#include <stdio.h>

int fib_iter(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;

    int pp = 0;
    int p = 1;
    int result = 0;

    for (int i = 2; i <= n; i++) {
        result = p + pp;
        printf("result 값 = %d\n ",result);
        pp = p;
        printf("pp 값 = %d\n",pp);
        p = result;
        printf("p 값 = %d\n",p);
    }
    return result;
}