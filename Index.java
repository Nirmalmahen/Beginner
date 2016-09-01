import java.util.*;
public class Index {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
	String b= ArrayIndex(s);
	System.out.println(b);
	}
	public static String ArrayIndex(String str2){
		String str1="";
		String str[]=str2.split(",");
		Arrays.sort(str);
		for(int i=0;i<str.length;i++)
		{
     	if(i==Integer.parseInt(str[i]))
		    str1=str1+i+" ";
		}
		return str1;
	}
}
