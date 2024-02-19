
import java.util.List;
import java.util.Scanner;

import entities.Bien;
import entities.Zone;

public class View{
    public static void main(String[] args) throws Exception {
       int choix;
        Scanner sc=new Scanner(System.in);
      
        BienService bienService=new BienService();

        do {
            System.out.println("1-Créer une zone");
            System.out.println("2-Lister les zones"); 
            System.out.println("3-Ajouter un bien et lui associe une zone"); 
            System.out.println("Quitter");
             choix=sc.nextInt();
             sc.nextLine();
            switch (choix) {
                case 1:
                     System.out.println("Entrer un numero");
                     String numero=sc.nextLine(); 
                     System.out.println("Entrer un Telephone");
                     String tel=sc.nextLine();  
                     System.out.println("Entrer une Adresse");
                     String adresse=sc.nextLine();   
                     Bien ag=new Bien();
                      ag.setId(id);
                      ag.setReference(reference);
                      ag.setDescription(description);
                    bienService.ajouterBien(bien);
                    break;
                
                case 2:
                    List<Bien> bien=  bienService.listerBien();
                     for (Bien bien: bien) {
                          System.out.println("Id "+ bien.getId());
                          System.out.println("Reference "+ bien.getReference());
                          System.out.println("Description"+ bien.getDescription());
                          System.out.println("********************************");
                     }
                    break;

                 

        } while (choix!=4);
        
    }
}
