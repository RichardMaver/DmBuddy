package dmbuddy.Model.Npc;

public class Character extends Npc {
    
    private String className;
    private String background;
    private String race;
    private String alignment;
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
    private String features;
    private String traits;
    private String equipment;
    private String proficiencies;
    private String languages;
    
    public String getClassName() {
        return className;
    }
    public String getBackground() {
        return background;
    }
    public String getRace() {
        return race;
    }
    public String getAlignment() {
        return alignment;
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
    public String getFeatures() {
        return features;
    }
    public String getTraits() {
        return traits;
    }
    public String getEquipment() {
        return equipment;
    }
    public String getProficiencies() {
        return proficiencies;
    }
    public String getLanguages() {
        return languages;
    }

    public Character() {
    }

    public Character(String name, String origins, int age, String className, String background, String race,
            String alignment, String level, String personality, String ideals, String bonds, String flaws,
            int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, String features,
            String traits, String equipment, String proficiencies, String languages) {
        super(name, origins, age);
        this.className = className;
        this.background = background;
        this.race = race;
        this.alignment = alignment;
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
        this.languages = languages;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    public void setBackground(String background) {
        this.background = background;
    }
    public void setRace(String race) {
        this.race = race;
    }
    public void setAlignment(String alignment) {
        this.alignment = alignment;
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
    public void setFeatures(String features) {
        this.features = features;
    }
    public void setTraits(String traits) {
        this.traits = traits;
    }
    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }
    public void setProficiencies(String proficiencies) {
        this.proficiencies = proficiencies;
    }
    public void setLanguages(String languages) {
        this.languages = languages;
    }
    
}
