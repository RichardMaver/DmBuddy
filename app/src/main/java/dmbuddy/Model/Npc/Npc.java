package dmbuddy.Model.Npc;

public abstract class Npc {

    private String name;
    private String origins;
    private int age;

    public String getName() {
        return name;
    }
    public String getOrigins() {
        return origins;
    }
    public int getAge() {
        return age;
    }

    public Npc() {
    }

    public Npc(String name, String origins, int age) {
        this.name = name;
        this.origins = origins;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setOrigins(String origins) {
        this.origins = origins;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
