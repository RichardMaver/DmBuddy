package dmbuddy.Model.Npc;

public abstract class Npc {

    private String name;
    private String origins;
    private int age;
    private String race;
    private String className;
    private String alignment;
    private String[] language;

    public String getName() {
        return name;
    }
    public String getOrigins() {
        return origins;
    }
    public int getAge() {
        return age;
    }
    public String getRace() {
        return race;
    }
    public String getClassName() {
        return className;
    }
    public String getAlignment() {
        return alignment;
    }
    public String[] getLanguage() {
        return language;
    }
    
    public Npc() {
    }

    public Npc(String name, String origins, int age, String race, String className, String alignment, String[] language) {
        this.name = name;
        this.origins = origins;
        this.age = age;
        this.race = race;
        this.className = className;
        this.alignment = alignment;
        this.language = language;
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
    public void setRace(String race) {
        this.race = race;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }
    public void setLanguage(String[] language) {
        this.language = language;
    }
    
}
