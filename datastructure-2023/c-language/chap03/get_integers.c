#include <stdio.h>

#define SIZE 6

void get_integers(int *plist) {
    printf("6개의 정수를 입력하시오 : ");
    for (int i = 0; i < SIZE; ++i) {
        scanf("%d", &plist[i]);
    }
}

int cal_sum(int *plist) {
    int sum = 0;
    for (int i = 0; i < SIZE; ++i) {
        sum += plist[i];
    }
    return sum;
}

int main(void) {
    int list[SIZE];

    get_integers(list);
    printf("합 = %d \n", cal_sum(list));

    return 0;
}
