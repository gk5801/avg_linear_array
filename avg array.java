import java.util.*;
import java.io.*;
class Average
{
public static float avg(int arr[])
{



int len=arr.length;
int max = arr[0];
int min = arr[0];
float sum = arr[0];
for(int i = 1; i < len; i++)
{
sum += arr[i];
if(arr[i] > max)
max = arr[i];
else if(arr[i] < min)
min = arr[i];
}
float x = ((sum-max-min) / (len - 2));
return x;
}



public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Average:"+avg(arr));
}
}
