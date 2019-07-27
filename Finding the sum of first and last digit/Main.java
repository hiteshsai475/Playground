#include <stdio.h>
int main() {
  int num,temp,firstdigit,lastdigit;
  scanf("%d",&num);
  temp=num;
  lastdigit=num%10;
  while(num>=10)
  {
    num=num/10;
  }
    firstdigit=num;
  printf("%d",firstdigit+lastdigit);
    
	//Type your code
	return 0;
}