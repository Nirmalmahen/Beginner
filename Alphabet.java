import java.util.*;
class Alphabet{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
String a=in.nextLine();
char c=a.charAt(0);
if((c>='a' && c<='z')||c>='A' && c<='Z')){
System.out.println("Alphabet");
}
else{
System.out.println("Not Alphabet");
}
}
}