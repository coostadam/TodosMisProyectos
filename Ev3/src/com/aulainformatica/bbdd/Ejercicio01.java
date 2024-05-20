/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.bbdd;

import java.util.Scanner;
import java.sql.*;

/**
 *
 * @author dev
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String r = "";

        do {
            System.out.println("'Insertar' para ir a la insercción de datos.");
            System.out.println("'Consultar' para ir a consultar datos.");
            System.out.println("'S' para salir.");
            System.out.print("¿Que quieres hacer? -> ");
            r = sc.nextLine();
            if (!r.equalsIgnoreCase("S")) {
                if (r.equalsIgnoreCase("Insertar")) {
                    System.out.println("-------------------------");
                    menuInsertar(sc);
                } else if (r.equalsIgnoreCase("Consultar")) {
                    menuConsulta(sc);
                }
            }
        } while (!r.equalsIgnoreCase("S"));

    }

    public static void menuInsertar(Scanner sc) {
        String r;
        do {
            System.out.println("'IE' para insertar empleados.");
            System.out.println("'IV' para insertar vehículos.");
            System.out.println("'IP' para insertar proyectos.");
            System.out.println("'Asignar' para asignar empleado a proyecto.");
            System.out.println("'S' para salir.");
            System.out.print("¿Que quieres hacer? -> ");
            r = sc.nextLine();
            if (!r.equalsIgnoreCase("S")) {
                if (r.equalsIgnoreCase("IE")) {
                    insertarEmpleados(sc);
                } else if (r.equalsIgnoreCase("IV")) {
                    insertarVehiculos(sc);
                } else if (r.equalsIgnoreCase("IP")) {
                    insertarProyectos(sc);
                } else if (r.equalsIgnoreCase("Asignar")) {
                    asignarEmp(sc);
                } else {
                    System.out.println("-------------------------");
                    System.out.println("Repuesta incorrecta.");
                    System.out.println("-------------------------");
                }
            }
        } while (!r.equalsIgnoreCase("S"));
    }

    public static void menuConsulta(Scanner sc) {
        String r;
        do {
            System.out.println("'CEmp' para consultar empleados.");
            System.out.println("'DetalleEmp' para ver los detalles del empleado.");
            System.out.println("'CProy' para consultar proyectos.");
            System.out.println("'DetalleProy' para para ver los detalles del proyecto.");
            System.out.println("'CVehi' para consultar los vehículos.");
            System.out.println("'ProyectoMax' para consultar el proyecto con más personal asignado.");
            System.out.println("'S' para salir.");
            System.out.print("¿Que quieres hacer? -> ");
            r = sc.nextLine();
            if (!r.equalsIgnoreCase("S")) {
                if (r.equalsIgnoreCase("CEmp")) {
                    consultarEmpleados(sc);
                } else if (r.equalsIgnoreCase("DetalleEmp")) {
                    detalleEmpleados(sc);
                } else if (r.equalsIgnoreCase("CProy")) {
                    consultarProyectos(sc);
                } else if (r.equalsIgnoreCase("DetalleProy")) {
                    detalleProyecto(sc);
                } else if (r.equalsIgnoreCase("CVehi")) {
                    consultarVehi(sc);
                } else if (r.equalsIgnoreCase("ProyectoMax")) {
                    consultaProyMax(sc);
                } else {
                    System.out.println("-------------------------");
                    System.out.println("Repuesta incorrecta.");
                    System.out.println("-------------------------");
                }
            }
        } while (!r.equalsIgnoreCase("S"));
    }

    public static void insertarEmpleados(Scanner sc) {
        System.out.println("Ha entrado en la inserción de empleados.");

        String sentencia = "INSERT INTO EMPLEADO(id, nombre, dni, jefe) VALUES(?,?,?,?);";

        System.out.print("Dime el id del empleado: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Dime el nombre del empleado: ");
        String nombre = sc.nextLine();
        System.out.print("Dime el DNI del empleado: ");
        String dni = sc.nextLine();
        System.out.print("Dime el jefe del empleado: ");
        int jefe = Integer.parseInt(sc.nextLine());

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", ""); 
                PreparedStatement stm = con.prepareStatement(sentencia);
                ) {
            stm.setInt(1, id);
            stm.setString(2, nombre);
            stm.setString(3, dni);
            stm.setInt(4, jefe);
            int r = stm.executeUpdate();
            if (r != 1) {
                System.out.println("Inserción fallida.");
            } else {
                System.out.println("Inserción completada.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void insertarVehiculos(Scanner sc) {
        System.out.println("Ha entrado en la inserción de vehículos.");

        String sentencia = "INSERT INTO VEHICULO(matricula, marca, modelo, persona) VALUES(?,?,?,?);";

        System.out.print("Dime la matrícula del vehículo: ");
        String matricula = sc.nextLine();
        System.out.print("Dime la marca del vehículo: ");
        String marca = sc.nextLine();
        System.out.print("Dime el modelo del vehículo: ");
        String modelo = sc.nextLine();
        System.out.print("Dime el id del dueño:  ");
        int propietario = Integer.parseInt(sc.nextLine());
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", ""); 
                PreparedStatement stm = con.prepareStatement(sentencia);
                ) {
            stm.setString(1, matricula);
            stm.setString(2, marca);
            stm.setString(3, modelo);
            stm.setInt(4, propietario);
            
            int r = stm.executeUpdate();
            if (r != 1) {
                System.out.println("Inserción fallida.");
            } else {
                System.out.println("Inserción completada.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void insertarProyectos(Scanner sc) {
        System.out.println("Ha entrado en la inserción de proyectos.");

        String sentencia = "INSERT INTO PROYECTO(codigo, nombre) VALUES(?,?);";

        System.out.print("Dime el código del proyecto: ");
        String codigo = sc.nextLine();
        System.out.print("Dime el nombre del proyecto: ");
        String nombre = sc.nextLine();
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", ""); 
                PreparedStatement stm = con.prepareStatement(sentencia);
                ) {
            
            stm.setString(1, codigo);
            stm.setString(2, nombre);
            
            int r = stm.executeUpdate();
            if (r != 1) {
                System.out.println("Inserción fallida.");
            } else {
                System.out.println("Inserción completada.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void asignarEmp(Scanner sc) {
         System.out.println("Aquí va a asignar empleados a proyectos.");

        String sentencia = "INSERT INTO ASIGNACION(id,codigo) VALUES(?,?);";

        System.out.print("Dime el id del empleado: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Dime el codigo del proyecto: ");
        String codigo = sc.nextLine();
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", ""); 
                PreparedStatement stm = con.prepareStatement(sentencia);
                ) {
            
            stm.setInt(1, id);
            stm.setString(2, codigo);
            
            int r = stm.executeUpdate();
            if (r != 1) {
                System.out.println("Inserción fallida.");
            } else {
                System.out.println("Inserción completada.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void consultarEmpleados(Scanner sc) {
        System.out.println("Consultando los empleados.");
        
        String sentencia = "SELECT e.*, jefe.NOMBRE FROM EMPLEADO AS e LEFT JOIN EMPLEADO AS jefe ON e.JEFE=jefe.ID;";
        
          try ( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root" , "");
               Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sentencia);
                ){
             while(rs.next()){
                 System.out.println("---------------");
                 System.out.print(rs.getInt(1) + " ");
                 System.out.print(rs.getString(2) + " ");
                 System.out.print(rs.getString(3) + " ");
                 System.out.println(rs.getInt(4) + " ");
                 System.out.println(rs.getString(5) + " ");
             }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public static void detalleEmpleados(Scanner sc) {
        System.out.println("Mostrando el detalle de los empleados: ");
        
        System.out.print("ID del empleado que quiers consultar -> ");
        int idEmp = Integer.parseInt(sc.nextLine());
        
        String sentencia = "SELECT e.*, jefe.NOMBRE ,p.*, v.* FROM ASIGNACION AS a JOIN EMPLEADO AS e ON e.ID = a.ID LEFT JOIN EMPLEADO AS jefe ON e.JEFE=jefe.ID "
                + "JOIN PROYECTO AS p ON p.CODIGO = a.CODIGO "
                        + "JOIN VEHICULO AS v ON v.PERSONA = e.ID WHERE e.ID = " + idEmp;
        
        try ( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root" , "");
               Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sentencia);
                ){
             
             while(rs.next()){
                 System.out.println("---------------");
                 System.out.print("id " + rs.getInt(1) + "Nombre ");
                 System.out.print(rs.getString(2) + " DNI ");
                 System.out.print(rs.getString(3) + "Id Jefe ");
                 System.out.print(rs.getInt(4) + " Nombre jefe ");
                 System.out.println(rs.getString(5));
                 System.out.println("Código proyecto " +rs.getString(6));
                 System.out.println("Nombre proyecto " + rs.getString(7) );
                 System.out.print("Matrícula " + rs.getString(8) + " Marca ");
                 System.out.print(rs.getString(9) + " Modelo ");
                 System.out.print(rs.getString(10) + " Persona ");
                 System.out.println(rs.getInt(11));
             }
                 System.out.println("---------------");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public static void consultarProyectos(Scanner sc) {
        System.out.println("Consultando proyectos...");
        
        String sentencia = "SELECT * FROM PROYECTO;";
         
         try ( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root" , "");
               Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sentencia);
                ){
            while(rs.next()){
                 System.out.println("---------------");
                 System.out.print("Codigo " + rs.getString(1) + " Nombre ");
                 System.out.println(rs.getString(2));
            }
            System.out.println("---------------");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
       
    }
    
    public static void detalleProyecto(Scanner sc) {
        System.out.println("Mostrando los detalles del proyecto...");
        
        System.out.print("Codigo del proyecto a consultar -> ");
        String codigo = sc.nextLine();
        
        String sentencia = "SELECT e.*,p.* FROM ASIGNACION AS a JOIN EMPLEADO AS e ON e.ID = a.ID"
                + "JOIN PROYECTO AS p ON p.CODIGO = a.CODIGO "
                        + "WHERE p.CODIGO = " + codigo;
        
        
        try ( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root" , "");
               Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sentencia);
                ){
            while(rs.next()){
                  System.out.println("---------------");
                 System.out.print("id " + rs.getInt(1) + "Nombre ");
                 System.out.print(rs.getString(2) + " DNI ");
                 System.out.print(rs.getString(3) + "Id Jefe ");
                 System.out.print(rs.getInt(4) + " Código proyecto ");
                 System.out.println(rs.getString(5));
                 System.out.println("Nombre proyecto " +rs.getString(6));
            }
            System.out.println("---------------");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void consultarVehi(Scanner sc) {
        System.out.println("Mostrando los vehículos.");
        
        String sentencia ="SELECT v.*, e.NOMBRE FROM VEHICULO AS v LEFT JOIN EMPLEADO AS e ON e.ID=v.PERSONA;";
        
         try ( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root" , "");
               Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sentencia);
                ){
            while(rs.next()){
                 System.out.println("---------------");
                 System.out.print("Matrícula " + rs.getString(1) + " Marca ");
                 System.out.print(rs.getString(2) + " Modelo ");
                 System.out.print(rs.getString(3) + " Id dueño ");
                 System.out.print(rs.getInt(4) + " Nombre dueño ");
                 System.out.println(rs.getString(5));
            }
            System.out.println("---------------");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void consultaProyMax(Scanner sc) {
        System.out.println("Consultando el proyecto con más empleados.");
        
        String sentencia= " SELECT p.NOMBRE,p.CODIGO FROM PROYECTO AS p, ASIGNACION AS a WHERE p.CODIGO=a.CODIGO GROUP BY p.CODIGO HAVING COUNT(*) >= ALL "
                + "(SELECT COUNT(*) FROM ASIGNACION GROUP BY CODIGO);";
        
         try ( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root" , "");
               Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sentencia);
                ){
            while(rs.next()){
                 System.out.println("---------------");
                 System.out.print("Codigo " + rs.getString(1) + " Nombre ");
                 System.out.println(rs.getString(2));
            }
            System.out.println("---------------");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}