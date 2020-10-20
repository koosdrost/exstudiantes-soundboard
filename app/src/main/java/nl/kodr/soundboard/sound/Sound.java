package nl.kodr.soundboard.sound;

public class Sound {

    private final int id;
    private final String name;
    private String screenName;

    public Sound(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getScreenName() {
        if (screenName == null || screenName.isEmpty()) {
            return name.substring(0, name.length()-4);
        }
        return screenName;
    }
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }
}
