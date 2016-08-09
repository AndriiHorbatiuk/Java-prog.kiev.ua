import java.util.ArrayList;
import java.util.List;

public class Train implements TrainInterface {

    private List<Carriage> carriageList = new ArrayList<>();
    private int stratPosition = 1;
    private int currentPosition = stratPosition;
    private int length;


    public Train() {
        carriageList.add(new Carriage(true));
        carriageList.add(new Carriage(false));
        carriageList.add(new Carriage(true));
        carriageList.add(new Carriage(true));
        carriageList.add(new Carriage(true));
        carriageList.add(new Carriage(true));
        carriageList.add(new Carriage(true));
        carriageList.add(new Carriage(true));
        carriageList.add(new Carriage(true));
        carriageList.add(new Carriage(true));
        length = carriageList.size();
    }

    @Override
    public void turnLeft() {
        currentPosition--;
        if (currentPosition < 0) {
            currentPosition = carriageList.size() - 1;
        }
    }

    @Override
    public void turnRight() {
        currentPosition++;
        if (currentPosition > (carriageList.size() - 1)) {
            currentPosition = 0;
        }


    }

    @Override
    public void lightOn() {
    }

    @Override
    public void lightOff() {
    }

    @Override
    public boolean isLightOn() {
        return false;
    }

    @Override
    public boolean isLength(int expectedLength) {
        return length == expectedLength;
    }

    public List<Carriage> getCarriageList() {
        return carriageList;
    }

    public void setCarriageList(List<Carriage> carriageList) {
        this.carriageList = carriageList;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public int getStratPosition() {
        return stratPosition;
    }

    public void setStratPosition(int stratPosition) {
        this.stratPosition = stratPosition;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
