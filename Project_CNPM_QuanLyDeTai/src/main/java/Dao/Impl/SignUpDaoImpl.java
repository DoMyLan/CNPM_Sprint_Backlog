package Dao.Impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.DBConnection;
import Dao.ISignUpDao;
import Models.SignUpModel;

public class SignUpDaoImpl extends DBConnection implements ISignUpDao{
	@Override
	public void insert(SignUpModel signup) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO SignUp(startTime,endTime,role) VALUES (?,?,?)";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setDate(1, (Date) signup.getStartTime());
			ps.setDate(2, (Date) signup.getStartTime());
			ps.setBoolean(3, signup.getRole());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void edit(SignUpModel signup) {
		String sql = "UPDATE  signup SET signupName=?, gender=?, birth=? email=?, phone=? WHERE signupId=?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setString(1, signup.getsignupName());
//			ps.setBoolean(2, signup.getGender());
//			ps.setDate(3, signup.getBirth());
//			ps.setInt(6, signup.getsignupId());
			
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM signup WHERE signupId = ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public SignUpModel get(int id) {
		String sql = "SELECT * FROM signup WHERE username = ? ";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				SignUpModel major = new SignUpModel();
//				signuper.setsignupId(rs.getInt("signupId"));
//				signuper.setsignupName(rs.getString(id));
//				signuper.setsignupId(rs.getInt("signupId"));
//				signuper.setBoolean(3, signup.getBoolean());
//				signuper.setCreatedAt(rs.getDate("createdAt"));
//				signuper.setPrice(rs.getBigDecimal("price"));
		
				return major;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<SignUpModel> getAll() {
		List<SignUpModel> signup= new ArrayList<SignUpModel>();
		String sql = "SELECT * FROM signup";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				SignUpModel major = new SignUpModel();
				
//				signuper.setsignupId();
//				signuper.setsignupName(rs.getString(id));
//				signuper.setsignupId(rs.getInt("signupId"));
//				signuper.setBoolean(3, signup.getBoolean());
//				signuper.setCreatedAt(rs.getDate("createdAt"));
//				signuper.setPrice(rs.getBigDecimal("price"));
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return signup;
	}

	@Override
	public SignUpModel getLast() {
		SignUpModel signup = null;
		String sql = "SELECT Top 1 * FROM signup ORDER BY signUpId DESC ";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int signUpId = rs.getInt("signUpId");
				Date startTime= rs.getDate("startTime");
				Date endTime = rs.getDate("endTime");
				Boolean role = rs.getBoolean("role");
				signup = new SignUpModel(signUpId,startTime,endTime,role);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return signup;
	}

	@Override
	public SignUpModel findById(int id) {
		String sql = "SELECT * FROM signup WHERE id = ? ";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				SignUpModel signup = new SignUpModel();

//				signuper.setsignupId(rs.getInt("signupId"));
//				signuper.setsignupName(rs.getString(id));
//				signuper.setsignupId(rs.getInt("signupId"));
//				signuper.setCreatedAt(rs.getDate("createdAt"));
//				signuper.setPrice(rs.getBigDecimal("price"));
				
				return signup;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
}
