
public class Domicilio extends Inmueble
{
    String UbicacionD;
    int numeroD;

    public Domicilio(int precio, String UbicacionD,int numeroD){
        super(precio);
        this.UbicacionD = UbicacionD;
        this.numeroD = numeroD;
    }
}
