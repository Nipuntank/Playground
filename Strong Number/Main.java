#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int m=n;
  int sum=0,a,i;
  while(n>0)
  {
    a=n%10;
    int fact=1;
    for(i=1;i<=a;i++)
    {
      fact=fact*i;
    }
    sum=sum+fact;
    n=n/10;
  }
  if(m==sum)
    printf("Yes");
  else
    printf("No");
	return 0;
}