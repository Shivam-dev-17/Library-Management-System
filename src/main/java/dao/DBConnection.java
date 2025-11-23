import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class DBConnection {
    private static final String DB_URL = "jdbc:sqlite:library.db";
    private static Connection conn = null;

    public static Connection getConnection() throws SQLException {
        if (conn == null || conn.isClosed()) {
            conn = DriverManager.getConnection(DB_URL);
        }
        return conn;
    }

    public static void initializeDatabase(){
        try (Connection c = getConnection(); Statement stmt = c.createStatement()) {
            InputStream is = DBConnection.class.getResourceAsStream("/schema.sql");
            if (is != null) {
                String sql = new Scanner(is, StandardCharsets.UTF_8).useDelimiter("\\A").next();
                for (String s : sql.split(";")) {
                    String trim = s.trim();
                    if (!trim.isEmpty()) stmt.execute(trim);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
