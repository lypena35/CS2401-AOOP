import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by LoriPena on 10/20/18.
 * @author Lorianne Pena
 * @version 1.1 (11/04/2018)
 * @since version 0.1
 */
public class LunarRoverVehicle {
    /**
     * This method is to represent the at rest state.
     * no parameters needed due to the fact that the methods are activated based on user menu options in the main.
     * @return a print statement that displays you are currently at the rest or idle state in the lunar vehicle.
     */
    public String atRest() {
        return "You are currently in the at rest / idle state";
    }

    /**
     * This method is to represent the accelerate state.
     * no parameters needed due to the fact that the methods are activated based on user menu options in the main.
     * @return a print statement that displays you are accelerating forward in the lunar vehicle.
     */
    public String moveForward() {
        return "You are accelerating forward.";
    }

    /**
     * This method is to represent the accelerate backwards state.
     * no parameters needed due to the fact that the methods are activated based on user menu options in the main.
     * @return a print statement that displays you are accelerating backwards in the lunar vehicle.
     */

    public String goBackwards() {
        return"You are accelerating backwards";
    }

    /**
     * This method is to represent the constant forward speed state.
     * no parameters needed due to the fact that the methods are activated based on user menu options in the main.
     * @return a print statement that displays you are moving forward at a stable speed in the lunar vehicle.
     */
    public String stabilizeSpeed() {
        return "You are now moving forward at a stable speed";
    }

    /**
     * This method is to represent the decelerate state.
     * no parameters needed due to the fact that the methods are activated based on user menu options in the main.
     * @return a print statement that displays you are decelerating to a stop in the lunar vehicle.
     */
    public String decelerateBreak() {
        return"You are now decelerating to a stop";
    }

    /**
     * This method is to represent the idle or rest state in the extra credit state machine.
     * no parameters needed due to the fact that the methods are activated based on user menu options in the main.
     * @return a print statement that displays you are currently at rest or idle for the extra credit section of
     * lunar vehicle.
     */
    public String idleState() {
        return "You are currently in idle or rest state";
    }

    /**
     * This method is to represent the color camera state for the extra credit state machine.
     * no parameters needed due to the fact that the methods are activated based on user menu options in the main.
     * @return a print statement that displays you have activated the color camera mode of the lunar vehicle and asks
     * you to select which color camera option you wish to use.
     */
    public String colorCam() {
        return"The color camera is activated. Which camera will you like to use?";
    }

    /**
     * This method is to represent that take picture state.
     * for both color and 16-mm cameras for the extra credit state machine.
     * no parameters needed due to the fact that the methods are activated based on user menu options in the main.
     * @return a print statement that states you have taken a picture.
     */
    public String takePic() {
        return"You have taken a picture! ";
    }

    /**
     * This method is to represent the temporizer picture state for both color and
     * 16-mm cameras for the extra credit state machine.
     * no parameters needed due to the fact that the methods are activated based on user menu options in the main.
     * @return a print statement that states you have taken a picture using the temporizer.
     */
    public String activateTemp() {
        return "The temporizer is activated. You have taken a 'moon selfie' ";
    }

    /**
     * This method is to represent the 16-mm camera for the extra credit state machine.
     * no parameters needed due to the fact that the methods are activated based on user menu options in the main.
     * @return a print statement that states you have activated the 16-mm camera and asks which
     * type of camera you want to use.
     */
    public String sixteenMMCam() {
        return "The 16-mm Camera is activated. Which camera will you like to use? ";
    }

    /**
     * This method is to activate the drill state for the extra credit state machine.
     * no parameters needed due to the fact that the methods are activated based on user menu options in the main.
     * @return a print statement displaying you have activated the drill.
     */
    public String activateDrill() {
        return "The Drill state is activated.";
    }

    /**
     * This method is to turn on the drill which automatically turns on when entering the
     * state for the extra credit state machine.
     * no parameters needed due to the fact that the methods are activated based on user menu options in the main.
     * @return a print statement displaying you have turned on the drill.
     */
    public String turnOn() {
        return "The Drill is now turned on.";
    }

    /**
     * This method is to turn off the drill for the extra credit state machine.
     * no parameters needed due to the fact that the methods are activated based on user menu options in the main.
     * @return a print statement displaying you have turned off the drill.
     */

    public String turnOff() {
        return "The Drill is now turned off.";
    }

