package app;

import app.controllers.PersonaController;
import app.models.Direccion;
import app.models.Persona;
import app.views.ViewConsol;

public class App {
    public static void main(String[] args) {
        Persona[] personas = new Persona[5];

        // Crear direcciones y personas
        personas[0] = new Persona("Maria", 30, new Direccion("Calle 2", 23, 56));
        personas[1] = new Persona("Pedro", 35, new Direccion("Calle 3", 34, 67));
        personas[2] = new Persona("Ana", 28, new Direccion("Calle 4", 45, 78));
        personas[3] = new Persona("Juan", 25, new Direccion("Calle 1", 12, 45));
        personas[4] = new Persona("Luis", 40, new Direccion("Calle 5",56,89));
        ViewConsol v = new ViewConsol();
        PersonaController o =new PersonaController();
        v.printArray(personas);
        o.sortByDireccionCodigo(personas);
        v.printArray(personas);

            
    }
    
    
}



