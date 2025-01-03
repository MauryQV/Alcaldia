
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    private String nombreP;
    private String apellidoP;
    private int edadP;
    private int carnetP;
    Domicilio domicilio;

    public Persona(String nombreP,String apellidoP,int edadP,int carnetP,Domicilio domicilio){
        this.nombreP = nombreP;
        this.apellidoP = apellidoP;
        this.edadP = edadP;
        this.carnetP = carnetP;
        this.domicilio = domicilio;
    }

    public int getEdadP(){
        return edadP;
    }

    public void setEdadP(int edadP){
        this.edadP = edadP;
    }

    public int getCarnetP(){
        return carnetP;
    }

    public void setCarnetP(int carnetP){
        this.carnetP = carnetP;
    }

    public String getNombreP(){
        return nombreP;
    }

    public void setNombreP(String nombreP){
        this.nombreP = nombreP;
    }

    public String getApellidoP(){
        return apellidoP;
    }

    public void setApellidoP(String apellidoP){
        this.apellidoP = apellidoP;
    }

    public String nombreCompleto(){
        return nombreP + " "+ apellidoP;
    }

    public String informacion(){
        return "Hola soy " + nombreCompleto() + "\n" + "tengo " + getEdadP() + " años \n" + "y mi numero de carnet es: " + getCarnetP();
    }
}
