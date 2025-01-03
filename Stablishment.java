import java.util.*;

public class Stablishment
{
    private String nameS;
    private String addressS;
    ArrayList<Citizen> clients;
    ArrayList<Employed> employers;

    public Stablishment(String nameS, String addressS){

        this.nameS = nameS;
        this.addressS = addressS;
        this.clients = new ArrayList<>();

    }

    public boolean isEmty(){
        return clients.isEmpty();
    }

    public void addClient(Citizen client){
        clients.add(client);
    }

    @Override
    public String toString(){
        return "gente en el establecimiento: "+clients;
    }
}
