package com.alm.bingo.view;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Greeting implements Runnable {
    private String art;
//    private int interval = 1000;

    public Greeting() {
    }

    public Greeting(String art) {
        this.art = art;
    }

//    public Greeting(String art, int interval) {
//        this(art);
//        this.interval = interval;
//    }

    public void runGreeting() throws InterruptedException {
        ExecutorService popUp = Executors.newFixedThreadPool(1);
        System.out.println();
        popUp.execute(greeting1);
        TimeUnit.SECONDS.sleep(2);
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        popUp.execute(greeting2);
        TimeUnit.SECONDS.sleep(1);
        popUp.execute(greeting3);
        TimeUnit.SECONDS.sleep(1);
        popUp.execute(greeting4);
        popUp.shutdown();
    }

    //NOTE: ATM outputs all player numbers
    //TODO: update with only the winners player number when method built
    public void runWinner() throws InterruptedException {
        ExecutorService popUp = Executors.newFixedThreadPool(1);
        System.out.println();
        popUp.execute(winPlayer);
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        popUp.execute(winP1);
        TimeUnit.SECONDS.sleep(1);
        popUp.execute(winP2);
        TimeUnit.SECONDS.sleep(1);
        popUp.execute(winP3);
        TimeUnit.SECONDS.sleep(1);
        popUp.execute(winWon);
        TimeUnit.SECONDS.sleep(6);
        popUp.execute(michaelMascot1);
        TimeUnit.SECONDS.sleep(2);
        popUp.execute(michaelMascot2);
        TimeUnit.SECONDS.sleep(2);
        popUp.execute(michaelMascot3);
        TimeUnit.SECONDS.sleep(2);
        popUp.execute(michaelMascot4);
        TimeUnit.SECONDS.sleep(2);
        popUp.execute(michaelMascot5);
        TimeUnit.SECONDS.sleep(2);
        popUp.execute(michaelMascot6);
        TimeUnit.SECONDS.sleep(4);
        popUp.execute(fireworks);
        TimeUnit.SECONDS.sleep(8);
        popUp.shutdown();
    }

    public void run() {
        System.out.println(art);
//        for (int i = 0; i < 1; i++) {
//            System.out.println(art);
//            try {
//                Thread.sleep(interval);
//            }
//            catch (InterruptedException ignored) {
//            }
//        }
    }

    // FIELDS BELOW BC THEY ARE HUGE----------------------------------------------
    private static Runnable greeting1 = new Greeting("WELCOME TO...");
    private static Runnable greeting2 = new Greeting("$$$$$$\\  $$\\       $$\\      $$\\   \n" +
            "$$  __$$\\ $$ |      $$$\\    $$$ |   \n" +
                    "$$ /  $$ |$$ |      $$$$\\  $$$$ |    \n" +
                    "$$$$$$$$ |$$ |      $$\\$$\\$$ $$ |   \n" +
                    "$$  __$$ |$$ |      $$ \\$$$  $$ |    \n" +
                    "$$ |  $$ |$$ |      $$ |\\$  /$$ |    \n" +
                    "$$ |  $$ |$$$$$$$$\\ $$ | \\_/ $$ |   \n" +
                    "\\__|  \\__|\\________|\\__|     \\__|\n\n");
    private static Runnable greeting3 = new Greeting("$$$$$$$\\  $$\\                     $$\\                             $$\\         \n" +
            "$$  __$$\\ $$ |                    $$ |                            $$ |           \n" +
            "$$ |  $$ |$$ | $$$$$$\\   $$$$$$$\\ $$ |  $$\\  $$$$$$\\  $$\\   $$\\ $$$$$$\\    \n" +
            "$$$$$$$\\ |$$ | \\____$$\\ $$  _____|$$ | $$  |$$  __$$\\ $$ |  $$ |\\_$$  _|     \n" +
            "$$  __$$\\ $$ | $$$$$$$ |$$ /      $$$$$$  / $$ /  $$ |$$ |  $$ |  $$ |           \n" +
            "$$ |  $$ |$$ |$$  __$$ |$$ |      $$  _$$<  $$ |  $$ |$$ |  $$ |  $$ |$$\\        \n" +
            "$$$$$$$  |$$ |\\$$$$$$$ |\\$$$$$$$\\ $$ | \\$$\\ \\$$$$$$  |\\$$$$$$  |  \\$$$$  |\n" +
            "\\_______/ \\__| \\_______| \\_______|\\__|  \\__| \\______/  \\______/    \\____/\n\n");
    private static Runnable greeting4 = new Greeting("$$$$$$$\\  $$\\  \n" +
            "$$  __$$\\ \\__| \n" +
            "$$ |  $$ |$$\\ $$$$$$$\\   $$$$$$\\   $$$$$$\\   \n" +
            "$$$$$$$\\ |$$ |$$  __$$\\ $$  __$$\\ $$  __$$\\  \n" +
            "$$  __$$\\ $$ |$$ |  $$ |$$ /  $$ |$$ /  $$ |    \n" +
            "$$ |  $$ |$$ |$$ |  $$ |$$ |  $$ |$$ |  $$ |     \n" +
            "$$$$$$$  |$$ |$$ |  $$ |\\$$$$$$$ |\\$$$$$$  |   \n" +
            "\\_______/ \\__|\\__|  \\__| \\____$$ | \\______/\n" +
            "                        $$\\   $$ |\n" +
            "                        \\$$$$$$  |\n" +
            "                         \\______/    *ALM BINGO NOT-INCORPORATED");
    private static Runnable winPlayer = new Greeting(" $$$$$$$\\  $$\\        $$$$$$\\ $$\\     $$\\ $$$$$$$$\\ $$$$$$$\\   \n" +
            " $$  __$$\\ $$ |      $$  __$$\\\\$$\\   $$  |$$  _____|$$  __$$\\    \n" +
            " $$ |  $$ |$$ |      $$ /  $$ |\\$$\\ $$  / $$ |      $$ |  $$ |      \n" +
            " $$$$$$$  |$$ |      $$$$$$$$ | \\$$$$  /  $$$$$\\    $$$$$$$  |      \n" +
            " $$  ____/ $$ |      $$  __$$ |  \\$$  /   $$  __|   $$  __$$<        \n" +
            " $$ |      $$ |      $$ |  $$ |   $$ |    $$ |      $$ |  $$ |        \n" +
            " $$ |      $$$$$$$$\\ $$ |  $$ |   $$ |    $$$$$$$$\\ $$ |  $$ |      \n" +
            " \\__|      \\________|\\__|  \\__|   \\__|    \\________|\\__|  \\__|\n" + " \n");
    private static Runnable winP1 = new Greeting("                   $$\\    \n" +
            "                 $$$$ |    \n" +
            "                 \\_$$ |   \n" +
            "                   $$ |    \n" +
            "                   $$ |    \n" +
            "                   $$ |    \n" +
            "                 $$$$$$\\  \n" +
            "                 \\______| \n" + "\n");
    private static Runnable winP2 = new Greeting("                 $$$$$$\\   \n" +
            "                $$  __$$\\  \n" +
            "                \\__/  $$ | \n" +
            "                 $$$$$$  |  \n" +
            "                $$  ____/   \n" +
            "                $$ |        \n" +
            "                $$$$$$$$\\  \n" +
            "                \\________| \n" + "\n");
    private static Runnable winP3 = new Greeting("                 $$$$$$\\    \n" +
            "                $$  __$$\\   \n" +
            "                \\_/   $$ |  \n" +
            "                  $$$$$ /    \n" +
            "                  \\___$$\\  \n" +
            "                $$\\   $$ |  \n" +
            "                \\$$$$$$  |  \n" +
            "                 \\______/   \n" + "\n");
    private static Runnable winWon = new Greeting(" $$\\      $$\\    $$$$$$\\    $$\\   $$\\   $$\\  \n" +
            " $$ | $\\  $$ |  $$  __$$\\   $$$\\  $$ |  $$ |    \n" +
            " $$ |$$$\\ $$ |  $$ /  $$ |  $$$$\\ $$ |  $$ |     \n" +
            " $$ $$ $$\\$$ |  $$ |  $$ |  $$ $$\\$$ |  $$ |     \n" +
            " $$$$  _$$$$ |  $$ |  $$ |  $$ \\$$$$ |  \\__|     \n" +
            " $$$  / \\$$$ |  $$ |  $$ |  $$ |\\$$$ |           \n" +
            " $$  /   \\$$ |   $$$$$$  |  $$ | \\$$ |  $$\\     \n" +
            " \\__/     \\__|   \\______/   \\__|  \\__|  \\__| \n");
    private static Runnable michaelMascot1 = new Greeting("(\\(\\ \n" +
            "(-.-)      \n" +
            "o(\")(\")  \n");
        private static Runnable michaelMascot2 = new Greeting("(\\(\\ \n" +
            "(-.o)     \n" +
            "o(\")(\") \n");
        private static Runnable michaelMascot3 = new Greeting("(\\_/) -!!\n" +
            "(0.0)     \n" +
            "(m m)o    \n");
        private static Runnable michaelMascot4 = new Greeting("* (\\_/) \n" +
            "(\\(O.O) \n" +
            "  (m_m)o \n");
        private static Runnable michaelMascot5 = new Greeting(" (\\_/) *\n" +
            " (O.O)/) \n" +
            "o(m_m)   \n");
        private static Runnable michaelMascot6 = new Greeting("* (\\_/) *\n" +
            " =(^.^)=   \n" +
            " (\")_(\") \n");
        private static Runnable fireworks = new Greeting("                                  .''.\n" +
                "       .''.     .        *''*    :_\\/_:     .\n" +
                "      :_\\/_:  _\\(/_  .:.*_\\/_*   : /\\ :  .'.:.'.\n" +
                "  .''.: /\\ :   /)\\   ':'* /\\ *  : '..'.  -=:o:=-\n" +
                " :_\\/_:'.:::.  | ' *''*    * '.\\'/.'_\\(/_'.':'.'\n" +
                " : /\\ : :::::  =  *_\\/_*     -= o =- /)\\    '  *\n" +
                "  '..'  ':::' === * /\\ *     .'/.\\'.  ' ._____\n" +
                "      *        |   *..*         :       |.   |' .---\"|\n" +
                "        *      |     _           .--'|  ||   | _|    |\n" +
                "        *      |  .-'|       __  |   |  |    ||      |\n" +
                "     .-----.   |  |' |  ||  |  | |   |  |    ||      |\n" +
                " ___'       ' /\"\\ |  '-.\"\".    '-'   '-.'    '`      |____\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


//Originals f/visual //JIC

/**
    private static String michaelGreeting = "ALM BINGO NOT-INCORPORATED\n" +
            "(\\_/) \n" +
            "(0.0) \n" +
            "(m m)o \n" +
            "CONGRATULATIONS YOU WIN!!!!!!!";

    private static String greeting1 = "WELCOME TO...";

    private static String greeting2 =
            "$$$$$$\\  $$\\       $$\\      $$\\   \n" +
            "$$  __$$\\ $$ |      $$$\\    $$$ |   \n" +
            "$$ /  $$ |$$ |      $$$$\\  $$$$ |    \n" +
            "$$$$$$$$ |$$ |      $$\\$$\\$$ $$ |   \n" +
            "$$  __$$ |$$ |      $$ \\$$$  $$ |    \n" +
            "$$ |  $$ |$$ |      $$ |\\$  /$$ |    \n" +
            "$$ |  $$ |$$$$$$$$\\ $$ | \\_/ $$ |   \n" +
            "\\__|  \\__|\\________|\\__|     \\__|\n\n";

    private static String greeting3 =
            "$$$$$$$\\  $$\\                     $$\\                             $$\\         \n" +
            "$$  __$$\\ $$ |                    $$ |                            $$ |           \n" +
            "$$ |  $$ |$$ | $$$$$$\\   $$$$$$$\\ $$ |  $$\\  $$$$$$\\  $$\\   $$\\ $$$$$$\\    \n" +
            "$$$$$$$\\ |$$ | \\____$$\\ $$  _____|$$ | $$  |$$  __$$\\ $$ |  $$ |\\_$$  _|     \n" +
            "$$  __$$\\ $$ | $$$$$$$ |$$ /      $$$$$$  / $$ /  $$ |$$ |  $$ |  $$ |           \n" +
            "$$ |  $$ |$$ |$$  __$$ |$$ |      $$  _$$<  $$ |  $$ |$$ |  $$ |  $$ |$$\\        \n" +
            "$$$$$$$  |$$ |\\$$$$$$$ |\\$$$$$$$\\ $$ | \\$$\\ \\$$$$$$  |\\$$$$$$  |  \\$$$$  |\n" +
            "\\_______/ \\__| \\_______| \\_______|\\__|  \\__| \\______/  \\______/    \\____/\n\n";

    private static String greeting4 =
            "$$$$$$$\\  $$\\  \n" +
            "$$  __$$\\ \\__| \n" +
            "$$ |  $$ |$$\\ $$$$$$$\\   $$$$$$\\   $$$$$$\\   \n" +
            "$$$$$$$\\ |$$ |$$  __$$\\ $$  __$$\\ $$  __$$\\  \n" +
            "$$  __$$\\ $$ |$$ |  $$ |$$ /  $$ |$$ /  $$ |    \n" +
            "$$ |  $$ |$$ |$$ |  $$ |$$ |  $$ |$$ |  $$ |     \n" +
            "$$$$$$$  |$$ |$$ |  $$ |\\$$$$$$$ |\\$$$$$$  |   \n" +
            "\\_______/ \\__|\\__|  \\__| \\____$$ | \\______/\n" +
            "                        $$\\   $$ |\n" +
            "                        \\$$$$$$  |\n" +
            "                         \\______/    *ALM BINGO NOT-INCORPORATED";

    private static String winPlayer =
            " $$$$$$$\\  $$\\        $$$$$$\\ $$\\     $$\\ $$$$$$$$\\ $$$$$$$\\   \n" +
            " $$  __$$\\ $$ |      $$  __$$\\\\$$\\   $$  |$$  _____|$$  __$$\\    \n" +
            " $$ |  $$ |$$ |      $$ /  $$ |\\$$\\ $$  / $$ |      $$ |  $$ |      \n" +
            " $$$$$$$  |$$ |      $$$$$$$$ | \\$$$$  /  $$$$$\\    $$$$$$$  |      \n" +
            " $$  ____/ $$ |      $$  __$$ |  \\$$  /   $$  __|   $$  __$$<        \n" +
            " $$ |      $$ |      $$ |  $$ |   $$ |    $$ |      $$ |  $$ |        \n" +
            " $$ |      $$$$$$$$\\ $$ |  $$ |   $$ |    $$$$$$$$\\ $$ |  $$ |      \n" +
            " \\__|      \\________|\\__|  \\__|   \\__|    \\________|\\__|  \\__|\n" + " \n";

    private static String winP1 =
            "                   $$\\    \n" +
            "                 $$$$ |    \n" +
            "                 \\_$$ |   \n" +
            "                   $$ |    \n" +
            "                   $$ |    \n" +
            "                   $$ |    \n" +
            "                 $$$$$$\\  \n" +
            "                 \\______| \n" + "\n";

    private static String winP2 =
            "                 $$$$$$\\   \n" +
            "                $$  __$$\\  \n" +
            "                \\__/  $$ | \n" +
            "                 $$$$$$  |  \n" +
            "                $$  ____/   \n" +
            "                $$ |        \n" +
            "                $$$$$$$$\\  \n" +
            "                \\________| \n" + "\n";

    private static String winP3 =
            "                 $$$$$$\\    \n" +
            "                $$  __$$\\   \n" +
            "                \\_/   $$ |  \n" +
            "                  $$$$$ /    \n" +
            "                  \\___$$\\  \n" +
            "                $$\\   $$ |  \n" +
            "                \\$$$$$$  |  \n" +
            "                 \\______/   \n" + "\n";

    private static String winWon =
            " $$\\      $$\\    $$$$$$\\    $$\\   $$\\   $$\\  \n" +
            " $$ | $\\  $$ |  $$  __$$\\   $$$\\  $$ |  $$ |    \n" +
            " $$ |$$$\\ $$ |  $$ /  $$ |  $$$$\\ $$ |  $$ |     \n" +
            " $$ $$ $$\\$$ |  $$ |  $$ |  $$ $$\\$$ |  $$ |     \n" +
            " $$$$  _$$$$ |  $$ |  $$ |  $$ \\$$$$ |  \\__|     \n" +
            " $$$  / \\$$$ |  $$ |  $$ |  $$ |\\$$$ |           \n" +
            " $$  /   \\$$ |   $$$$$$  |  $$ | \\$$ |  $$\\     \n" +
            " \\__/     \\__|   \\______/   \\__|  \\__|  \\__| \n";

    private static String michaelMascot1 =
            "(\\(\\ \n" +
            "(-.-) \n" +
            "o(\")(\")";

    private static String michaelMascot2 =
            "(\\(\\ \n" +
            "(-.o) \n" +
            "o(\")(\")";

    private static String michaelMascot3 =
            "(\\_/) -!!\n" +
            "(0.0)     \n" +
            "(m m)o    \n";

    private static String michaelMascot4 =
            "* (\\_/) \n" +
            "(\\(O.O) \n" +
            "  (m_m)o \n";

    private static String michaelMascot5 =
            " (\\_/) *\n" +
            " (O.O)/) \n" +
            "o(m_m) \n";

    private static String michaelMascot6 =
            " (\\_/) \n" +
            "=(^.^)= \n" +
            "(\")_(\")";

 private static String fireworks =
 "                                  .''.\n" +
 "       .''.     .        *''*    :_\\/_:     .\n" +
 "      :_\\/_:  _\\(/_  .:.*_\\/_*   : /\\ :  .'.:.'.\n" +
 "  .''.: /\\ :   /)\\   ':'* /\\ *  : '..'.  -=:o:=-\n" +
 " :_\\/_:'.:::.  | ' *''*    * '.\\'/.'_\\(/_'.':'.'\n" +
 " : /\\ : :::::  =  *_\\/_*     -= o =- /)\\    '  *\n" +
 "  '..'  ':::' === * /\\ *     .'/.\\'.  ' ._____\n" +
 "      *        |   *..*         :       |.   |' .---\"|\n" +
 "        *      |     _           .--'|  ||   | _|    |\n" +
 "        *      |  .-'|       __  |   |  |    ||      |\n" +
 "     .-----.   |  |' |  ||  |  | |   |  |    ||      |\n" +
 " ___'       ' /\"\\ |  '-.\"\".    '-'   '-.'    '`      |____\n" +
 "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";

*/

}   // END OF CLASS