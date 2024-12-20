/**
 * ES234317-Algorithm and Data Structures
 * Semester Ganjil, 2024/2025
 * Group Capstone Project
 * Group "Nguwawor"
 * 1 - 5026231162 - I Nyoman Mahadyana Bhaskara
 * 2 - 5026231186 - Javed Amani Syauki
 */


package Connect4;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TTTGraphics4 game4 = new TTTGraphics4();
            game4.showMenu();

        });
    }
}
