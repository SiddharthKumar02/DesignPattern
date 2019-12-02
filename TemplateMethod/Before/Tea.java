public class Tea{
    void prepareRecipe(){
        boilWater();
        brewTea();
        pour();
        addLemon();
        System.out.println("Your Tea is ready!");
    }
    public void boilWater() {
        System.out.println("Boiling Water...");
    }
    public void brewTea() {
        System.out.println("Brewing Tea...");
    }
    public void pour() {
        System.out.println("Pouring Tea in cup...");

    }
    public void addLemon() {
        System.out.println("Adding lemon...");
    }
}