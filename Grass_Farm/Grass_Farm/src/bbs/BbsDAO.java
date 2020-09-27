package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BbsDAO {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public BbsDAO() {
		try{
			String dbURL="jdbc:mysql://localhost:3306/grass_farm?useUnicode=true&characterEncoding=UTF-8";
			String dbID="test";
			String dbPassword="1111";
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(dbURL,dbID,dbPassword);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Bbs> getList() {
		String SQL="select * from bbs order by bbsID desc";
		ArrayList<Bbs> list=new ArrayList<Bbs>();
		try {
			pstmt=conn.prepareStatement(SQL);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Bbs bbs=new Bbs();
				bbs.setBbsID(rs.getInt(1));
				bbs.setBbsTitle(rs.getString(2));
				bbs.setBbsContent(rs.getString(5));
				bbs.setBbsDate(rs.getString(4));
				list.add(bbs);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
			return list;
		}
	//실제로 글을 작성하는 함수
	public int write(Bbs bbs) { 
		String SQL = "INSERT INTO bbs(bbsTitle,userID, bbsContent) VALUES (?,?,?);";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, bbs.getBbsTitle());
			pstmt.setString(2, bbs.getUserID());
			pstmt.setString(3, bbs.getBbsContent());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; //데이터베이스 오류
	}
	}
