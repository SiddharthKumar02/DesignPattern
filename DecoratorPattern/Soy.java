public class Soy extends Condiments{
    Beverage bev;
    public Soy(Beverage B){
        this.bev = B;
    }
    public int cost(){
        return 5 + bev.cost();
    }
    public String getDescription(){
        return bev.getDescription() + ", Soy";
    }
}