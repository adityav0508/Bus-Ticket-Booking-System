    import java.sql.Connection;
	import net.proteanit.sql.DbUtils;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	import javax.swing.JOptionPane;
	import javax.swing.JTable;

	public class Jtable{
		private static String url = "jdbc:mysql://127.0.0.1:3306/bus_system";
		private static String user = "root";
		private static String pass = "";
		private static String driver = "com.mysql.jdbc.Driver";
		
		public void ShowDataInJtable(String q , JTable x) {
			String sql;
			PreparedStatement stm = null;
			Connection con = null;
			Statement stmt = null;
			String user_id;
			String pas = null;
			String name = null;
			ResultSet rs = null;
			int b = 0;
		try {
		Class.forName(driver);

		con = DriverManager.getConnection(url, user, pass);

		stmt = con.createStatement();
	    stmt.executeQuery(q);
	    rs = stmt.executeQuery(q);
	    x.setModel(DbUtils.resultSetToTableModel(rs));
	}catch (SQLException ex) {
		  JOptionPane.showMessageDialog(null, ex);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
	  try {
	 rs.close();
	} catch (SQLException e) { /* ignore */
	}

	try {
	 stmt.close();
	} catch (SQLException e) { /* ignore */
	}
	}
		}

}
