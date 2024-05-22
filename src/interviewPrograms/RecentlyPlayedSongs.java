package interviewPrograms;

import java.util.Map;
import java.util.Queue;

public class RecentlyPlayedSongs {

	private Map<String, Queue<String>> userSongsMap;
	private int initalCapacity;

	public RecentlyPlayedSongs(Map<String, Queue<String>> userSongsMap, int initalCapacity) {

		this.userSongsMap = userSongsMap;
		this.initalCapacity = initalCapacity;

	}

	public Map<String, Queue<String>> getUserSongsMap() {
		return userSongsMap;
	}

	public void setUserSongsMap(Map<String, Queue<String>> userSongsMap) {
		this.userSongsMap = userSongsMap;
	}

	public int getInitalCapacity() {
		return initalCapacity;
	}

	public void setInitalCapacity(int initalCapacity) {
		this.initalCapacity = initalCapacity;
	}
		
	public boolean removeRecentlyPlayedSongs(String user) {
		if(userSongsMap.isEmpty()) {
			System.out.println("Data storgae is full");
			return false;
		}
		
		if(user==null || !userSongsMap.containsKey(user)) {
			System.out.println(user + " " + "Invalid Username ");
			return false;
		}
		
		userSongsMap.get(user).remove();
		
		return true;
		
		
	}
	
	
	
	
}
