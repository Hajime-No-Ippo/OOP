package GarbageCollector;
import java.util.Objects;

class Sensor {
    private final String id; // 唯一标识符
    private final int sampleRateHz;
    private final SensorResource resource;

    public Sensor(String id, int sampleRateHz, SensorResource resource) {
        this.id = Objects.requireNonNull(id, "id must not be null");
        if(sampleRateHz <= 0){
            throw new IllegalArgumentException("sample rate must be positive");
        }
        this.sampleRateHz = sampleRateHz;
        this.resource = resource;
    }

    public Sensor(String id, int sampleRateHz){
        this(id, sampleRateHz, null);
    }

    public Sensor(String id){
        this(id, 1,null); //default sample rate of 1hz
    }

    public static Sensor withResource(String id, int sampleRateHz, SensorResource resource){
        return new Sensor(id, sampleRateHz, resource);
    }

    public static Sensor withNoResource(String id, int sampleRateHz){
        return new Sensor(id, sampleRateHz);
    }

    public String getId() {
        return id;
    }

    public int getSampleRateHz() {
        return sampleRateHz;
    }

    public SensorResource getResource() {
        return resource;
    }

    @Override
    public String toString() {
        return "Sensor{id='" + id + "', sampleRateHz=" + sampleRateHz + ", resource=" + (resource != null) + '}';
    }
}
