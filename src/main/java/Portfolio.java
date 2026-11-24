import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Valuable> valuables;

    Portfolio(){
        this.valuables=new ArrayList<>();
    }

    void addValuable(Valuable valuable){
        valuables.add(valuable);

    }

    double getValue(){
        double sum=0;
        for(Valuable v:valuables){
            sum+=v.getValue();

        }
        return sum;
    }

    ArrayList<Truck> getTrucks(){
        ArrayList<Truck> trucks=new ArrayList<>();
        for(Valuable v: valuables){
            if(v instanceof Truck t){
                trucks.add(t);
            }
        }
        return trucks;
    }


}
