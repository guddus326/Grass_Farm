package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbs.Bbs;

public class UserDAO {
	
	private Connection conn;
	private PreparedStatement pstmt,pstmt1;
	private ResultSet rs;
	
		public UserDAO() {
			try{
		
				String dbURL="jdbc:mysql://localhost:3306/grass_farm";
				String dbID="test";
				String dbPassword="1111";
				Class.forName("com.mysql.jdbc.Driver");
				conn=DriverManager.getConnection(dbURL,dbID,dbPassword);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	
		public int login(String userId,String userPassword) {
			String SQL="SELECT userPass From USER WHERE userID=?";
			try {
				pstmt=conn.prepareStatement(SQL);
				pstmt.setString(1, userId);
				rs=pstmt.executeQuery();
				if(rs.next()) {
					if(rs.getString(1).equals(userPassword)) {
						return 1;//로그인 성공
					}
					else {
						return 0;//비밀번호 불일치
					}
				}
				return -1;//아이디가 없다
			}catch(Exception e) {
				e.printStackTrace();
			}
			return -2;
		}


		public int join(User user){	
			if(!user.getUserPass().equals(user.getUserPassCheck())) {
				return -2;
			}else {
			String SQL = "INSERT INTO user(userName, userID, userPass, userEmail) VALUES (?, ?, ?, ?);";
			try {
				pstmt = conn.prepareStatement(SQL);	
				pstmt.setString(1, user.getUserName());
				pstmt.setString(2, user.getUserID());
				pstmt.setString(3, user.getUserPass());
				pstmt.setString(4, user.getUserEmail());
				return pstmt.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return -1;
			}
		}
		public int joinfollow(User user){	
	
			String SQL = "INSERT INTO follow(me,follow) VALUES (?, ?);";
			try {
				pstmt = conn.prepareStatement(SQL);
				pstmt.setString(1, user.getUserID());
				pstmt.setString(2, user.getUserID());
				return pstmt.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return -1;
			}
		

	public ArrayList<User> search(String userName) {
		String SQL="select * from user where userName=?";
		ArrayList<User> list=new ArrayList<User>();
		try {
			pstmt=conn.prepareStatement(SQL);
			pstmt.setString(1,userName);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				User user=new User();
				user.setUserID(rs.getString(1));
				user.setUserName(rs.getString(3));
				user.setUserEmail(rs.getString(4));
				user.setUserDate(rs.getString(5));
				list.add(user);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
			return list;
		}
	
	
	public ArrayList<User> user(String userID) {
		String SQL="select * from user where userID=?";
		ArrayList<User> User=new ArrayList<User>();
		try {
			pstmt=conn.prepareStatement(SQL);
			pstmt.setString(1,userID);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				User user=new User();
				user.setUserName(rs.getString(3));
				user.setUserEmail(rs.getString(4));
				User.add(user);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
			return User;
		}
	
	
}
