package OOPS;

public class ObjectFriend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Friend friend1 = new Friend("spongebob");
		Friend friend2 = new Friend("Patrick");
		Friend friend3 = new Friend("Squidward");
		
		System.out.println(Friend.numberOfFriends);
		
		Friend.displayFriends();
	}

}
