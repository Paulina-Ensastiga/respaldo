package com.gen.users;

public class FreeUser {
	private int friendsCount;
	
	public FreeUser (String username, String emial, int friendsCount) {
		this.friendsCount = friendsCount;
	}
	
	public void addFriend(User user) {
		System.out.println("Added" + user.getUsername() + " as friend");
	}

	public int getFriendsCount() {
		return friendsCount;
	}

	public void setFriendsCount(int friendsCount) {
		this.friendsCount = friendsCount;
		
	}

	@Override
	public String toString() {
		return "FreeUser [friendsCount=" + friendsCount + "]";
	}

}
