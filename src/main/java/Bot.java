//import java.util.HashMap;
import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {
// HashMap<String, Consumer<String»
        Scanner in = new Scanner(System.in);
        boolean working = true;

        while(working) {
            String input = in.nextLine();
            int space = input.indexOf(' ');
            String command = space < 0 ? input : input.substring(0, space);

            switch (command) {
                case ("help"):
                    System.out.println("This is a primitive chat bot with a few commands.\n \'help\' - this command shows you what chat bod can do \n \'authors\' - this command introduces the authors of the Chat Bot\n \'echo\' - this command just shows you what you wrote \n \'horoscope\' - coming soon... \n \'some\' - this command will let the bot to sing you a song \n \'exit\' - this command closes the console");
                    //System.out.println("This is a primitive chat bot with a few commands.\n \'help\' - this command shows you what chat bod can do \n \'authors\' - this command introduces the authors of the Chat Bot\n \'echo\' - this command just shows you what you wrote \n \'weatherforecast\' - coming soon... \n \'exit\' - this command closes the console");
                    break;
                case ("authors"):
                    System.out.println("This bot is made by Stepanov Vasiliy and Davydova Alena for university course");
                    break;
                case ("echo"):
                    if (input.length() > 4)
                        System.out.println(input.substring(5));
                    break;
                case ("weatherforecast"):
                    System.out.println("Coming soon...");
                    break;
                case ("some"):
                    System.out.println("...body once told me the world is gonna roll me\n" +
                            "I ain't the sharpest tool in the shed\n" +
                            "She was looking kind of dumb with her finger and her thumb\n" +
                            "In the shape of an \"L\" on her forehead\n" +
                            "Well the years start coming and they don't stop coming\n" +
                            "Fed to the rules and I hit the ground running\n" +
                            "Didn't make sense not to live for fun\n" +
                            "Your brain gets smart but your head gets dumb\n" +
                            "So much to do, so much to see\n" +
                            "So what's wrong with taking the back streets?\n" +
                            "You'll never know if you don't go\n" +
                            "You'll never shine if you don't glow\n" +
                            "Hey now, you're an all-star, get your game on, go play\n" +
                            "Hey now, you're a rock star, get the show on, get paid\n" +
                            "And all that glitters is gold\n" +
                            "Only shooting stars break the mold\n" +
                            "It's a cool place and they say it gets colder\n" +
                            "You're bundled up now, wait till you get older\n" +
                            "But the meteor men beg to differ\n" +
                            "Judging by the hole in the satellite picture\n" +
                            "The ice we skate is getting pretty thin\n" +
                            "The water's getting warm so you might as well swim\n" +
                            "My world's on fire, how about yours?\n" +
                            "That's the way I like it and I never get bored\n" +
                            "Hey now, you're an all-star, get your game on, go play\n" +
                            "Hey now, you're a rock star, get the show on, get paid\n" +
                            "All that glitters is gold\n" +
                            "Only shooting stars break the mold\n" +
                            "Hey now, you're an all-star, get your game on, go play\n" +
                            "Hey now, you're a rock star, get the show, on get paid\n" +
                            "And all that glitters is gold\n" +
                            "Only shooting stars\n" +
                            "Somebody once asked could I spare some change for gas?\n" +
                            "I need to get myself away from this place\n" +
                            "I said yep what a concept\n" +
                            "I could use a little fuel myself\n" +
                            "And we could all use a little change\n" +
                            "Well, the years start coming and they don't stop coming\n" +
                            "Fed to the rules and I hit the ground running\n" +
                            "Didn't make sense not to live for fun\n" +
                            "Your brain gets smart but your head gets dumb\n" +
                            "So much to do, so much to see\n" +
                            "So what's wrong with taking the back streets?\n" +
                            "You'll never know if you don't go (go!)\n" +
                            "You'll never shine if you don't glow\n" +
                            "Hey now, you're an all-star, get your game on, go play\n" +
                            "Hey now, you're a rock star, get the show on, get paid\n" +
                            "And all that glitters is gold\n" +
                            "Only shooting stars break the mold\n" +
                            "And all that glitters is gold\n" +
                            "Only shooting stars break the mold");
                    break;
                case ("exit"):
                    System.out.println("Bye! Hope to see you again. Have a nice day :3");
                    working = false;
                    break;
                default:
                    System.out.println("Unknown command. Try help");
            }
        }
    }
}