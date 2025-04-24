package app.controllers;

import app.models.Persona;

public class PersonaController {
    public void sortByDireccionCodigo(Persona[] personas){
        int index = 0;
        for (int i = 0; i <personas.length-1; i++) {
            index = i;
            for (int j = i+1; j < personas.length-1; j++) {
                if(personas[j].equalsBycodigoDireccion(personas[index])){
                    index = j;
                }
            }
            if (index != i ) {
                Persona temPersona = personas[index];
                personas[index] = personas[i];
                personas[i] = temPersona;

            }
        }
    }

    public void findByCodigo(Persona[] personas, int codigo){
        int bajo=0;
        int alto=personas.length-1;
        while (bajo<=alto) {
            int center= (alto-bajo)/2;
            if (personas[center].equalsBycodigoDireccion(codigo)==true){
                return personas [center];
            }else if (personas[center].codigoGetDireccion()>codigo){

            }
            
        }
        return null;

    }
    
}
