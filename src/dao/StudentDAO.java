package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dto.Student;

public class StudentDAO {
	public static Student insertDAO(int id, String name, String namektkn, String password, String gender, String email,
			String department, String course){
		Student result = null;

		Connection con = null;
		PreparedStatement pstmt = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/qualification?useSSL=false",
					"root",
					"8810310basuke");

			String sql = "INSERT INTO student VALUES(?,?,?,?,?,?,?,?)";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, namektkn);
			pstmt.setString(4, password);
			pstmt.setString(5, gender);
			pstmt.setString(6, email);
			pstmt.setString(7, department);
			pstmt.setString(8, course);

			pstmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			System.out.println("JDBCドライバが見つかりません。");
			e.printStackTrace();
		} catch (SQLException e){
			System.out.println("DBアクセスに失敗しました。");
			e.printStackTrace();
		}catch (Exception e){
			System.out.println("数字を指定してください");
		} finally {
			try{
				if( pstmt != null){
					pstmt.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
			try{
				if(con != null){
					con.close();
				}
			} catch (SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
		}

		return result;
	}

	public static Student loginDAO(int id, String password){
		Student result = null;



		return result;
	}
}
