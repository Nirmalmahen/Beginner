import java.util.*;
class Vowel{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
String a=in.nextLine();
char c=a.charAt(0);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
System.out.println("Vowel");
}
else{
System.out.println("Consonant");
}
}
}