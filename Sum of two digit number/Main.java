#include<stdio.h>
int main()
{
  //Type your code here
  int num,n1,n2,sum;
  scanf("%d",&num);
  n1=(num/10)%10;
  n2=num%10;
  sum=n1+n2;
  printf("%d",sum);
  return 0;
}