import com.sun.org.apache.xpath.internal.objects.XObject;

import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Consumer;

public class Bot {

    static boolean working = true;

    public static void main(String[] args) {
        HashMap<String, Consumer<String>> commands = new HashMap<String, Consumer<String>>();
        commands.put("!help", Bot::Help);
        commands.put("!authors", Bot::Authors);
        commands.put("!echo", Bot::Echo);
        commands.put("!weather", Bot::Weather);
        commands.put("!horoscope", Bot::Horoscope);
        commands.put("!some", Bot::Some);
        commands.put("!exit", Bot::Exit);

        Scanner in = new Scanner(System.in);

        while (working) {
            String input = in.nextLine();
            int space = input.indexOf(' ');
            String commandSelf = space < 0 ? input : input.substring(0, space);
            String commandText = space > 0 ? input : input.substring(space);

            if (commands.containsKey(commandSelf))
                commands.get(commandSelf);
        }
    }

    public static void Help(String text) {
        System.out.println("This is a primitive chat bot with a few commands.\n \'help\' - this command shows you what chat bod can do \n \'authors\' - this command introduces the authors of the Chat Bot\n \'echo\' - this command just shows you what you wrote \n \'horoscope\' - coming soon... \n \'some\' - this command will let the bot to sing you a song \n \'exit\' - this command closes the console");
    }

    public static void Authors(String text) {
        System.out.println("This bot is made by Stepanov Vasiliy and Davydova Alena for university course");
    }

    public static void Echo(String text){
        System.out.println(text);
    }

    public static void Weather(String text){
        System.out.println("coming soon........");
    }

    public static void Some(String text){
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
    }

    public static void Exit(String text){
        working = false;
    }

    public static void Horoscope(String text){
        System.out.println("coming soon...............");
    }
}