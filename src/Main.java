import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] quotes = {
                "“Be yourself; everyone else is already taken.” – Oscar Wilde",
                "“Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.” – Albert Einstein",
                "“So many books, so little time.” – Frank Zappa",
                "“A room without books is like a body without a soul.” – Cicero",
                "“In three words I can sum up everything I've learned about life: it goes on.” – Robert Frost",
                "“If you tell the truth, you don't have to remember anything.” – Mark Twain",
                "“Always forgive your enemies; nothing annoys them so much.” – Oscar Wilde",
                "“Without music, life would be a mistake.” – Friedrich Nietzsche",
                "“We accept the love we think we deserve.” – Stephen Chbosky",
                "“To live is the rarest thing in the world. Most people exist, that is all.” – Oscar Wilde"
        };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean again = true;

        while (again) {
            System.out.println("\nChoose an option:");
            System.out.println("1–10: Show that quote");
            System.out.println("R  : Show a random quote");
            System.out.print("Your choice: ");
            String choice = scanner.nextLine().toUpperCase();

            if (choice.equals("R")) {
                int idx = random.nextInt(quotes.length);
                System.out.println("\n" + quotes[idx]);
            } else { int num = Integer.parseInt(choice);
                    System.out.println("\n" + quotes[num - 1]);

            }

            System.out.print("\nSee another quote? (Y/N): ");
            String resp = scanner.nextLine().toUpperCase();
            if (!resp.equals("Y")) {
                again = false;
            }
        }

        System.out.println("\nThanks for using my FamousQuotes. Now go away!");

    }
}
