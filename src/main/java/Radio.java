public class Radio {

    private int station = 0;
    private int volume = 0;

    public void nextStation() {
        if (station == 9) {
            station = 0;
        } else {
            station = station + 1;
        }
    }

    public void prevStation() {
        if (station == 0) {
            station = 9;
        } else {
            station = station - 1;
        }
    }

    public int getStation() {
        return station;
    }

    public void setStation(int number) {
        if (number >= 0 && number <= 9) {
            station = number;
        }
    }

    public void increaseVolume() {
        if (volume < 10) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
