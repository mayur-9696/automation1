package String;

public class String1 {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
	    String1 c= new String1();
	   // String s="abcdef";
	   
		String s="mumbai";
		String s1="pune";
		String s2="nagar";
		String s3="balod";
		String s4="balod";
		
	System.out.println(" "+s);
	System.out.println(" "+s1);
	System.out.println(" "+s2);
	System.out.println(" "+s3);
	System.out.println(" "+s4);
	System.out.println("s & s1 using equal   " +s.equals(s1));
	System.out.println("s & s1 using   " +(s==s1));
	System.out.println("s & s1 using equal  " +s1.equals(s2));
	System.out.println("s & s1 using   " +(s1==s2));
	System.out.println("s & s1 using equal  " +s2.equals(s3));
	System.out.println("s & s1 using   " +(s2==s3));
	System.out.println("s & s1 using equal  " +s3.equals(s4));
	System.out.println("s3 & s4 using   " +(s3==s4));
	String s5=new String("solapur");
	String s6=new String("solapur");
	System.out.println("s & s1 using equal  " +s5.equals(s6));
	System.out.println("s & s1 using   " +(s5==s6));
	String d="pune";
	String g="1534";
	String c1=d.concat(g);
	System.out.println(c1);

}
}