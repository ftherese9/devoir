package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Bien;

public class BienRepository {
    public  List<Bien> selectAll(){
        List<Bien> bien=new ArrayList<>();
        try{
         
         Class.forName("com.mysql.cj.jdbc.Driver");
         
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/devoir_iage" 
                   , "root", "root");
         
          Statement statement = conn.createStatement();
          ResultSet rs=   statement.executeQuery("select * from agence");
             while (rs.next()) {
               
                 Bien bi=new Bien();
                 bi.setId(rs.getInt("id_bi"));
                 bi.setReference(rs.getString("ref_bi"));
                 bi.setDescription(rs.getString("descript_bi"));
                 bi.setPrix(rs.getString("prix_bi"));
                 bien.add(bi);
             }
             rs.close();
             conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur de chargement de Driver");
        }
         catch (SQLException e) {
          System.out.println("Erreur de Connexion a la BD");
        }
          return  bien;
    }
    
    public  void insert(Bien bien){
     try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/iagea_ism_2024" 
                    , "root", "root");
             Statement statement = conn.createStatement();
            
             int nbr=statement.executeUpdate("INSERT INTO bien (id_bi, ref_bi, descript_bi) VALUES ('"+bien.getId()+"', '"+bien.getReference()+"', '"+bien.getDescription()+"')");
             conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur de chargement de Driver");
        }
       catch (SQLException e) {
          System.out.println("Erreur de Connexion a la BD");
      }
     }
}
