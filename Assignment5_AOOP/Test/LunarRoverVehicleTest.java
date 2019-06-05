import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by LoriPena on 11/8/18.
 * @author Lorianne Pena
 *  * @version 1.1 (11/04/2018)
 *  * @since version 0.1
 */
class LunarRoverVehicleTest {

    @Test
    void atRest() {
        LunarRoverVehicle test1= new LunarRoverVehicle ();
        assertEquals("You are currently in the at rest / idle state",test1.atRest ());
        assertNotNull (test1.atRest (),"Test didn't fail");
        assertFalse (false,"This test is false");
    }

    @Test
    void moveForward() {
        LunarRoverVehicle test2= new LunarRoverVehicle ();
        assertNotEquals ("This is a idle state",test2.moveForward ());
        assertTrue (true,"This test is true");
        assertSame ("Accelerating",test2.moveForward ());
    }

    @Test
    void goBackwards() {
        LunarRoverVehicle test3= new LunarRoverVehicle ();
        assertNotSame ("You are going forwards",test3.goBackwards ());
        assertSame ("You are accelerating backwards",test3.goBackwards ());
        assertNull (test3.goBackwards ());

    }

    @Test
    void stabilizeSpeed() {
        LunarRoverVehicle test4= new LunarRoverVehicle ();
        assertNotEquals (" ",test4.stabilizeSpeed ());
        assertNotNull (test4.stabilizeSpeed ());
        fail ("This test has failed.");
    }

    @Test
    void decelerateBreak() {
        LunarRoverVehicle test5 = new LunarRoverVehicle ();
        assertNotSame ("you are now decelerating to a stop", test5.decelerateBreak ());
        assertSame ("You are now decelerating to a stop", test5.decelerateBreak ());
        assertTrue (true,"This statement is true");
    }

    @Test
    void idleState() {
        LunarRoverVehicle test6 = new LunarRoverVehicle ();
        assertNotNull (test6.idleState ());
        assertEquals("You are currently in idle or rest state",test6.idleState ());
        assertNotSame ("you are currently in idle mode",test6.idleState ());
    }

    @Test
    void colorCam() {
        LunarRoverVehicle test7 = new LunarRoverVehicle ();
        assertNotNull (test7.colorCam ());
        assertSame ("The color camera is activated. Which camera will you like to use?",test7.colorCam ());
        assertNotSame ("color camera is activated...",test7.colorCam ());
    }

    @Test
    void takePic() {
        LunarRoverVehicle test8= new LunarRoverVehicle ();
        assertNotEquals ("you have taken a pic", test8.takePic ());
        assertNotNull (test8.takePic ());
        fail ("This test of taking a picture has failed. :(");
    }

    @Test
    void activateTemp() {
        LunarRoverVehicle test9= new LunarRoverVehicle ();
        assertNotSame ("Temporizer activated please take a picture",test9.activateTemp ());
        assertSame ( "The temporizer is activated. You have taken a 'moon selfie' ",test9.activateTemp ());
        assertTrue (true,"This statement is true");
    }


    @Test
    void sixteenMMCam() {
        LunarRoverVehicle test10= new LunarRoverVehicle ();
        assertFalse (false,"This statement is false");
        assertNotEquals ("Activated please take a picture",test10.sixteenMMCam ());
        assertNotNull (test10.sixteenMMCam ());
    }

    @Test
    void activateDrill() {
        LunarRoverVehicle test11= new LunarRoverVehicle ();
        assertTrue (true,"This statement is true");
        assertNull (test11.activateDrill ());
        assertEquals ("The Drill is now turned on.",test11.activateDrill ());
    }

    @Test
    void turnOn() {
        LunarRoverVehicle test12= new LunarRoverVehicle ();
        assertSame ("The Drill is now turned on.",test12.turnOn ());
        assertNotSame ("The Drill is now turned off.",test12.turnOn ());
        assertNotEquals ("drill activated",test12.turnOn ());
    }

    @Test
    void turnOff() {
        LunarRoverVehicle test13= new LunarRoverVehicle ();
        assertEquals ("The Drill is now turned off.",test13.turnOff ());
        assertNotEquals ("The Drill is now turned on.",test13.turnOff ());
        assertTrue (true,"This statement is true.");

    }

    @Test
    void main() {
        LunarRoverVehicle test14= new LunarRoverVehicle ();
        assertTrue (true,"This is true");
        assertFalse (false,"This is false");
        assertNotNull (test14);
    }
}