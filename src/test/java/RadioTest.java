import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void testNextStation() {
        Radio radio = new Radio();

        radio.nextStation();

        assertEquals(1, radio.station);
    }

    @Test
    void testNextStationLimit() {
        Radio radio = new Radio();
        radio.station = 9;

        radio.nextStation();

        assertEquals(0, radio.station);
    }

    @Test
    void testPrevStation() {
        Radio radio = new Radio();
        radio.station = 9;

        radio.prevStation();

        assertEquals(8, radio.station);
    }

    @Test
    void testPrevStationLimit() {
        Radio radio = new Radio();

        radio.prevStation();

        assertEquals(9, radio.station);
    }

    @Test
    void testSetStation() {
        Radio radio = new Radio();

        radio.setStation(4);

        assertEquals(4, radio.station);
    }

    @Test
    void testConstructorWithStation() {
        Radio radio = new Radio(5);

        assertEquals(5, radio.maxStations);
    }

    @Test
    void testSetStationRightLimit() {
        Radio radio = new Radio();

        radio.setStation(40);

        assertEquals(0, radio.station);
    }

    @Test
    void testSetStationLeftLimit() {
        Radio radio = new Radio();

        radio.setStation(-40);

        assertEquals(0, radio.station);
    }

    @Test
    void testIncreaseVolume() {
        Radio radio = new Radio();

        radio.increaseVolume();

        assertEquals(1, radio.volume);
    }

    @Test
    void testIncreaseVolumeLimit() {
        Radio radio = new Radio();
        radio.volume = 100;

        radio.increaseVolume();

        assertEquals(100, radio.volume);
    }

    @Test
    void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.volume = 100;

        radio.decreaseVolume();

        assertEquals(99, radio.volume);
    }

    @Test
    void testDecreaseVolumeLimit() {
        Radio radio = new Radio();

        radio.decreaseVolume();

        assertEquals(0, radio.volume);
    }
}
