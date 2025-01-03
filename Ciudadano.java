
/**
 * Write a description of class Ciudadano here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ciudadano extends Persona
{
    Domicilio domicilio;

    public Ciudadano(String nombreP, String apellidoP,int edadP,int carnetP,Domicilio domicilio){
        super(nombreP,apellidoP,edadP,carnetP);
        this.domicilio = null;

    }
}
