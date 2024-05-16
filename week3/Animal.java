package week3;

public class Animal {
    
    private String sound;
    private String name;
    private int age;

    public Animal(String nm){
        this.name = nm;
    }

    // Takes a string and stores that as the sound variable in this object
    public String setSound(String snd){
        this.sound = snd;
        return this.sound;
    }


}
