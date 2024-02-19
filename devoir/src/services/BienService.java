package services;

import java.util.List;

import entities.Bien;
import repositories.BienRepository;
public class BienService{
    private BienRepository bienRepository=new BienRepository();
    
  public List<Bien> listerAgence(){
      return bienRepository.selectAll();
   }
   
   public void ajouterBien(Bien bien){
    bienRepository.insert(bien);
   }
}




    


