#include <stdio.h>
int main() {
  int a,b,n;
  scanf("%d",&a);
  b=a;
  while(a>0)
  {
    
  
  
  if(a>=10&&a<100)
  {
      a=a%10;
      printf("%d",a);
  }
  a=a/10;
}
  
	//Type your code
	return 0;
}