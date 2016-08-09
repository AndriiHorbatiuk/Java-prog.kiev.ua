/**
 * Created by Andrey on 09.08.2016.
 */
public class Runner {
    public static void main(String[] args) {
        Train train = new Train();
        System.out.println(findLength(train));
        System.out.println(train.isLength(findLength(train)));

    }

    private static int findLength(Train train) {

        int length = 0;

        if (!train.getCarriageList().get(train.getStratPosition()).isLightOn()) {
            train.getCarriageList().get(train.getStratPosition()).lightOn();
        }
        while (length != train.getCarriageList().size()) {
            train.turnRight();
            if (train.getCarriageList().get(train.getCurrentPosition()).isLightOn()) {
                train.getCarriageList().get(train.getCurrentPosition()).lightOff();
            }
            length++;

            if (!train.getCarriageList().get(train.getStratPosition()).isLightOn()) {
                break;
            }

        }
        return length;
    }

}
