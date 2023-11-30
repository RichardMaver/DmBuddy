package dmbuddy.Model.Npc;

public abstract class Character {
    private String name;
    private int age;
    private String race;
    private String className;
    private String subClassName;
    private String alignment;
    private String[] language;
    private int armorClass;
    private int hp;
    private int speed;
    private String background;
    private String level;
    private String personality;
    private String ideals;
    private String bonds;
    private String flaws;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private String[] features;
    private String[] traits;
    private String[][] equipment;
    private String[] proficiencies;
    
    
    public String getName() {
        return name;
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
    public String getSubClassName() {
        return subClassName;
    }
    public String getAlignment() {
        return alignment;
    }
    public String[] getLanguage() {
        return language;
    }
    public int getArmorClass() {
        return armorClass;
    }
    public int getHp() {
        return hp;
    }
    public int getSpeed() {
        return speed;
    }
    public String getBackground() {
        return background;
    }
    public String getLevel() {
        return level;
    }
    public String getPersonality() {
        return personality;
    }
    public String getIdeals() {
        return ideals;
    }
    public String getBonds() {
        return bonds;
    }
    public String getFlaws() {
        return flaws;
    }
    public int getStrength() {
        return strength;
    }
    public int getDexterity() {
        return dexterity;
    }
    public int getConstitution() {
        return constitution;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public int getWisdom() {
        return wisdom;
    }
    public int getCharisma() {
        return charisma;
    }
    public String[] getFeatures() {
        return features;
    }
    public String[] getTraits() {
        return traits;
    }
    public String[][] getEquipment() {
        return equipment;
    }
    public String[] getProficiencies() {
        return proficiencies;
    }

    public Character() {
    }
    
    public Character(String name, int age, String race, String className, String subClassName, String alignment,
            String[] language, int armorClass, int hp, int speed, String background, String level, String personality,
            String ideals, String bonds, String flaws, int strength, int dexterity, int constitution, int intelligence,
            int wisdom, int charisma, String[] features, String[] traits, String[][] equipment,
            String[] proficiencies) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.className = className;
        this.subClassName = subClassName;
        this.alignment = alignment;
        this.language = language;
        this.armorClass = armorClass;
        this.hp = hp;
        this.speed = speed;
        this.background = background;
        this.level = level;
        this.personality = personality;
        this.ideals = ideals;
        this.bonds = bonds;
        this.flaws = flaws;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.features = features;
        this.traits = traits;
        this.equipment = equipment;
        this.proficiencies = proficiencies;
    }

    public void setBackground(String background) {
        this.background = background;
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
    public void setClassName(String className) {
        this.className = className;
    }
    public void setSubClassName(String subClassName) {
        this.subClassName = subClassName;
    }
    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }
    public void setLanguage(String[] language) {
        this.language = language;
    }
    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public void setPersonality(String personality) {
        this.personality = personality;
    }
    public void setIdeals(String ideals) {
        this.ideals = ideals;
    }
    public void setBonds(String bonds) {
        this.bonds = bonds;
    }
    public void setFlaws(String flaws) {
        this.flaws = flaws;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }
    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }
    public void setFeatures(String[] features) {
        this.features = features;
    }
    public void setTraits(String[] traits) {
        this.traits = traits;
    }
    public void setEquipment(String[][] equipment) {
        this.equipment = equipment;
    }
    public void setProficiencies(String[] proficiencies) {
        this.proficiencies = proficiencies;
    }
}
