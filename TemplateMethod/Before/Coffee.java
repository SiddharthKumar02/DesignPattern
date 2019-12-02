public class Coffee{
    void prepareRecipe(){
        boilWater();
        brewCoffee();
        pour();
        addMilk();
        System.out.println("Your Coffee is ready!");
    }
    public void boilWater() {
        System.out.println("Boiling Water...");
    }
    public void brewCoffee() {
        System.out.println("Brewing Coffee...");
    }
    public void pour() {
        System.out.println("Pouring Coffee in cup...");

    }
    public void addMilk() {
        System.out.println("Adding Milk...");
    }
}