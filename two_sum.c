#include<stdio.h>

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    //allocate space for the array
    int *arr = (int*) malloc(sizeof(int) * *returnSize);

    //loop through the array
    int i = 0;
    int *p;
    p[i] = &nums[i];

    int *q;
    
    for(; i < numsSize; i++){
        for(int j = i + 1; j < numsSize; j++){
            q = &nums[j];
            if(*p + *q == target){
                *arr = i;
                arr++;
                *arr = j;
            }
        }
    }
    return arr;
    
}