    @SuppressWarnings("Duplicates")
    public void main(String[] args) {
        try {
            int option;//used to store output selected by the user to interact with the menu
            int result;//used to store output selected by the user to interact with the menu
            int res;//used to store output selected by the user to interact with the menu
            int MenuCycle = 1;//used to keep the menu in a loop until 0 is entered to exit the menu
            while (MenuCycle != 0) {
                System.out.println ("Lunar Rover Vehicle Menu Activated...");
                System.out.println ( );
                atRest ( );
                System.out.println ( );
                System.out.println ("Please select from the following menu options or type 0 anytime to exit:");
                System.out.println ("Type '1': To press the right pedal once to accelerate forward.");
                System.out.println ("Type '2': To press the left pedal for more then 5 seconds to accelerate backwards.");
                System.out.println ("Type '3': To press button 1 for 5 seconds to interact with the color camera.");
                System.out.println ("Type '4': To press button 1 for 10 seconds to interact with the 16-mm camera.");
                System.out.println ("Type '5': to press button 1 twice to interact with the drill.");

                Scanner input = new Scanner (System.in);
                option = input.nextInt ( );
                switch (option) {
                    case 0:
                        System.exit (0);

                    case 1:
                        moveForward ( );
                        System.out.println ( );
                        while (option == 1) {
                            while (option != 0) {
                                System.out.println ("You are currently accelerating...");
                                System.out.println ("Type '2': to press the right pedal 2 times to slow down to a stop. ");
                                System.out.println ("Type '3': to press the right pedal for more then 5 seconds to achieve constant speed.");
                                System.out.println ("Or type '0' anytime to exit the acceleration menu.");
                                option = input.nextInt ( );
                                if (option == 0) {
                                    System.exit (0);
                                }
                                if (option == 2) {
                                    System.out.println ( );
                                    decelerateBreak ( );
                                    System.out.println ( );
                                    System.out.println ( );
                                    option = 0;

                                } else if (option == 3) {
                                    System.out.println ( );
                                    stabilizeSpeed ( );
                                    System.out.println ( );
                                    System.out.println ( );
                                    System.out.println ("When you are ready to slow down to a stop please type '2' .");
                                    Scanner res1 = new Scanner (System.in);
                                    option = res1.nextInt ( );
                                    decelerateBreak ( );
                                    System.out.println ( );
                                    break;

                                } else {
                                    MenuCycle = 1;
                                }
                            }
                        }
                        break;

                    case 2:

                        if (option == 2) {
                            System.out.println ( );
                            goBackwards ( );
                            System.out.println ( );
                            System.out.println ("When you are ready to slow down to a stop please type '1' .");
                            Scanner res1 = new Scanner (System.in);
                            option = res1.nextInt ( );
                            if (option == 0) {
                                System.exit (0);
                            }
                            if (option == 1) {
                                decelerateBreak ( );
                                System.out.println ( );
                            }
                            MenuCycle = 1;
                        } else {
                            MenuCycle = 0;
                        }

                        break;

                    case 3:
                        System.out.println ( );
                        idleState ( );
                        System.out.println ( );
                        if (option == 3) {
                            System.out.println ( );
                            colorCam ( );
                            System.out.println ("Type '1': for pressing button 1 to take a picture.");
                            System.out.println ("Type '2': for pressing button 1 for 5 seconds to activate the temporizer.");
                            Scanner output = new Scanner (System.in);
                            result = output.nextInt ( );
                            if (result == 0) {
                                System.exit (0);
                            }
                            if (result == 1) {
                                System.out.println ( );
                                takePic ( );
                                System.out.println ( );
                                System.out.println ("Type '3': to return to idle by simulating button 2 was pressed.");
                                result = output.nextInt ( );
                                if (result == 0) {
                                    System.exit (0);
                                } else if (result == 3) {
                                    break;
                                }

                            } else if (result == 2) {
                                System.out.println ( );
                                activateTemp ( );
                                System.out.println ( );
                                System.out.println ("Type '3': to return to idle by simulating button 2 was pressed.");
                                result = output.nextInt ( );
                                if (result == 3) {
                                    break;
                                } else if (result == 0) {
                                    System.exit (0);
                                }
                            } else {
                                System.out.println ("You typed in the wrong number please try again");
                                MenuCycle = 1;
                            }

                        } else {
                            MenuCycle = 0;
                        }
                        break;

                    case 4:
                        System.out.println ( );
                        idleState ( );
                        System.out.println ( );
                        if (option == 4) {
                            System.out.println ( );
                            sixteenMMCam ( );
                            System.out.println ("Type 1: for pressing button 1 to take a picture.");
                            System.out.println ("Type 2: for pressing button 1 for 5 seconds to activate the temporizer.");
                            Scanner answer = new Scanner (System.in);
                            res = answer.nextInt ( );
                            if (res == 0) {
                                System.exit (0);
                            }
                            if (res == 1) {
                                System.out.println ( );
                                takePic ( );
                                System.out.println ( );
                                System.out.println ("Type 3: to return to idle by simulating button 2 was pressed.");
                                res = answer.nextInt ( );
                                if (res == 3) {
                                    break;
                                }
                                if (res == 0) {
                                    System.exit (0);
                                }
                            } else if (res == 2) {
                                System.out.println ( );
                                activateTemp ( );
                                System.out.println ( );
                                System.out.println ("Type 3: to return to idle by simulating button 2 was pressed.");
                                res = answer.nextInt ( );
                                if (res == 3) {
                                    break;
                                }
                                if (res == 0) {
                                    System.exit (0);
                                }
                            } else {
                                System.out.println ("You typed in the wrong number please try again");
                                MenuCycle = 1;
                            }

                        } else {
                            MenuCycle = 0;
                        }
                        break;

                    case 5:
                        System.out.println ( );
                        idleState ( );
                        System.out.println ( );
                        activateDrill ( );
                        System.out.println ( );
                        turnOn ( );
                        System.out.println ( );
                        System.out.println ("When you are ready to turn off the drill type 'off' to press button 1 again and press button 2 to return to idle state ");
                        System.out.println ( );
                        Scanner strOutput = new Scanner (System.in);
                        String drillOutput;
                        drillOutput = strOutput.nextLine ( );
                        if (drillOutput.equals ("off") || drillOutput.equals ("Off")) {
                            System.out.println ( );
                            turnOff ( );
                            System.out.println ( );
                        } else {
                            MenuCycle = 0;
                        }
                        break;

                    default:
                        System.out.println ("You typed in the wrong number please try again");
                        System.exit (0);

                }
            }

        } catch (InputMismatchException e) {
            System.out.println ("I am sorry you input is incorrect please try again");
        }
    }
}
