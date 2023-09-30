package Brueckenkurs_03;

public class Student {
    private int alter;
    private String name;
    
    public void setAlter(int alterNew) {
        if (alterNew > alter) {
            alter = alterNew;
        }
    }

    public Student() {
        alter = 22;
        setName("Max Mustermann");
    }
    
    public Student(int alter, String name) {
        this.alter = alter;
        this.setName(name);
    }
    
    public int getAlter() {
        return alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
