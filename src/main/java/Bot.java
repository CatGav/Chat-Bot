import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

public class Bot {
    public static void main(String[] args) {
        String lyrics = "...body once told me the world is gonna roll me\n" +
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
                "Only shooting stars break the mold";
        AtomicBoolean working = new AtomicBoolean(true);
        HashMap<String, Consumer<String>> Commands = new HashMap<String, Consumer<String>>();
        Commands.put("help", com -> System.out.println("This is a primitive chat bot with a few commands.\n \'help\' - this command shows you what chat bod can do \n \'authors\' - this command introduces the authors of the Chat Bot\n \'echo\' - this command just shows you what you wrote \n \'horoscope\' - coming soon... \n \'some\' - this command will let the bot to sing you a song \n \'exit\' - this command closes the console"));
        Commands.put("authors", com -> System.out.println("This bot is made by Stepanov Vasiliy and Davydova Alena for university course"));
        Commands.put("echo", com -> {
            if (com.length() > 5)
                System.out.println(com.substring(5));});
        Commands.put("horoscope", com -> System.out.println("Coming soon..."));
        Commands.put("some", com -> System.out.println(lyrics));
        Commands.put("exit", com -> {
            System.out.println("Bye! Hope to see you again. Have a nice day :3");
                working.set(false);});

        Scanner in = new Scanner(System.in);

        while(working.get()) {
            String input = in.nextLine();
            int space = input.indexOf(' ');
            String command = space < 0 ? input : input.substring(0, space);
                if (Commands.containsKey(command)) {
                    Commands.get(command).accept(input);
                }
                else
                    System.out.println("Данной команды не существует");
            }
        }
    }
