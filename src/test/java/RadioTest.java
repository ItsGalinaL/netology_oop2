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
    void testIncreateVolume() {
        Radio radio = new Radio();

        radio.increaseVolume();

        assertEquals(1, radio.getVolume());
    }

    @Test
    void testIncreateVolumeLimit() {
        Radio radio = new Radio();
        radio.setVolume(10);

        radio.increaseVolume();

        assertEquals(10, radio.getVolume());
    }

    @Test
    void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(10);

        radio.decreaseVolume();

        assertEquals(9, radio.getVolume());
    }

    @Test
    void testDecreaseVolumeLimit() {
        Radio radio = new Radio();

        radio.decreaseVolume();

        assertEquals(0, radio.getVolume());
    }
}