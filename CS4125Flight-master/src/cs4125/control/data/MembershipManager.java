package cs4125.control.data;

public interface MembershipManager {

	public void addPoints(int points, int userID) throws Exception;

	public void subtractPoints(int points, int userID);

}
