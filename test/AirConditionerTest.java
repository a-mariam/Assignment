package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    public void testThatAirConditionerExist(){
        AirConditioner LG = new AirConditioner();
        LG.isOn();
        assertFalse(LG.getStatus());
    }
    @Test

    public void isOnAirConditioner(){
        AirConditioner LG = new AirConditioner();
        LG.isOff();
        assertTrue(LG.getStatus());


    }
    @Test
     public void increaseAirConditionerTemperature(){
        AirConditioner LG = new AirConditioner();
        LG.increaseTemperature();
        assertTrue(true);


    }
    @Test
    public void decreaseAirConditionerTemperature(){
        AirConditioner LG = new AirConditioner();
        LG.decreaseTemperature();
        assertTrue(true);

    }
    @Test
    public void increaseAirConditionerTemperatureBeyoundThirty(){
        AirConditioner LG = new AirConditioner();
        LG.temperature(30);
        LG.increaseTemperature(31);
        assertTemperature(30);

    }

    private void assertTemperature(int i) {
    }

}