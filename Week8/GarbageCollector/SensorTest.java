package GarbageCollector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class SensorTest {

    @Test
    void withResourceStoresFields() {
        SensorResource resource = new SensorResource();
        Sensor sensor = Sensor.withResource("SensorA", 10, resource);

        assertEquals("SensorA", sensor.getId());
        assertEquals(10, sensor.getSampleRateHz());
        assertSame(resource, sensor.getResource());
    }

    @Test
    void withNoResourceHasNullResource() {
        Sensor sensor = Sensor.withNoResource("SensorB", 5);

        assertEquals("SensorB", sensor.getId());
        assertEquals(5, sensor.getSampleRateHz());
        assertNull(sensor.getResource());
    }

    @Test
    void toStringMentionsIdAndSampleRate() {
        Sensor sensor = Sensor.withNoResource("SensorC", 3);
        String printed = sensor.toString();

        assertTrue(printed.contains("SensorC"));
        assertTrue(printed.contains("3"));
    }

    @Test
    void resourceIsCleanedWhenClosed() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(output));
        try (SensorResource resource = new SensorResource()) {
            // no-op
        } finally {
            System.setOut(original);
        }

        assertTrue(output.toString().contains("Resource"));
    }
}
