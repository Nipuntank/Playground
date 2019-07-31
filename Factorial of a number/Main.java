#include <stdio.h>
int main() {
	//Type your code
  int n,result=1;
  scanf("%d",&n);
  int i;
  for(i=1;i<=n;i++)
  {
    result=result*i;
  }
  printf("%d",result);
	return 0;
}