class rev{
public static void main(String args[]){
	String str = "arjun patil";
String rev="";
str = str.replaceAll("\\s","");
	for(int i=str.length()-1; i>=0; i--)
		rev+=str.charAt(i);
System.out.println(rev);
}
}
