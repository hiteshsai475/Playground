#include <stdio.h>
int main() {
  int i,num,lastdigit,originalnumber,sum;
  long factorial;
  scanf("%d",&num);
  originalnumber=num;
  sum=0;
  while(num>0)
  {
    lastdigit=num%10;
    factorial=1;
    for(i=1;i<=lastdigit;i++)
    {
      factorial=factorial*i;
    }
      sum=sum+factorial;
      num=num/10;
  }
  if(sum == originalnumber)
    printf("Yes",originalnumber);
  else
    printf("No",originalnumber);
	//Type your code
	return 0;
}