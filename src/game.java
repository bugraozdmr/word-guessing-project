import java.util.*;

public class game {

    private String lesson;

    private Map<String,String> linkedHashMap = new LinkedHashMap<String,String>();

    public int i;       //kozmetik icin diger kodda kullancam burda goodGame'de artıyor

    public game() {
        Scanner scanner=new Scanner(System.in);

        System.out.print("What will you going to study : ");
        this.lesson = scanner.nextLine();
    }

    public void goodGame(){

        Scanner scanner=new Scanner(System.in);


        System.out.println("\n\nexit for exit()\n\nlet's study "+lesson);

        i=0;
        while (true){
            System.out.print((i+1)+". word : ");
            String a = scanner.nextLine();
            if (a.toLowerCase().equals("exit")) {
                System.out.println("words have taken ...");
                break;
            }
            System.out.print((i+1)+". mean : ");
            String b = scanner.nextLine();
            if (b.toLowerCase().equals("exit")) {
                System.out.println("words have taken ...");
                break;
            }

            //if (linkedHashMap.keySet().equals("exit") || linkedHashMap.entrySet().equals("exit")) break;   çalışmaz...
            //sete çevirilmedi çünkü

            linkedHashMap.put(a,b);

            i++;
        }
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public Map<String, String> getLinkedHashMap() {
        return linkedHashMap;
    }

    public void setLinkedHashMap(Map<String, String> linkedHashMap) {
        this.linkedHashMap = linkedHashMap;
    }
}
