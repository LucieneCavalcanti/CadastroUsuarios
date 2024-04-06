package data;
import java.sql.Connection;
import java.sql.DriverManager;
public class Conexao {
    private Connection con;
    public Conexao() throws Exception {
        String url="//PROFLAB04A\\MSSQLSERVER01:1433;databaseName=bdTesteJava;encrypt=false;trustServerCertificate=true;";
        String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        Class.forName(driver);
        con = DriverManager.getConnection(url,"sa","JavaTop1234");
    }
    public Connection getCon() {
        return con;
    }
    public void setCon(Connection con) {
        this.con = con;
    }
}
