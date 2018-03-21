import java.util.*;

class ReverseWord
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		String str = inp.nextLine();
		String[] strArr = str.split(" ");
		for(int j=0;j<strArr.length;j++)
		{
			for(int i=strArr[j].length()-1;i>=0;i--)
				System.out.print(strArr[j].charAt(i));
			System.out.print(" ");
		}
	}
}
