#include<stdio.h>
int main()
{
  float a,b,pi=3.14,c,d;
  scanf("%f%f",&a,&b);
  c=b/360;
  d=2*pi*a*c;
  printf("%.2f",d);
  return 0;
}
  