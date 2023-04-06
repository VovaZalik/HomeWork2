import java.util.Random;

public class Main {
    public static final int KOKA = 4;
    public static final int PESI = 3;
    public static void main(String[] args) {
        MagicBox<Integer> kola = new MagicBox<>(KOKA);
        MagicBox<String> pepsi = new MagicBox<>(PESI);
        String[] strings = {"I", "YOU", "ME", "WE", "HE", "SHE", "IT"};

        Random r = new Random();
        int randomInts = r.nextInt(2000000);
        int randomStrings = r.nextInt(strings.length);

        for (int i = 0; i < PESI; i++) {
            pepsi.add(strings[randomStrings]);
        }

        for (int i = 0; i < KOKA; i++) {
            kola.add(randomInts);
        }
        System.out.println(kola.pick());
        System.out.println(pepsi.pick());
    }
}
