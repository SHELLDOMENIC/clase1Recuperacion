
package espoch.edu.ec.claseuno.clases;

/**
 *
 * @author and_j
 */
public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private String fechaNacimiento;
    
    
    //constructores 
    public Persona(int id, String nombre, String apellido, String nacionalidad, String fechaNacimiento){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona() {
        
    }
    //setters and getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
   
    //metodos
    public void imprimir() {
        System.out.println(" Nombre: "+this.nombre+" Apellido: "+this.apellido+" Nacionalidad: "+this.nacionalidad+" Fecha de Nacimiento: "+this.fechaNacimiento);
    }
    public String imprimirDatos(){
    return " Nombre: "+this.nombre+ "\n Apellido: "+this.apellido+"\n ID: "+this.id+"\n Nacionalidad: "+this.nacionalidad+"\n Fecha de Nacimiento: "+this.fechaNacimiento;
    }
    
}
