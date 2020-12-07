import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FriendService {
	
public static void acceptData(Friend[] arr) {
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy");
	Scanner sc=new Scanner (System.in);
	for(int i=0;i<arr.length;i++) {
		System.out.println("enter frnnd id : ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter frnd name : ");
		String nm=sc.next();
		System.out.println("Enter frnd Lastname : ");
		String ln=sc.next();
		System.out.println("Enter frnd Hobbies : ");
		String hb=sc.next();
		System.out.println("Enter frnd mobile number : ");
		String mob=sc.next();
		System.out.println("Enter frnd email : ");
		String em=sc.next();
	
		System.out.println("Enter frnd Address : ");
		String ad=sc.next();
		System.out.println("Enter frnd birth date(dd/mm/yy) : ");
		String dt=sc.next();
		Date dt1;
		try {
			dt1= sdf.parse(dt);
			arr[i]=new Friend(id,nm,ln,hb,mob,em,dt1,ad);
			}catch(ParseException e) {
				e.printStackTrace();
			}
		
		
		}
	}//acceptData
	
public static void displayFriendtData(Friend[] frnd) {
	
	for(int i=0;i<frnd.length;i++) {
		System.out.println(frnd[i]);
	
	}		
}
public static int searchByName(Friend[] frnd,String nm) {
	for(int i=0;i<frnd.length;i++) {
		if(frnd[i].getName().contains(nm)) {
			return i;
		}
	}
	return -1;
}

public static int searchById(Friend[] frnd, int id) {
	for(int i=0;i<frnd.length;i++) {
		if(frnd[i].getId()==id) {
			return i;
		}
	}
	return -1;
}

public static void searchByHobbie(Friend[] frnd, String hb){
	for(int i=0;i<frnd.length;i++) {
		if(frnd[i].getHobbies().contains(hb)) {
			System.out.println(frnd[i]);
		}
	}
	System.out.println("friend not matching hobbies ");
	
}
}//class ends










