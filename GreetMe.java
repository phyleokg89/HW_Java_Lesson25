public class GreetMe{
    public static void main(String...args){
        System.out.println("Hello, I am Java! And you?");

        System.out.print("I am,  ");
        String name = System.console().readLine();

        System.out.println("Hi, " + name + "!");

        System.out.println("And how old are you?");
        
        System.out.print("I am,  ");
        String age = System.console().readLine();

        System.out.println("You are, " + age + "!");
        
        System.out.println("And which city do you live?");
        
        System.out.print("I live in -  ");
        String city = System.console().readLine();

        System.out.println("You  live in a beautiful city "+ city +"!");
    }
}