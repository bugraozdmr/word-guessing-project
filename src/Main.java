
public class Main {
    public static void main(String[] args) {

        game game1=new game();

        // Çalışmaya başlarken kelimeleri dosyadan yükle
        game1.loadWordsFromFile();

        game1.goodGame();

        study study1=new study();

        study1.start(game1);
    }
}
