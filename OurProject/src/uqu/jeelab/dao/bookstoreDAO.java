package uqu.jeelab.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import uqu.jeelab.model.bookstore;

public class bookstoreDAO {
	private static String URL ="db4free.net:3306/myproject";
	private static String user ="shahadnajee";
	private static String password ="12345678";
	private Connection connect = null;
	private ResultSet resultSet = null;
	private ArrayList resList = new ArrayList();
public ArrayList getbookstore() throws Exception {
try {
	connect = DriverManager.getConnection("jdbc:mysql://"+URL,user,password);
Statement statement = connect.createStatement();
String sql ="select * from bookstore";
resultSet = statement.executeQuery(sql);
while (resultSet.next()) {
	
	String NameOfBook = resultSet.getString("NameOfBook");
	String price = resultSet.getString("Price");
	resList.add(new bookstore(NameOfBook, price));
}
return resList; }
catch (Exception e) {
throw e; } finally { close();
}}
private void close() {
try {
if (resultSet != null) {
resultSet.close();
}
if (connect != null) {
connect.close();
}
} catch (Exception e) {
e.printStackTrace();
}
}
}
