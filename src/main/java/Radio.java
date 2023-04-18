public class Radio {

    public int maxStations;
    public int station = 0;
    public int volume = 0;

    public Radio() {
        maxStations = 10;
    }

    public Radio(int stations) {
        maxStations = stations;
    }

    public void nextStation() {
        if (station == maxStations - 1) {
            station = 0;
        } else {
            station = station + 1;
        }
    }

    public void prevStation() {
        if (station == 0) {
            station = maxStations - 1;
        } else {
            station = station - 1;
        }
    }

    public void setStation(int number) {
        if (number >= 0 && number < maxStations) {
            station = number;
        }
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
