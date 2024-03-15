package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Printer printer = new Printer();
        printer.report(user.getName());
        user.save();
    }
}