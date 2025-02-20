package espoch.edu.ec.claseuno.clases;

import espoch.edu.ec.claseuno.Horario;

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
    public Persona(int id, String nombre, String apellido, String nacionalidad, String fechaNacimiento) {
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
        System.out.println(" Nombre: " + this.nombre + " Apellido: " + this.apellido + " Nacionalidad: " + this.nacionalidad + " Fecha de Nacimiento: " + this.fechaNacimiento);
    }

    public String imprimirDatos() {
        return " Nombre: " + this.nombre + "\n Apellido: " + this.apellido + "\n ID: " + this.id + "\n Nacionalidad: " + this.nacionalidad + "\n Fecha de Nacimiento: " + this.fechaNacimiento;
    }

   /* public String calcularEdad(int edad) {

        String msm;
        if (edad > 0) {
            if (edad > 18) {
                msm = "eres mayor de edad..";
            } else if (edad < 18) {
                msm = "eres menor de edad...";
            }

        } else {
            msm = "no existen edades negativas";
        }
        return msm;
    }*/

    public String situacionTrabajo(Horario objHorario) {
        String msm;
        if (objHorario.getNumeroHorasTrabajadas() > 8) {
            msm = "Estas trabajando mucho";
        } else if (objHorario.getNumeroHorasTrabajadas() == 8) {
            msm = "Estas trabajando lo normal...";

        } else {
            msm = "Aun no has trabjando lo suficinete";
        }

        return msm;
    }

    public String identificarDiaTrabajado(Horario objHorario) {
        String msm;

        switch (objHorario.getDiaLaboral()) {
            case "Lunes":
                msm = "Es un dia Laboral";
                break;
            case "Martes":
                msm = "Es un dia Laboral";
            case "Miercoles":
                msm = "Es un dia Laboral";
            case "Jueves":
                msm = "Es un dia Laboral";
            case "Viernes":
                msm = "Es un dia Laboral";
            default:
                msm = "Es un fin de semana";
        }

        return msm;
    }
    }
