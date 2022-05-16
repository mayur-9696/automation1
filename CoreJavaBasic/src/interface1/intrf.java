package interface1;
interface bank{
	float roi();
}
class sbi implements bank{
	public float roi() {
		return 9.15f;
	}
}
class pnb implements bank{
	public float roi() {
		return 9.7f;
	}
}

public class intrf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sbi s1= new sbi();
		System.out.println("sbi roi"+s1.roi());
		pnb p1=new pnb();
		System.out.println("pnb roi"+p1.roi());
		bank b=new sbi();
		System.out.println("pnb roi"+b.roi());

	}

}
