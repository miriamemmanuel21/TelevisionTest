public class Television {

    private boolean state;
    private int channel;
    private int volume;

    public boolean getState() {
        return state;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public void turnOn() {
        state = true;
    }

    public void turnOff() {
        state = false;
    }

    public void changeChannel(int channel) {
        if (state) {
            this.channel = channel;
        }
    }

    public void adjustVolume(boolean increase) {
        if (state) {
            if (increase) {
                volume++;
            } else {
                volume--;
            }
        }
    }
}


