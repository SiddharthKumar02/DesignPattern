public class Starbucks{
    public static void main(String[] args){
        Beverage b1 = new DarkRoast();
        Beverage b2 = new HouseBlend();
        System.out.println(b1.getDescription() + b1.cost());
        b1 = new Soy(b1);
        b1 = new Caramel(b1);
        System.out.println(b1.getDescription() + b1.cost());
    }
}