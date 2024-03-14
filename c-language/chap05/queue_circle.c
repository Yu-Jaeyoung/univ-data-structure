/*
#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <stdlib.h>

#define MAX_QUEUE_SIZE 5

typedef int element;
typedef struct {
    int front;
    int rear;
    element data[MAX_QUEUE_SIZE];
} QueueType;

void init_queue(QueueType *q) {
    q->rear = q->front = 0;
}

int is_full(QueueType *q) {
    return ((q->rear + 1) % MAX_QUEUE_SIZE == q->front);
}

int is_empty(QueueType *q) {
    return (q->front == q->rear);
}

void error(char *message) {
    fprintf(stderr, "%s\n", message);

    exit(1);
}

//삽입함수
void enqueue(QueueType *q, element item) {
    if (is_full(q)) {
        error("큐가 포화상태 입니다.");
        return;
    }
    q->rear = (q->rear + 1) % MAX_QUEUE_SIZE;
    q->data[q->rear] = item;
}

element dequeue(QueueType *q) {
    if (is_empty(q)) {
        error("큐가 공백상태입니다.");
        return -1;
    }
    q->front = (q->front + 1) % MAX_QUEUE_SIZE;
    return q->data[q->front];
}

void queue_print(QueueType *q) {
    for (int i = 0; i < MAX_QUEUE_SIZE; i++) {
        if (i <= q->front || i > q->rear) {
            printf("|");
        } else {
            printf("%d|", q->data[i]);
        }
    }
    printf("\n");
}

int main(void) {
    QueueType queue;
    int element;

    init_queue(&queue);
    printf("데이터 추가 단계\n");
    while (!is_full(&queue)) {
        printf("정수를 입력하시오 :");
        scanf("%d", &element);
        enqueue(&queue, element);
        queue_print(&queue);
    }
    printf("큐는 포화상태입니다.\n\n");

    printf("데이터 삭제 단계\n");
    while(!is_empty(&queue)){
        element = dequeue(&queue);
        printf("꺼내진 정수 : %d \n",element);
        queue_print(&queue);
    }
    printf("큐는 공백상태입니다.\n");

    return 0;
}
*/
