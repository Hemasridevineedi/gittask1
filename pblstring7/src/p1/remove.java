package p1;
import java.util.*;
public class remove {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		if(str.charAt(0)=='x' && str.charAt(str.length()-1)=='x')
		{
			System.out.println(str.substring(1,str.length()-1));
		}
		else if(str.charAt(0)=='x')
		{
			System.out.println(str.substring(1,str.length()));
		}
		else if(str.charAt(str.length()-1)=='x')
		{
			System.out.println(str.substring(0,str.length()-1));
		}
		else
		{
			System.out.println(str);
		}
	}
}
