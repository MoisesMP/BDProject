package BD;

import java.sql.*;
public class BDTestConnect {
    public static void main(String[] args) {
        BDConnect bdConnect = new BDConnect();

        Connection connection = bdConnect.conexion();

        if (connection != null) {
            System.out.println("¡Conexión exitosa!");
            try {
                connection.close();
                System.out.println("Conexión cerrada");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        } else {
            System.out.println("Error al conectar a la base de datos");
        }
    }
}
