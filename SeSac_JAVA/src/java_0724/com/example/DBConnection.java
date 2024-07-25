package java_0724.com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// 1 ~ 3 까지 수행
public class DBConnection {
    private Properties info;

    public DBConnection() throws IOException {
        this.info = new Properties();
        File file = new File("D:\\Workspace_Java\\SeSac_JAVA\\src\\java_0723\\dbinfo.properties");
        this.info.load(new FileInputStream(file));
    }

    public Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName(this.info.getProperty("DBDRIVER"));
            conn = DriverManager.getConnection(this.info.getProperty("DBURL"),
                                        this.info.getProperty("DBUSER"),
                                        this.info.getProperty("DBPASSWD"));
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        return conn;
    }
}
