import org.junit.Test;

import static org.junit.Assert.*;

public class DistanceConverterTest {
    DistanceConverter obj = new DistanceConverter();
    @Test
    public void kms_to_meters_test(){
        assertEquals(10000,obj.kms_to_meters(10));
    }
    @Test
    public void meters_to_kms_test(){
        assertEquals(10,obj.meters_to_kms(10000));
    }

}