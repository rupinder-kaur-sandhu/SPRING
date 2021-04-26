package com.uttara.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Model {
	
	public String register(RegBean bean) {
		
		System.out.println("Model ->register() bean = "+bean);
		// validate the bean, if it fails, send back msg to be displayed to user
		//after validating input bean, please do business validation by conecting to Db(if user already exists), if fails msg to be displayed to user
		//apply business logic -> store bean data into table
		//return success msg
		
		String msg = bean.validate();
		if(msg.equals("SUCCESS")) {
			//input validation succeeded
			System.out.println("Model->register(), registration is successfull");
			
			//apply business validation
			
			Connection con = null;
			PreparedStatement ps_sql=null,ps_ins=null;
			ResultSet rs = null;
			try {
				con = JDBCHelper.getConnection();
				if(con == null)
					return "cannot connect to DB";
				else {
					ps_sql = con.prepareStatement("select * from register where email = ? and pass = ?");
					ps_sql.setString(1, bean.getEmail());
					ps_sql.setString(2, bean.getPass());
					ps_sql.execute();
					
					rs = ps_sql.getResultSet();
					if(rs.next())
						return "you duplicate";
					else
					{
						//business validation succeeded
						ps_ins = con.prepareStatement("insert into register(name,email,pass) values (?,?,?)");
						ps_ins.setString(1, bean.getUname());
						ps_ins.setString(2, bean.getEmail());
						ps_ins.setString(3, bean.getPass());
						ps_ins.execute();
						return "SUCCESS";
						
					}
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
				return "Oops something bas happened";
			}
			
			
		}
		else 
			System.out.println("Model->register(), registration is failed "+msg);
			return msg;
	}

}
