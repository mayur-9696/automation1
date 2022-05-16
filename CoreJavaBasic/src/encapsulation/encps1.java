package encapsulation;
class mayur{
	private int ssn;
	private int empage;
	public int getssn() {
	return ssn;
}
    public void setssn(int ssn) {
	this.ssn=ssn;
}
    public int getempage() {
    return empage;
    }
    public void setempage(int empage) {
    	this.empage=empage;
    }
}

public class encps1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mayur m=new mayur();
		System.out.println("ssn value:"+m.getssn());
		System.out.println("empage value:"+m.getempage());
		m.setssn(112233);
		m.setempage(35);
		System.out.println("ssn value:"+m.getssn());
		System.out.println("empage value:"+m.getempage());

	}

}
