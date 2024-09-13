import java.util.Scanner;
import javax.swing.*;

public class Goldenfairywind {

    /*
     * This method displays the current stats of the player including weapon type, weapon level,
     * @param weapon The current weapon of the player.
     * @param weaponLvl The level of the player's weapon.
     * @param characterLvl The level of the player's character.
     * @param charactermanastorage The amount of mana the player has.
     */
    public static void displayStats(String weapon, int weaponLvl, int characterLvl, int charactermanastorage, JTextArea textArea) {
        textArea.append("\n========== Player Stats ==========\n");
        textArea.append("Weapon: " + weapon + "\n");
        textArea.append("Weapon Level: " + weaponLvl + "\n");
        textArea.append("Character Level: " + characterLvl + "\n");
        textArea.append("Mana: " + charactermanastorage + "\n");
        textArea.append("==================================\n");
    }

    public static void main(String[] args) {

       
        JFrame frame = new JFrame("Golden Fairy Wind");

       
        frame.setSize(500, 400);

        
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);  // Make it read-only for the player
        textArea.setLineWrap(true);   // Wrap lines
        textArea.setWrapStyleWord(true);  // Wrap at word boundaries

       
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);

        
        frame.setVisible(true);

        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        // these values will change and grow over time!
        String weapon = "none";          // Player's starting weapon
        int weaponLvl = 1;                    // Initial weapon level    
        int characterLvl = 1;                 // Initial character level
        int charactermanastorage = 20;        // Initial mana storage of the player
        
        // (1 = human realm, Earth)
        int stageArea = 1;
        
        // Special ability, like the master sword in Zelda but spell-based.
        boolean blessOfFairy = false;

        Scanner sc = new Scanner(System.in);

        if (stageArea == 1) {
            textArea.append("***************************************************\n");
            textArea.append("You are in world h1v12, also known as Earth.\n");
            textArea.append("You awake from your slumber with a constant pounding in your head!\n");
            textArea.append("***************************************************\n\n");
        }

        textArea.append("What will you do?\n");
        textArea.append("1: Stay in bed and sleep it off.\n");
        textArea.append("2: Get up and go downstairs to get water.\n");
        textArea.append("Type 'view stats' at any time to see your current stats.\n\n");

        // Infinite loop for player choices
        while (true) {
            String playerInput = sc.nextLine();

            // Handle the "view stats" command
            if (playerInput.equalsIgnoreCase("view stats")) {
                displayStats(weapon, weaponLvl, characterLvl, charactermanastorage, textArea);
                continue;
            }

            try {
                int playerChoice = Integer.parseInt(playerInput);

                // Handle the player's choices
                if (playerChoice == 1) {
                    textArea.append("Unknown Voice - 'It is time. We need you now.'\n");
                    textArea.append("What will you do?\n");
                    textArea.append("1: Stay in bed and sleep it off.\n");
                    textArea.append("2: Get up and go downstairs to get water.\n");
                    textArea.append("Type 'view stats' at any time to see your current stats.\n");
                } else if (playerChoice == 2) {
                    textArea.append("You struggle to get out of bed and make it to the steps.\n");
                    textArea.append("The room starts to spin, and you miss a step, tumbling down the stairs.\n");
                    textArea.append("Thud. Thud. Thud.\n\n");
                    textArea.append("You can't feel your body. You think to yourself, 'Am I going to die?'\n");
                    break;
                } else {
                    textArea.append("Invalid choice. Please choose 1 or 2.\n");
                }
            } catch (NumberFormatException e) {
                textArea.append("Invalid input. Please enter '1', '2', or 'view stats'.\n");
            }
        }

        textArea.append("As it all fades to black, you are lifted out of your mortal body.\n");
        textArea.append("You keep your eyes shut, scared of seeing your lifeless body.\n");
        textArea.append("Unknown Voice: 'Um, hello... You can open your eyes. I'm not going to hurt you, hero.'\n");

        textArea.append("1: Open your eyes.\n2: Keep your eyes closed.\n");
        int eyes = sc.nextInt();

        if (eyes == 1) {
            textArea.append("As you open your eyes, you behold a woman in all white clothing.\n");
            textArea.append("You take a closer look at her clothing; it's nothing like you've ever seen.\n");
        }

        sc.close();
    }
}