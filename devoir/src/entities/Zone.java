package entities;

import java.util.ArrayList;
import java.util.List;

public class Zone{
    private int id;
    private String nomZone; 
    
    
    public String getNomZone() {
        return nomZone;
    }

    public void setNomZone(String nomZone) {
        this.nomZone = nomZone;
    }

    List<Bien>  bien =new ArrayList<>();
    
    public List<Bien> getBien() {
        return bien;
    }

    public void setBien(List<Bien> bien) {
        this.bien = bien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Zone() {
    }
     


}
