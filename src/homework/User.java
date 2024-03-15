package homework;

public class User implements Savable{
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void save() {
        System.out.println("Save user: " + name);
    }
}
