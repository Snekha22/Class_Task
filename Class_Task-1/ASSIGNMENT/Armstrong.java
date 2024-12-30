package Armstrong;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

int n=153, num, remainder,result=0;
num=n;

while(num!=0)
{
	remainder = num % 10;
	result += Math.pow(remainder,3);
	num /=10;
}
if(result==n)
{
	System.out.println(n + " is a Armstrong Number.");
}
else
{
	System.out.println(n + " is not a Armstrong Number.");

}
	}

}
