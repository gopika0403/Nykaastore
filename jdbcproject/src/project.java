import java.sql.*;
public class project {
public static void main(String[] args) throws Exception {

    select();
			}


	
	
	public void getConnectivity() throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/nykaa";
	String username="root";
	String password="1441";
	String Query="insert into item values(?,?,?,?,?,?)";
	
	Connection con=DriverManager.getConnection(url, username, password);
	PreparedStatement pst=con.prepareStatement(Query);
	pst.setInt(1, 20);
	pst.setString(2, "highlighter");
	pst.setInt(3, 20);
	pst.setInt(4, 249);
	pst.setString(5, "26042023");
	pst.setString(6, "19082026");

	pst.executeUpdate();
	con.close();
	}
	
	public static void selectall()throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/nykaa";
		String username="root";
		String password="1441";
		String Query="select*from item";
		
		Connection con=DriverManager.getConnection(url, username, password);
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery(Query);
		while(rs.next()) {
			System.out.println("product id:"+rs.getInt(1));
			System.out.println("product name:"+rs.getString(2));
			System.out.println("product quantity:"+rs.getInt(3));
			System.out.println("product price:"+rs.getInt(4));
			System.out.println("product manufacture date:"+rs.getString(5));
			System.out.println("product expired date:"+rs.getString(6));
			
		}
		con.close();
		
		
	}
	
	public static void update()throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/nykaa";
		String username="root";
		String password="1441";
		String Query="update item set price='429'where id=11";
		
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		int rows=pst.executeUpdate();
		System.out.println(rows);
		
		con.close();
		
		
	}
	
	public static void delete()throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/nykaa";
		String username="root";
		String password="1441";
		String Query="delete from item where name='concealer'";
		
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		int rows=pst.executeUpdate();
		System.out.println(rows);
		
		con.close();
		
		
	}
	public static void select()throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/nykaa";
		String username="root";
		String password="1441";
		String Query="select*from item where id=20";
		
		Connection con=DriverManager.getConnection(url, username, password);
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery(Query);
		while(rs.next()) {
			int nykaa=rs.getInt("id");
			String details=rs.getString("name");
			System.out.println("product id:"+nykaa);
			System.out.println("product name:"+details);
		
			
		}
		con.close();
		
		
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	

}

