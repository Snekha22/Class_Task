package Palindrom;

public class Palindrom {

	public static void main(String[] args) {
		
		
int num=121,reverseNum=0,remainder;
	int number=num;
 while(num!=0)
 {
	 remainder=num%10;
    reverseNum=reverseNum*10+remainder;
    num/=10;
 }

 if(number == reverseNum)
{
	System.out.println(number+" is palindrom");    
 }
else
{
	System.out.println(number+" is not palindrom");
}
		       
  }
		

}


