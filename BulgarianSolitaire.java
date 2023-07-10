//Samuel Maingi
//Assignment 08 Bl_Solit
//07/07/2023


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BulgarianSolitaire {
    private List<Integer> piles;

    public BulgarianSolitaire() {
        piles = new ArrayList<>();
    }

    public void initializePiles() {
        for (int i = 1; i <= 10; i++) {
            piles.add(i);
        }
        int remainingCards = 45 - (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);
        if (remainingCards > 0) {
            piles.add(remainingCards);
        }
        Collections.shuffle(piles);
    }

    public boolean isGameOver() {
        if (piles.size() != 1) {
            return false;
        }
        int cards = piles.get(0);
        return cards == 1 || cards == 45;
    }

    public void performMove() {
        int numPiles = piles.size();
        List<Integer> newPiles = new ArrayList<>();
        for (int i = 0; i < numPiles; i++) {
            int cards = piles.get(i);
            newPiles.add(cards - 1);
        }
        newPiles.add(numPiles);
        piles = newPiles;
    }

    public void displayGame() {
        for (int i = 0; i < piles.size(); i++) {
            int cards = piles.get(i);
            System.out.print("Pile " + (i + 1) + ": ");
            for (int j = 0; j < cards; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BulgarianSolitaire game = new BulgarianSolitaire();
        game.initializePiles();
        game.displayGame();

        while (!game.isGameOver()) {
            game.performMove();
            game.displayGame();
        }
    }
}
