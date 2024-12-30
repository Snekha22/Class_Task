package RevNum;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=1234, reverseNum=0, remainder;


while(n>0)
{
	remainder=n%10;
	reverseNum=reverseNum *10 +remainder;
	n=n/10;
}

		
		System.out.println("Reversed Number Is:" + reverseNum );
	}

}
