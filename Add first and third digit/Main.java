#include<stdio.h>
int main()
{
  //Type your code here
  int n,n1,n2,sum;
  scanf("%d",&n);
  n1=n/100;
  n2=n%100%10;
  sum=n1+n2;
  printf("%d",sum);
  return 0;
}