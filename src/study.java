import java.util.*;

public class study {
    public void start(game game1){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n\n\n\nexit for exit()\tsee all cards in one with CARDS\n\n"+game1.getLesson()+" has started to study...\n****************");

        while (true){
            int i = 0;
            for (Map.Entry<String, String> entry : game1.getLinkedHashMap().entrySet()) {
                if ((i+1)==game1.i){
                    System.out.println(entry.getKey());
                    break;
                }
                System.out.print(entry.getKey() + " - ");
                i++;
                if(i%5==0) System.out.println();
            }

            System.out.print("\nenter the word that you want to learn : ");
            String t = scanner.nextLine();

            if (t.toLowerCase().equals("exit")) break;
            else if (t.equals("CARDS")) allCards(game1);
            else {
                int q=0;
                for (Map.Entry<String, String> entry : game1.getLinkedHashMap().entrySet()) {
                    if (entry.getKey().toLowerCase().equals(t)){
                        System.out.println(entry.getKey()+" -> "+entry.getValue());
                        q=1;
                    }
                }
                if (q==0) System.out.println("there is no word like you wrote ...");
            }

            System.out.println("\n\n");
        }
    }

    public void allCards(game game2){
        for (Map.Entry<String, String> entry : game2.getLinkedHashMap().entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }

    }
}
