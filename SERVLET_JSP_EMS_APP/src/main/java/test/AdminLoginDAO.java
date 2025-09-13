package test;
import java.sql.*;

public class AdminLoginDAO
{
	public AdminBean ab=null;
	public AdminBean login(String uN, String pW) {
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps =con.prepareStatement("select * from admin69 where uname=? and pword=?");
			ps.setString(1, uN);
			ps.setString(2, pW);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ab=new AdminBean();
				ab.setUname(rs.getString(1));
				ab.setPword(rs.getString(2));
				ab.setFname(rs.getString(3));
				ab.setLname(rs.getString(4));
				ab.setCity(rs.getString(5));
				ab.setEmailId(rs.getString(6));
				ab.setPhone(rs.getLong(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ab;
	}

}
