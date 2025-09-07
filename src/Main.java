import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread (good practice)
        SwingUtilities.invokeLater(() -> new MusicGenreApp());
    }
}
