import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {

    private Television tv;

    @BeforeEach
     public void setUp() {
        tv = new Television();
    }

    @Test
     public void turnOn_shouldSetStateToTrue() {
        tv.turnOn();
        assertTrue(tv.getState());
    }

    @Test
     public void turnOff_shouldSetStateToFalse() {
        tv.turnOff();
        assertFalse(tv.getState());
    }

    @Test
     public void changeChannel_shouldSetChannelToGivenValue() {
        tv.changeChannel(5);
        assertEquals(5, tv.getChannel());
    }

    @Test
     public void changeChannel_shouldNotChangeChannelIfStateIsFalse() {
        tv.turnOff();
        tv.changeChannel(5);
        assertEquals(0, tv.getChannel());
    }

    @Test
     public void adjustVolume_shouldIncreaseVolumeByOne() {
        tv.adjustVolume(true);
        assertEquals(1, tv.getVolume());
    }

    @Test
     public void adjustVolume_shouldDecreaseVolumeByOne() {
        tv.adjustVolume(false);
        assertEquals(-1, tv.getVolume());
    }

    @Test
     public void adjustVolume_shouldNotChangeVolumeIfStateIsFalse() {
        tv.turnOff();
        tv.adjustVolume(true);
        assertEquals(0, tv.getVolume());
    }
}




