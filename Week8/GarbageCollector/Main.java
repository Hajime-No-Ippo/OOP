package GarbageCollector;

 class Main {
    public static void main(String[] args) {
        try(SensorResource resource = new SensorResource()){
           Sensor s1 = Sensor.withResource("SensorA", 10, resource);
           System.out.println(s1);
        }

        Sensor s2 = Sensor.withNoResource("SensorB", 5);
        System.out.println(s2);

        s2 = null;
        System.gc();

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
    
}
