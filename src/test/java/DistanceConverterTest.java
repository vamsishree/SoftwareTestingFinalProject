import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.*;

public class DistanceConverterTest {
    DistanceConverter obj = new DistanceConverter();
    /*Previous Group tests*/
    @Test
    public void kms_to_metres_test(){
        assertEquals(10000,obj.kms_to_meters(10));
    }
    @Test
    public void meters_to_km_test() {
        assertEquals(10,obj.meters_to_kms(10000), 0.0f);
    }
    @Test
    public void meters_to_cms_test() {
        assertEquals(1000,obj.meters_to_cms(10));
    }
    @Test
    public void cms_to_metres_test() {
        assertEquals(10,obj.cms_to_metres(1000), 0.1f);
    }
    @Test
    public void cms_to_mms_test() {
        assertEquals(100,obj.cms_to_mms(10));
    }
    @Test
    public void mms_to_cms_test(){
        assertEquals(10,obj.mms_to_cms(100));
    }


    //Kilometre test
    @Test
    public void kms_to_miles_test(){
        assertEquals(6.21371 ,obj.kms_to_miles(10),0.01f);
    }
    @Test
    public void kms_to_foot_test(){
        assertEquals(32808.4,obj.kms_to_foot(10),0.0f);
    }
    @Test
    public void kms_to_inch_test(){
        assertEquals(393701,obj.kms_to_inch(10),0.0f);
    }
    @Test
    public void kms_to_cms_test(){
        assertEquals(1000000,obj.kms_to_cms(10));
    }
    @Test
    public void kms_to_mm_test(){
        assertEquals(10000000,obj.kms_to_mm(10));
    }
    @Test
    public void kms_to_meters_test_2(){
        assertEquals(50000,obj.kms_to_meters(50));
    }
    //Meter Tests

    @Test
    public void meters_to_foot_test() {
        assertEquals(32.0,obj.meters_to_foot(10), 0.0f);
    }
    @Test
    public void meters_to_inch_test() {
        assertEquals(393.0,obj.meters_to_inch(10), 0.0f);
    }

    @Test
    public void meters_to_mm_test() {
        assertEquals(10000,obj.meters_to_mm(10));
    }
    //Centimeter test
    @Test
    public void cms_to_km_test() {
        assertEquals(1e-4,obj.cms_to_km(10), 0.0f);
    }

    @Test
    public void cms_to_foot_test() {
        assertEquals(0.32,obj.cms_to_foot(10), 0.0f);
    }
    @Test
    public void cms_to_inch_test() {
        assertEquals(3.93,obj.cms_to_inch(10),  0.1f);
    }

    //
    @Test
    public void km_m_cm_km_test() {
        assertEquals(10,obj.cms_to_km(obj.meters_to_cms(obj. kms_to_meters(10))), 0.0f);
    }
    @Test
    public void km_m_cm_inch_test() {
        assertEquals(393701,obj.cms_to_inch(obj.meters_to_cms(obj. kms_to_meters(10))), 0.0f);
    }
    @Test
    public void km_m_foot_test() {
        assertEquals(32000,obj.meters_to_foot(obj. kms_to_meters(10)), 0.0f);
    }
    @Test
    public void m_km_foot_test() {
        assertEquals(32808.4 ,obj.kms_to_foot((int)(obj. meters_to_kms(10000))), 0.0f);
    }
    @Test
    public void km_cm_m_inch_test() {
        assertEquals(393000,obj.meters_to_inch((int)(obj.cms_to_metres(obj. kms_to_cms(10)))), 0.0f);
    }
    @Test
    public void km_cm_m_foot_test() {
        assertEquals(32000,obj.meters_to_foot((int)(obj.cms_to_metres(obj. kms_to_cms(10)))), 0.0f);
    }
    @Test
    public void km_cm_m_km_test() {
        assertEquals(10,obj.meters_to_kms((int)(obj.cms_to_metres(obj. kms_to_cms(10)))), 0.0f);
    }
    @Test
    public void m_km_mile_test() {
        assertEquals(0.00621371,obj.kms_to_miles((int)(obj. meters_to_kms(10))), 0.1f);
    }


}