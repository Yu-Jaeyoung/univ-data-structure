/*
#include <stdio.h>
#include <stdlib.h>

typedef int element; // 스택 자료 유형을 한번에 바꿔주는 역할을 위해 생성

typedef struct {
    //element data[MAX_STACK_SIZE]; // 정적 선언
    element *data;
    int capacity; // 현재 스택 사이즈
    int top;
} StackType;

void init_stack(StackType *s);

void push(StackType *s, element item);

element pop(StackType *s);

//스택 초기화 함수
void init_stack(StackType *s) {
    s->top = -1;
    s->capacity = 1;
    s->data = (element *) malloc(s->capacity * sizeof(element));
}

int is_full(StackType *s) {
    */
/*if (s->top == MAX_STACK_SIZE - 1)
        return 1;
    else
        return 0;*//*
 // 아래와 성능 차이 있음

    //return (s->top == MAX_STACK_SIZE - 1); //동적 선언
    return (s->top == s->capacity - 1); //동적 선언
}

int is_empty(StackType *s) {
    return (s->top == -1);
}

// 삽입 함수 push
void push(StackType *s, element item) {
    // ++(s->top);
    // s->data[s->top] = item;

    if (is_full(s)) {
        //정적 선언시
        //fprintf(stderr, "스택 포화 에러\n");
        //exit(1);

        printf("스택 확장\n");

        // malloc 으로 동적 할당을 하였기 때문에
        // 공간을 늘릴 수 있음.
        s->capacity *= 2;
        s->data = (element *) realloc(s->data, s->capacity * sizeof(element));

        if (s->data == NULL) {
            fprintf(stderr, "메모리 재할당 오류");
            return;
        }

        //return;
    }
    s->data[++(s->top)] = item;
}

// 삭제 함수 pop
element pop(StackType *s) {
    //element item;
    //item = s->data[s->top];
    //(s->top)--;
    //return item;
    if (is_empty(s)) {
        fprintf(stderr, "스택 공백 에러\n");
        exit(1);
    }
    return s->data[(s->top)--];
}

int main(void) {

    StackType s;

    init_stack(&s);

    push(&s, 1);
    push(&s, 2);
    push(&s, 3);
    // 정적 선언 상태//만약 MAX_STACK_SIZE 3으로 선언시 사이즈가 넘쳐서 출력멘트 반환
    // ------------
    // push(&s, 4);
    // push(&s, 5);
    // push(&s, 6);
    // ------------
    push(&s, 4);
    push(&s, 5);
    push(&s, 6);

    printf("%d\n", pop(&s));
    printf("%d\n", pop(&s));
    printf("%d\n", pop(&s));
    printf("%d\n", pop(&s));
    printf("%d\n", pop(&s));
    printf("%d\n", pop(&s));

    free(s.data);
    return 0;
}*/
