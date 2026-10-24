import java.io.File;
public class Main {
    public static void main(String[] args) {
        try { new java.util.Scanner(new File("config.json")); System.out.println("Config loaded"); } catch (Exception e) {}
    }
}
