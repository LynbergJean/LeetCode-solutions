#include<stdio.h>
#include<stdlib.h>


int maxProfit(int* prices, int pricesSize) {
  //basically we're returning the largest interval 
  int *p = prices;

  //q is now pointing to the second element in the array
  int *q;

  //store the largest interval
  int largest_interval = 0;
  
  for(int i = 0; i<pricesSize; i++){
    q = ++p;
    for(int j = i + 1; j < pricesSize; j++){
      if(*q - *p > largest_interval){
        largest_interval = *p - *q;
      }
      q++;
    }
    p++;
  }
  return largest_interval;
}
