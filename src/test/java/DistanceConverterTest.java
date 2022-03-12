import org.junit.Test;

import static org.junit.Assert.*;

public class DistanceConverterTest {
    DistanceConverter obj = new DistanceConverter();
    @Test
    public void kms_to_meters_test(){
        assertEquals(10000,obj.kms_to_meters(10));
    }

}