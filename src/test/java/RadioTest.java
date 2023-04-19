import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void testNextStation() {
        Radio radio = new Radio();

        radio.nextStation();

        assertEquals(1, radio.getStation());
    }

    @Test
    void testNextStationLimit() {
        Radio radio = new Radio();
        radio.setStation(9);

        radio.nextStation();

        assertEquals(0, radio.getStation());
    }

    @Test
    void testPrevStation() {
        Radio radio = new Radio();
        radio.setStation(9);

        radio.prevStation();

        assertEquals(8, radio.getStation());
    }

    @Test
    void testPrevStationLimit() {
        Radio radio = new Radio();

        radio.prevStation();

        assertEquals(9, radio.getStation());
    }

    @Test
    void testSetStation() {
        Radio radio = new Radio();

        radio.setStation(4);

        assertEquals(4, radio.getStation());
    }

    @Test
    void testConstructorWithStation() {
        Radio radio = new Radio(5);

        assertEquals(5, radio.getMaxStations());
    }

    @Test
    void testSetStationRightLimit() {
        Radio radio = new Radio();

        radio.setStation(40);

        assertEquals(0, radio.getStation());
    }

    @Test
    void testSetStationLeftLimit() {
        Radio radio = new Radio();

        radio.setStation(-40);

        assertEquals(0, radio.getStation());
    }

    @Test
    void testIncreaseVolume() {
        Radio radio = new Radio();

        radio.increaseVolume();

        assertEquals(1, radio.getVolume());
    }

    @Test
    void testIncreaseVolumeLimit() {
        Radio radio = new Radio();
        radio.setVolume(100);

        radio.increaseVolume();

        assertEquals(100, radio.getVolume());
    }

    @Test
    void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(100);

        radio.decreaseVolume();

        assertEquals(99, radio.getVolume());
    }

    @Test
    void testDecreaseVolumeLimit() {
        Radio radio = new Radio();

        radio.decreaseVolume();

        assertEquals(0, radio.getVolume());
    }
}
