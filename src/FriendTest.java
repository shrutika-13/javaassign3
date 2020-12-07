import java.util.Scanner;

public class FriendTest {
	
	public static void main(String[] arr) {
		Friend[] frnd = new Friend[2];
		Scanner sc=new Scanner(System.in);
		FriendService.acceptData(frnd);
		
		int choice=0;
		do {
			System.out.println("1.Display all frnd");
			System.out.println("2.Search by id");
			System.out.println("3.Search by name");
			System.out.println("4.Display frnds with particular hobby");
			System.out.println("5.exit");
			System.out.println("enter youe choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1 :
					FriendService.displayFriendtData(frnd);
					break;
			case 2 :
					System.out.println("enter frnd id wants to be search");
					int id=sc.nextInt();
					int res1=FriendService.searchById(frnd,id);
					if(res1==-1) {
						System.out.println("friend not found");
					}
					else {
						System.out.println("friend found");
					}
					break;
			case 3 :
					System.out.println("enter frnd name wants to be search");
					String name=sc.next();
					int res=FriendService.searchByName(frnd,name);
					if(res==-1) {
						System.out.println("friend not found");
					}
					else {
						System.out.println("friend found");
					}
					break;
			case 4 :
					System.out.println("enter hobbie wants to be search");
					String hb=sc.next();
					FriendService.searchByHobbie(frnd,hb);
					break;
			case 5 : 
					System.exit(0);
					break;
			
			}
			
		}while(choice!=0);
		
		
		
		
		sc.close();
		}
}//class ends here
