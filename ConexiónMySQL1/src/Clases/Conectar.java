package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar 
{
    private static Connection conexión;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String usuario = "root";
    private static final String contraseña = "";
    private static final String dirección = "jdbc:mysql://localhost:3306/basededatos";
    
    public Conectar()
    {
        try
        {
            Class.forName(driver);
            conexión = DriverManager.getConnection(dirección, usuario, contraseña);
            System.out.println("Conexión establecida");
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
    
    public Connection getConnection()
    {
        return conexión;
    }
    
    public void Desconectar()
    {
        conexión = null;
        System.out.println("Conexión terminada");
    }
}