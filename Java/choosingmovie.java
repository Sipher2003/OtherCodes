import java.util.*;

public class choosingmovie {
    static String[] m_horror = { "Us", "A quiet place", "Get out", "The invisible man", "Psycho", "Freaks", "Halloween",
            "Aliens", "Host",
            "Bride of Frankenstein", "The Badadook", "IT", "It follows", "The lighthouse", "Hereditary" };
    static String[] m_comedy = { "meet the parents", "Mean girls", "Pulp fiction", "Hot fuzz", "Safety last",
            "walk hard",
            "Local hero", "The philadelphia story",
            "harold and maude", "The Heartbreak Kid", "Scrooged", "Groundhog day", "Zombieland", "The truman show",
            "Ted" };
    static String[] m_action = { "Shawshank Redemption", "Die hard", "Red", "John wick", "The hobbit",
            "Lord of the rings",
            "Batman", "Superman", "Ironman",
            "Spiderman", "Antman", "Thor", "Black widow", "Captain America", "The matrix" };
    static String[] tv_horror = { "Are you afraid of the dark", "The haunting of hill house", "The vampire diaries",
            "tales from the crypt", "The outer limits", "Kolchak", "Ghost hunters",
            "Ash vs evil dead", "The returned", "Dark shadows", "True blood", "Masters of horrors",
            "Alfred hitchock presents", "A haunting", "Penny dreadful" };
    static String[] tv_action = { "Vikings", "Game of thrones", "NCIS", "Snowpiercer", "Reacher", "Daredevil",
            "The last Kingdom", "The boys", "Arcane", "Cobra kai",
            "Chicago Fire", "The wheel of time", "Money heist", "Vikings: Valhalla", "Titans" };
    static String[] tv_comedy = { "Peacemaker", "The office", "Dollface", "Murderville", "Seinfield", "Freinds",
            "How i met your mother", "Space force", "This is us", "After life",
            "Resident Alien", "The big bang theory", "Cobra kai", "Castle", "Southpark" };

    static int c, g, n, m;

    public static void movieChoosing(int c, int g, int n) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            if (c == 1) {
                if (g == 1) {
                    if (n < 0 || n > 15) {
                        System.out.println("not a valid number");
                    }
                    System.out.println(m_comedy[n - 1]);
                } else if (g == 2) {
                    if (n < 0 || n > 15) {
                        System.out.println("not a valid number");
                    }
                    System.out.println(m_horror[n - 1]);
                } else if (g == 3) {
                    if (n < 0 || n > 15) {
                        System.out.println("not a valid number");
                    }
                    System.out.println(m_action[n - 1]);
                }
            } else if (c == 2) {
                if (g == 1) {
                    if (n < 0 || n > 15) {
                        System.out.println("not a valid number");
                    }
                    System.out.println(tv_comedy[n - 1]);
                } else if (g == 2) {
                    if (n < 0 || n > 15) {
                        System.out.println("not a valid number");
                    }
                    System.out.println(tv_horror[n - 1]);
                } else if (g == 3) {
                    if (n < 0 || n > 15) {
                        System.out.println("not a valid number");
                    }
                    System.out.println(tv_action[n - 1]);
                }
            }

            System.out.println("Are you Satisfied with this movies\ntype 1 for yes \nType 2 for no");
            m = sc.nextInt();
            if (m == 1) {
                break;
            }
            System.out.println("Choose 1 for Movie \nChoose 2 for T.V Shows");
            c = sc.nextInt();
            while (!(c == 1 || c == 2)) {
                System.out.println("Invalid input");
                System.out.println("Choose 1 for Movie \nChoose 2 for T.V Shows");
                c = sc.nextInt();
            }

            System.out.println("Choose 1 for comedy\nChoose 2 for horror\nChoose 3 for action");
             g = sc.nextInt();
            while (!(g == 1 || g == 2)) {
                System.out.println("Invalid input");
                System.out.println("Choose 1 for comedy\nChoose 2 for horror\nChoose 3 for action");
                g = sc.nextInt();
            }

            System.out.println("Choose a number from 1 to 15");
             n = sc.nextInt();
            while (!(n < 0 || n > 15)) {
                System.out.println("Invalid input");
                System.out.println("Choose a number from 1 to 15");
                n = sc.nextInt();
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to programm");
       
        System.out.println("Choose 1 for Movie \nChoose 2 for T.V Shows");
        int c = sc.nextInt();
        while (!(c == 1 || c == 2)) {
            System.out.println("Invalid input");
            System.out.println("Choose 1 for Movie \nChoose 2 for T.V Shows");
            c = sc.nextInt();
        }
        System.out.println("Choose 1 for comedy\nChoose 2 for horror\nChoose 3 for action");
        int g = sc.nextInt();
        while (!(g == 1 || g == 2)) {
            System.out.println("Invalid input");
            System.out.println("Choose 1 for comedy\nChoose 2 for horror\nChoose 3 for action");
            g = sc.nextInt();
        }

        System.out.println("Choose a number from 1 to 15");
        int n = sc.nextInt();
        while ((n < 0 || n > 15)) {
            System.out.println("Invalid input");
            System.out.println("Choose a number from 1 to 15");
            n = sc.nextInt();
        }

        movieChoosing(c, g, n);

    }
}
