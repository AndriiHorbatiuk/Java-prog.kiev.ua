/**
 * Created by Andrey on 10.08.2016.
 */
public class Carriage {
    private boolean light;

    public Carriage(boolean light) {
        this.light = light;
    }

    public boolean isLightOn() {
        return light;
    }

    public void lightOff() {
        light = false;

    }

    public void lightOn() {
        light = true;

    }

    public boolean isLight() {
        return light;
    }
}
