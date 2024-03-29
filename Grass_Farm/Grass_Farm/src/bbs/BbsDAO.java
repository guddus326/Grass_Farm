package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;

import user.User;

public class BbsDAO {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Statement statement;
	
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
	
	public ArrayList<Bbs> getList(String follow,String userid) {
		String SQL="select bbsID,bbsTitle,userID, date_format(bbsDate, '%Y-%m-%d'),bbsContent,bbsSource,bbsLanguage  "
				+ "from bbs where userID=? or userID=? order by bbsID desc";
		ArrayList<Bbs> list=new ArrayList<Bbs>();
		try {
			pstmt=conn.prepareStatement(SQL);
			pstmt.setString(1,follow);
			pstmt.setString(2,userid);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Bbs bbs=new Bbs();
				bbs.setBbsID(rs.getInt(1));
				bbs.setBbsTitle(rs.getString(2));
				bbs.setBbsDate(rs.getString(4));
				bbs.setBbsContent(rs.getString(5));
				bbs.setBbsSource(rs.getString(6));
				bbs.setBbsLanguage(rs.getString(7));
				list.add(bbs);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
			return list;
	}
	
	
	//실제로 글을 작성하는 함수
	public int write(Bbs bbs) { 
		String SQL = "INSERT INTO bbs(bbsTitle,userID, bbsSource,bbsContent,bbsLanguage) VALUES (?,?,?,?,?);";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, bbs.getBbsTitle());
			pstmt.setString(2, bbs.getUserID());
			pstmt.setString(3, bbs.getBbsSource());
			pstmt.setString(4, bbs.getBbsContent());
			pstmt.setString(5, bbs.getBbsLanguage());

			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; //데이터베이스 오류
	}
	
	public ArrayList<Bbs> getrepo(String userID) {
		String SQL="select bbsID,bbsTitle,userID, date_format(bbsDate, '%Y-%m-%d'),bbsContent,bbsSource,bbsLanguage from bbs where userID=? order by bbsID desc";
		ArrayList<Bbs> repo=new ArrayList<>();
		try {
			pstmt=conn.prepareStatement(SQL);
			pstmt.setString(1,userID);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Bbs bbs=new Bbs();
				bbs.setBbsID(rs.getInt(1));
				bbs.setBbsTitle(rs.getString(2));
				bbs.setBbsDate(rs.getString(4));
				repo.add(bbs);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
			return repo;
		}
	public Bbs getBbs(int bbsID) {
		String SQL = "SELECT * FROM BBS WHERE bbsID = ?";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, bbsID);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				Bbs bbs = new Bbs();
				bbs.setBbsID(rs.getInt(1));
				bbs.setBbsTitle(rs.getString(2));
				bbs.setUserID(rs.getString(3));
				bbs.setBbsDate(rs.getString(4));
				bbs.setBbsContent(rs.getString(5));
				bbs.setBbsSource(rs.getString(6));
				bbs.setBbsLanguage(rs.getString(7));
				return bbs;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
		
	public ArrayList<Bbs> search(String catgo, String sear) {
		String SQL="select * from bbs where " + catgo + " like ? order by bbsID desc"; 
		ArrayList<Bbs> search=new ArrayList<>();
		try {
			pstmt=conn.prepareStatement(SQL);
			pstmt.setString(1, "%" + sear + "%");
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Bbs bbs = new Bbs();
				bbs.setBbsID(rs.getInt(1));
				bbs.setBbsTitle(rs.getString(2));
				bbs.setBbsDate(rs.getString(4));
				bbs.setBbsContent(rs.getString(5));
				bbs.setBbsSource(rs.getString(6));
				bbs.setBbsLanguage(rs.getString(7));
				search.add(bbs);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
			return search;
		}
	public int update(Bbs bbs, int bbsID) { 
		String SQL = "UPDATE bbs SET bbsTitle=?, bbsSource=?, bbsContent=?,bbsLanguage=? where bbsID=?;";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, bbs.getBbsTitle());
			pstmt.setString(2, bbs.getBbsSource());
			pstmt.setString(3, bbs.getBbsContent());
			pstmt.setString(4, bbs.getBbsLanguage());
			pstmt.setInt(5, bbsID);

			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; //데이터베이스 오류
	}
	public int delete(int bbsID) {
		String SQL = "delete from bbs WHERE bbsID = ?";
		try {
			pstmt = conn.prepareStatement(SQL);   
			pstmt.setInt(1, bbsID);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; // 데이터베이스 오류
	}
	
	public int getCount(String userId) {
		String SQL = "select count(*) from bbs where userID=?;";
		int resultCount = 0;
	try {
		pstmt = conn.prepareStatement(SQL);   
		pstmt.setString(1, userId);
		rs=pstmt.executeQuery();
		if(rs.next()){
			resultCount=rs.getInt(1);
		}	
		
	}catch(Exception e) {
		e.printStackTrace();
		
	}
	return resultCount;
		
	}
	
	public int getmonthCount(String userId,String month) {
		System.out.println(month);
		String SQL = "select count(*) from bbs where userID=? and MONTH(bbsDate)=?;";
		int resultCount = 0;
	try {
		pstmt = conn.prepareStatement(SQL);   
		pstmt.setString(1, userId);
		pstmt.setString(2, month);
		rs=pstmt.executeQuery();
		if(rs.next()){
			resultCount=rs.getInt(1);
		}	
		
	}catch(Exception e) {
		e.printStackTrace();
		
	}
	return resultCount;
		
	}
	
	public List<String> getalldate(String userId) {
		String SQL="select bbsdate from bbs where userID=?;";
		List<String> resultCount = new ArrayList<String>();
		try {
			pstmt = conn.prepareStatement(SQL);   
			pstmt.setString(1, userId);
			rs=pstmt.executeQuery();
			while(rs.next()){
				resultCount.add(rs.getString(1));
			}
			
                 
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		return resultCount;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
