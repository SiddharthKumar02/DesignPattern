public abstract class Beverage{
    void prepareMethod(){
        boilWater();
        brew();
        pour();
        addCondiments();
    }
    public void boilWater(){
        System.out.println("Boiling Water...");
    }
    public void pour(){
        System.out.println("Pouring in cup...");
    }
    abstract void brew();
    abstract void addCondiments();
}