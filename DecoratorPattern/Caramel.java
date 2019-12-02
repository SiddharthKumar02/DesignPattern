public class Caramel extends Condiments{
    Beverage bev;
    public Caramel(Beverage bev){
        this.bev=bev;
        
    }
    public String getDescription(){
        return bev.getDescription() + ",Caramel";
    }
    public int cost(){
        return bev.cost()+6;
    }
}