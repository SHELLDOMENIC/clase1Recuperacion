

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
       /* Persona objPersona = new Persona();
        objPersona.setNombre("Domenica");
        objPersona.setApellido("Loor");
        objPersona.setId(23);
        objPersona.setNacionalidad("Ecuador");
        objPersona.setFechaNacimiento("2004");
        objPersona.imprimirDatos();
        System.out.println("Datos- \n"+objPersona.imprimirDatos());
        objPersona.imprimir();
        //formas de mandar un metodo a umprimir
        String result = objPersona.calcularEdad(0);
        System.out.println("resultado"+result);
        objPersona.calcularEdad(0);
       
        System.out.println("resultado"+objPersona.calcularEdad(0));
    
        */
       
       //
       Horario objHorario=new Horario();
       objHorario.setNumeroHorasTrabajadas(5);
       Persona objPersona = new Persona();
       objPersona.situacionTrabajo(objHorario);
       
       objHorario.setDiaLaboral("Lunes");
        
        System.out.println("Resultado"+objPersona.identificarDiaTrabajado(objHorario));
     
       
      System.out.println("Result"+objPersona.situacionTrabajo(objHorario));
    
    
    
    }
    
    
}
