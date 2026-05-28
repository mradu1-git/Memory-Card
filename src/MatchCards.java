import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.ArrayList;

public class MatchCards {
    class Card {
        ImageIcon cardImageIcon;
        String cardName;
        Card(String cardName, ImageIcon cardImageIcon) {
            this.cardImageIcon = cardImageIcon;
            this.cardName= cardName;
        }
        public String toString() {
            return cardName;
        }
    }
    String[] cardList = {"darkness", "double", "fairy", "fighting", "fire", "grass", "lightning", "metal", "psychic", "water"};
    int rows = 4;
    int columns = 5;
    int cardWidth = 90;
    int cardHeight = 120;

    ArrayList<Card> cardSet;
    ImageIcon cardBackImageIcon;

    int boardWidth = columns * cardWidth;
    int boardHeight = rows * cardHeight;

    JFrame frame = new JFrame("Pokemon Match Card");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JPanel boardPanel = new JPanel();
    JPanel restartGamePanel = new JPanel();
    JButton restartButton = new JButton();

    int errorCount = 0;
    ArrayList<JButton> board;

    MatchCards() {
        setupCards();
        shuffleCards();
    }

    void setupCards() {
        cardSet = new ArrayList<Card>();
        for (String cardName : cardList) {
            Image cardImg = new ImageIcon(getClass().getResource("./img/" + cardName + ".jpg")).getImage();
            ImageIcon cardImageIcon = new ImageIcon(cardImg.getScaledInstance(cardWidth, cardHeight, Image.SCALE_SMOOTH));
        }
    }
}
