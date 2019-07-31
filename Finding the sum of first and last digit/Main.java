#include <stdio.h>
int main() {
	//Type your code
  int num,last,sum;
  scanf("%d",&num);
  last=num%10;
  while(num>=10)
  {
    num=num/10;
  }
  sum=num+last;
  printf("%d",sum);
	return 0;
}