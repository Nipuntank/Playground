#include <stdio.h>
int main() {
	//Type your code
  int n,m1,m2;
  scanf("%d",&n);
  while(n>=10)
  {
    m1=n%10;
    m2=m1;
    n=n/10;
  }
  printf("%d",m2);
	return 0;
}