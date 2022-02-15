public class HappyToSad
{
    private final String BLUE = "\u001B[36m";
    private final String RED = "\u001B[31m";
    private final String BROWN = "\u001B[33m";
    private final String WHITE = "\u001B[37m";
    private final String BLACK = "\u001B[30m";
    private final String CYAN = "\033[0;34m";
    private final String BLUE_BRIGHT = "\033[0;94m";
    private final String PURPLE = "\033[0;35m";

    private final String HAPPY_FACE = "\u263A";
    private final String ANGRY_FACE = "\uD83D\uDE20";
    private final String CRYING_FACE = "\uD83D\uDE2D";
    private final String CAKE = "\uD83C\uDF70";

    private String name;
    public HappyToSad(String name)
    {
        this.name = name;
    }

    public void animate() throws InterruptedException
    {
        System.out.println(CYAN + "One day " + BLUE_BRIGHT + name + PURPLE + " Was walking along the street. " + RED + " Suddenly, he say a piece of cake! ");
        Thread.sleep(500);
        System.out.print(WHITE);
        System.out.print(CAKE);
        System.out.print(BROWN);
        System.out.println("                " + HAPPY_FACE);
        Thread.sleep(500);

        System.out.print(WHITE);
        System.out.print(CAKE);
        System.out.print(BROWN);
        System.out.println("               " + HAPPY_FACE);
        Thread.sleep(500);

        System.out.print(WHITE);
        System.out.print(CAKE);
        System.out.print(BROWN);
        System.out.println("              " + HAPPY_FACE);
        Thread.sleep(500);

        System.out.print(WHITE);
        System.out.print(CAKE);
        System.out.print(BROWN);
        System.out.println("             " + HAPPY_FACE);
        Thread.sleep(500);

        System.out.print(WHITE);
        System.out.print(CAKE);
        System.out.print(BROWN);
        System.out.println("            " + HAPPY_FACE);
        Thread.sleep(500);

        System.out.print(WHITE);
        System.out.print(CAKE);
        System.out.print(BROWN);
        System.out.println("           " + HAPPY_FACE);
        Thread.sleep(500);

        System.out.print(WHITE);
        System.out.print(CAKE);
        System.out.print(BROWN);
        System.out.println("          " + HAPPY_FACE);
        Thread.sleep(500);

        System.out.print(WHITE);
        System.out.print(CAKE);
        System.out.print(BROWN);
        System.out.println("         " + HAPPY_FACE);
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("Suddenly, the Cake disappeared!");
        Thread.sleep(500);
        System.out.println();
        System.out.println();

        System.out.print(BROWN);
        System.out.println("         " + HAPPY_FACE);
        Thread.sleep(500);

        System.out.print(BLUE);
        System.out.println(name + " waited for a while and got mad");
        Thread.sleep(500);
        System.out.println();
        System.out.println();

        System.out.print(BROWN);
        System.out.println("         " + HAPPY_FACE);
        Thread.sleep(500);

        System.out.print(BROWN);
        System.out.println("         " + HAPPY_FACE);
        Thread.sleep(500);

        System.out.print(BROWN);
        System.out.println("         " + ANGRY_FACE);
        Thread.sleep(500);

        System.out.print(BROWN);
        System.out.println("         " + ANGRY_FACE);
        Thread.sleep(500);

        System.out.print(BROWN);
        System.out.println("         " + ANGRY_FACE);
        Thread.sleep(500);

        System.out.print(CYAN);
        System.out.println("Then he got sad.");
        Thread.sleep(500);
        System.out.println();
        System.out.println();

        System.out.print(BROWN);
        System.out.println("         " + CRYING_FACE);
        Thread.sleep(500);

        System.out.print(BROWN);
        System.out.println("         " + CRYING_FACE);
        Thread.sleep(500);

        System.out.print(BROWN);
        System.out.println("         " + CRYING_FACE);
        Thread.sleep(500);

        System.out.print(BLACK);
        System.out.println("Then the cake reappeared! He ate it and was happy again!");
        Thread.sleep(500);
        System.out.println();
        System.out.println();

        System.out.print(WHITE);
        System.out.print(CAKE);
        System.out.print(BROWN);
        System.out.println("        " + HAPPY_FACE);
        Thread.sleep(500);

        System.out.print(WHITE);
        System.out.print(CAKE);
        System.out.print(BROWN);
        System.out.println("       " + HAPPY_FACE);
        Thread.sleep(500);

        System.out.print(WHITE);
        System.out.print(CAKE);
        System.out.print(BROWN);
        System.out.println("      " + HAPPY_FACE);
        Thread.sleep(500);

        System.out.print(WHITE);
        System.out.print(CAKE);
        System.out.print(BROWN);
        System.out.println("     " + HAPPY_FACE);
        Thread.sleep(500);

        System.out.print(WHITE);
        System.out.print(CAKE);
        System.out.print(BROWN);
        System.out.println("    " + HAPPY_FACE);
        Thread.sleep(500);

        System.out.print(WHITE);
        System.out.print(CAKE);
        System.out.print(BROWN);
        System.out.println("   " + HAPPY_FACE);
        Thread.sleep(500);

        System.out.print(WHITE);
        System.out.print(CAKE);
        System.out.print(BROWN);
        System.out.println("  " + HAPPY_FACE);
        Thread.sleep(500);

        System.out.print(WHITE);
        System.out.print(CAKE);
        System.out.print(BROWN);
        System.out.println(" " + HAPPY_FACE);
        Thread.sleep(500);

        System.out.print(BROWN);
        System.out.println(HAPPY_FACE);
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("YUM");

    }
}
