

package espoch.edu.ec.claseuno;

import espoch.edu.ec.claseuno.clases.Persona;

/**
 *
 * @author and_j
 */
public class ClaseUno {

    public static void main(String[] args) {
        //INSTANCIAR UNA CLASE
        //class objeto/o/identificador igual new constructor
        Persona objPersona = new Persona();
        objPersona.setNombre("Domenica");
        objPersona.setApellido("Loor");
        objPersona.setId(23);
        objPersona.setNacionalidad("Ecuador");
        objPersona.setFechaNacimiento("2004");
        objPersona.imprimirDatos();
        System.out.println("Datos"+objPersona.imprimirDatos());
        objPersona.imprimir();
    }
}
