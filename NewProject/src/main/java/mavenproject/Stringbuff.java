package mavenproject;

public class Stringbuff {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb);
StringBuilder sbs=new StringBuilder("hai");
System.out.println(sbs);
//append
sb.append("world");
System.out.println(sb);
//replace
sb.replace(1, 3, "aren");
System.out.println(sb);
//insert to insert or add to specific index
sb.insert(0, "car");
System.out.println(sb);
//reverse
sb.reverse();
System.out.println(sb);
//delete
sb.delete(1, 4);
System.out.println(sb);


	}

}


