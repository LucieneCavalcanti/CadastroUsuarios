package data;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    private Connection con;

    public Conexao() throws Exception {
        String url="";
        String driver="";
        Class.forName(driver);
        con = DriverManager.getConnection(url,"usuario","senha");
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
}
