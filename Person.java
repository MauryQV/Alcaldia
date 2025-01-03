
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    private String firstNameP;
    private String lastNameP;
    private int ageP;
    private int identificationP;
    Address address;

    public Person(String firstNameP,String lastNameP,int ageP,int identificationP,Address address){
        this.firstNameP = firstNameP;
        this.lastNameP = lastNameP;
        this.ageP = ageP;
        this.identificationP = identificationP;
        this.address = address;
    }

    public int getAgeP(){
        return ageP;
    }

    public void setAgeP(int ageP){
        this.ageP = ageP;
    }

    public int getIdentificationP(){
        return identificationP;
    }

    public void setIdentificationP(int identificationP){
        this.identificationP = identificationP;
    }

    public String getFirstNameP(){
        return firstNameP;
    }

    public void setFirstNameP(String firstNameP){
        this.firstNameP = firstNameP;
    }

    public String getLastNameP(){
        return lastNameP;
    }

    public void setLastNameP(String lastNameP){
        this.lastNameP = lastNameP;
    }
    
    public String completeName(){
        return firstNameP + " "+ lastNameP;
    }

    @Override
    public String toString(){
        return "Hello my name is: " + completeName() + "\n" + "i'm " + getAgeP() + " years old \n" + "and my carnet ID is : " + getIdentificationP();
    }
}
