package user;

public class User {
	private String userID;
	private String userPass;
	private String userPassCheck;
	private String userName;
	private String userEmail;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassCheck() {
		return userPassCheck;
	}
	public void setUserPassCheck(String userPassCheck) {
		this.userPassCheck = userPassCheck;
	}	
}
