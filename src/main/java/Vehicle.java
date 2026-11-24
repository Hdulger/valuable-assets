public  abstract class Vehicle implements Valuable{

    String makeModel;
    double initialCost;
    int initialMileage;
    int currentMileage;
    final static double DEPRECIATION_PER_MILE = 0.05;

    public Vehicle(String makeModel, double initialCost, int initialMileage) {
        this.makeModel = makeModel;
        this.initialCost = initialCost;
        this.initialMileage = initialMileage;
    }

    public void drive(int miles){
        this.currentMileage+=miles;
    }

    @Override
    public double getValue(){
        int mileage=this.currentMileage-this.initialMileage;
        return this.initialCost-(DEPRECIATION_PER_MILE*mileage);
    }



}
