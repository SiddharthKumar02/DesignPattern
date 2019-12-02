public class Driver{
    public static void main(String[] args){
        Beverage coff = new Coffee();
        Beverage tea = new Tea();
        System.out.println("Preparing Coffee...");
        coff.prepareMethod();
        System.out.println("Preparing Tea...");
        tea.prepareMethod();

    }
}