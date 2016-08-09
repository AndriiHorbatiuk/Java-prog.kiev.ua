/**
 * Created by Andrey on 09.08.2016.
 */
public interface TrainInterface {
        void turnLeft();
        void turnRight();
        void lightOn();
        void lightOff();
        boolean isLightOn();

        boolean isLength(int expectedLength);
    }
