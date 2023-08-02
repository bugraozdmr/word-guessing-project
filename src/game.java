import java.io.*;
import java.util.*;

public class game implements Serializable {

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

        saveWordsToFile();
    }

    public void saveWordsToFile() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("words.bin"))) {

            out.writeObject(linkedHashMap);
            System.out.println("Kelimeler başarıyla dosyaya kaydedildi!");

        } catch (IOException e) {
            System.out.println("Kelimeler dosyaya kaydedilirken IOException oluştu.");
        }
    }

    public void loadWordsFromFile() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("words.bin"))) {

            linkedHashMap = (LinkedHashMap<String, String>) in.readObject();
            System.out.println("Kelimeler başarıyla dosyadan yüklendi!");

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException e) {
            System.out.println("Kelimeler dosyadan yüklenirken IOException oluştu.");
        } catch (ClassNotFoundException e) {
            System.out.println("Sınıf bulunamadı");
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
