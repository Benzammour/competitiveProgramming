#include<stdio.h>

int main(void) {
    int n = 5;
    countBits(n, sizeof(n));
}

int* countBits(int num, int* returnSize) {
    int *res = malloc(returnSize);
    int i = returnSize;

    while (num > 0) {
        int temp = num, count = 0;

        while (temp > 0) {
            if ((temp & 1) == 1) count++;
            temp = temp >> 1;
        }
        i--;
        res[i] = count;
        num--;
    }

    return *res;
}