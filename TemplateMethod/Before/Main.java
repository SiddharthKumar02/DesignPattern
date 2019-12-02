public class Main{
    public static void main(String[] args){
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("Making Coffee...");
        coffee.prepareRecipe();
        System.out.println("Making Tea...");
        tea.prepareRecipe();
    }
}