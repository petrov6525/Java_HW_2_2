package Task_5;

public class MusicalDevice implements IMusicable {

    protected String sound;
    protected String name;
    protected String desc;
    protected String history;

    public MusicalDevice(String sound, String name, String desc, String history) {
        this.sound = sound;
        this.name = name;
        this.desc = desc;
        this.history = history;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public MusicalDevice () {

    }

    public void sound() {

    }
    public void show() {

    }
    public void desc() {

    }
    public void history() {

    }
}
