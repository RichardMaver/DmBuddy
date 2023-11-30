package dmbuddy.Model.Npc;

public abstract class Npc {

    private String name;
    private int age;
    private String race;
    private String alignment;
    private String[] language;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getRace() {
        return race;
    }
    public String getAlignment() {
        return alignment;
    }
    public String[] getLanguage() {
        return language;
    }
    
    public Npc() {
    }

    public Npc(String name, int age, String race, String alignment, String[] language) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.alignment = alignment;
        this.language = language;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setRace(String race) {
        this.race = race;
    }
    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }
    public void setLanguage(String[] language) {
        this.language = language;
    }
    
}
