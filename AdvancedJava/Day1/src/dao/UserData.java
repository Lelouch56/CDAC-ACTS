package dao;

import static dbutils.DbConnect.*;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojos.User;

public class UserData {
	private Connection cn;
	private PreparedStatement pst;
	public UserData() throws SQLException {
		cn=openConnect();
		pst=cn.prepareStatement("select first_name,last_name,dob,status from users where role=? and dob between ? and ?");
	System.out.println("Connection Established");
	}
	 
	public List<User> getSelectedData(String role,Date a,Date b) throws SQLException{
		pst.setString(1,role);
		pst.setDate(2, a);
		pst.setDate(3, b);
		List<User>l1=new ArrayList<>();
		
		ResultSet rst=pst.executeQuery();
		
		while(rst.next()) {
			l1.add(new User(rst.getString(1),rst.getString(2),rst.getBoolean(4),rst.getDate(3)));
		}
		rst.close();
		
		return l1;
	}
	
	public void cleanUp() throws SQLException {
		if(pst!=null) {
			pst.close();
		}
		closeConnect();
	}
}
