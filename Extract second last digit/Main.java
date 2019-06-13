#include<stdio.h>
int main()
{
  //Type your code here
  int num,n,n1;
  scanf("%d",&num);
  n=num/10;
  n1=n%1000%100%10;
  printf("%d",n1);
  return 0;
}