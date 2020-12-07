import java.text.SimpleDateFormat;
import java.util.Date;

public class Friend {
	static SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy");
	private int id;
	private String name;
	private String lastname;
	private String hobbies;
	private String mobno;
	private String email;
	private Date bdate;
	private String address;
	public Friend() {
		id=0;
		name="";
		lastname="";
		hobbies="";
		mobno="";
		email="";
		bdate=null;
		address="";
	}
	public Friend(int id,String nm,String ln,String hb,String mob,String em,Date bd,String add) {
		this.id=id;
		this.name=nm;
		this.lastname=ln;
		this.hobbies=hb;
		this.mobno=mob;
		this.email=em;
		this.bdate=bd;
		this.address=add;
		
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String nm) {
		this.name=nm;
	}
	public void setLatname(String nm) {
		this.lastname=nm;
	}
	public void setHobbies(String hob ) {
		this.hobbies=hob;
	}
	public void setMobno(String mob ) {
		this.mobno=mob;
	}
	public void setEmail(String em ) {
		this.email=em;
	}
	public void setBdate(Date bd ) {
		this.bdate=bd;
	}
	public void setAddress(String add ) {
		this.address=add;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLastname() {
		return lastname;
	}
	public String getHobbies() {
		return hobbies;
	}
	public String getMobno() {
		return mobno;
	}
	public String getEmail() {
		return email;
	}
	public Date getBdate() {
		return bdate;
	}
	public String geAddresst() {
		return address;
	}
	public String toString() {
		return "\nId= "+this.id+"\nName= "+this.name+"\nLastname= "+lastname+"\nHobbies= "+hobbies+"\nMobno= "+mobno+"\nEmail= "+email+"\nBirth Date= "+sdf.format(this.bdate)+"\nAddress= "+address;
	}
	

}
//class ends here
