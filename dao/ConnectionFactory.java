package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
    
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:sqlserver://vaio\\MSSQL14.MSSQLSERVER:1433;databaseName=loja;user=sa;password=147852");
        }catch(final SQLException e){
            throw new RuntimeException(e);
        }
    }
}
