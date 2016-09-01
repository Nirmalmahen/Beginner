import java.util.*;
public class Permutation {
	public static Set<String> repeat(String str)
	{
		Set<String> perm=new TreeSet<String>();
		if(str==null){
			return null;
		}
		else if(str.length()==0){
			perm.add("");
			return perm;
		}
	char initial=str.charAt(0);
	String rem=str.substring(1);
	Set<String> words=repeat(rem);
    for(String strNew:words){
	for(int i=0;i<=strNew.length();i++){
		perm.add(charinsert(strNew,initial,i));
	}
}
	return perm;
	}
	public static String charinsert(String str,char c,int j){
		String begin=str.substring(0,j);
		String end=str.substring(j);
		return begin+c+end;
	}
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the input: ");
		String input=in.nextLine();
		System.out.println("The possible Combinations of"+input+" are:\n"+repeat(input));
	}	
	}