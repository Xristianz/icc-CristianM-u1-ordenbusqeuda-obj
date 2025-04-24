package app.models;

public class Persona {
    private String nombre;
    private int codigo;
    private Direccion direccion;

    
    public Persona(String nombre, int codigo, Direccion direccion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.direccion = direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public int codigoGetDireccion(){
        return direccion.getCodigo();
    }
    public boolean equalsBycodigoDireccion(Persona otraPersona){
        boolean resp=direccion.getCodigo()>otraPersona.codigoGetDireccion();
        if(resp){
            return true;
        
        }
        return false;

    }
    public boolean equalsBycodigoDireccion(int codigoDireccion){
        boolean resp=codigoGetDireccion()== codigoDireccion;
        if(resp){
            return true;
        
        }
        return false;

    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", codigo=" + codigo + ", direccion=" + direccion + "]";
    }
    
    
}
