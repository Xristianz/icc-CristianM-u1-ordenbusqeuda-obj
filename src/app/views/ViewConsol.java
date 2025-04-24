package app.views;

import app.models.Persona;

public class ViewConsol {
    public void printArra(Persona[] personas){
        for (Persona persona : personas) {
            System.out.println(persona.toString());
            
        }
    }
       
    
}
