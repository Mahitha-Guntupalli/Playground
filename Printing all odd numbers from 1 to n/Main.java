#include <stdio.h>
int main() {
	//Type your code
  int n,count;
  scanf("%d",&n);
  for(count=1;count<=n;count=count+1)
  {
    if(count%2!=0)
      printf("%d\n",count);
  }
    return 0;
}