import java.util.Scanner;
class Proj13
{
public static void main(String args[])
{
Scanner kb=new Scanner(System.in);
String result="";
String [] str=new String[100];
for(int i=0;i<100;i++)
{
int sum=0;
str[i]=kb.nextLine();
//System.out.println("First String"+str);
}
int carry=0;
for(int i=49;i>=0;i--)
{
int sum=0;
for(int j=0;j<100;j++)
{
sum=sum+Integer.parseInt(""+str[j].charAt(i));
}
sum=sum+carry;
String car=""+sum;
carry=Integer.parseInt(car.substring(0,car.length()-1));
if(i==0)
result=sum+result;
else
result=car.substring(car.length()-1)+result;


}
for(int i=0;i<result.length();i++)
if(i>=10)
break;
else
System.out.print(result.charAt(i));
}
}