package Task_4;

public class Device implements IDeviceble {

    public void Sound() {

    }

    public void Show() {

    }

    public void Desc() {

    }

    protected String name;
    protected String sound;
    protected String desc;

    public Device(String name, String sound, String desc) {
        this.name = name;
        this.sound = sound;
        this.desc = desc;
    }

    public Device () {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
