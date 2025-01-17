package mavenproject;

public class Stringprg {

	public static void main(String[] args) {
		String s="first";
		String s1="second";
		System.out.println(s);
		System.out.println(s1);
		char a[]= {'a','r','t'};
		String s2= new String (a);
		System.out.println(s2);
//charAt
		char c=s.charAt(3);
		System.out.println(c);
		//length
	System.out.println(s.length());
	//concat
	System.out.println(s.concat(s1));
	//contains
	String name="My name is Arathi";
	System.out.println(name.contains("Arathi"));
	System.out.println(name.contains("age"));
	String x="First";
	String f="first";
// equals
	System.out.println(x.equals(s));
	System.out.println(f.equals(s));
	//equals ignore case
	System.out.println(x.equalsIgnoreCase(s));
	//upto uppercase
	System.out.println(f.toUpperCase());
	String q="ARATHI";
	System.out.println(q.toLowerCase());
	//value of  - used for type casting
	int e=10;
	String k=String.valueOf(e);
	System.out.println(k);
	String n="";
	System.out.println(n.isEmpty());
	System.out.println(s==f);
	String d=new String("first");
	System.out.println(s==d);
			
	
	}

}
