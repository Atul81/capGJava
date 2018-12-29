package database;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import exception.CapGJava;

public class DBConctn {

	static String query = "select count(ct.curency) as Customers, max(cr.money) as Maximum, ct.id as ID, ct.country as Country, ct.credit_card as Credit_Card, cr.currrency as Currency, cr.cc_type, cr.money, cr.bitcoin from country ct join credit cr on ct.curency = cr.curr_code group by ct.country order by Customers;\r\n"
			+ "";

	public static void main(String[] args) throws CapGJava {
		// TODO Auto-generated method stub
		Logger logger = LoggerFactory.getLogger(DBConctn.class);

		try {
			Properties loadProperties = loadProperties();
			String driver = loadProperties.getProperty("mysql_driver");
			logger.info(driver);
			String password = loadProperties.getProperty("mysql_password");
			logger.info(password);
			String url = loadProperties.getProperty("mysql_url");
			logger.info(url);
			String user = loadProperties.getProperty("mysql_username");
			logger.info(user);

			Class.forName(driver).newInstance();

			Connection con = (Connection) DriverManager.getConnection(url, user, password);
			
			Statement stmnt = (Statement) con.createStatement();
			ResultSet rs = stmnt.executeQuery(query);
			
			while(rs.next()) {
				logger.info(rs.getInt(1) + rs.getString(4));
			}

		} catch (Exception e) {
			Throwable initCause = e.initCause(new IOException("This is sending execution from class"));
			throw new CapGJava("Could Not load " + e.getLocalizedMessage(), e.getCause(), initCause);
		}
	}

	private static Properties loadProperties() throws IOException {
		Properties prop = new Properties();
		InputStream inS = new FileInputStream("src/main/resources/jdbc/jdbc.properties");
		prop.load(inS);
		return prop;
	}
}
