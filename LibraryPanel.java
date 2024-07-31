import javax.swing.*;
import java.awt.*;

public class LibraryPanel extends JPanel {
    private JTextField titleField;
    private JTextField descriptionField;
    private JTextField categoryField;
    private JTextField priceField;
    private JTextField discountField;
    private JButton addButton;
    private JLabel messageLabel;

    public LibraryPanel() {
        setLayout(new GridLayout(7, 2, 5, 5));

        JLabel titleLabel = new JLabel("Tytuł:");
        titleField = new JTextField(20);
        add(titleLabel);
        add(titleField);

        JLabel descriptionLabel = new JLabel("Opis:");
        descriptionField = new JTextField(20);
        add(descriptionLabel);
        add(descriptionField);

        JLabel categoryLabel = new JLabel("Kategoria:");
        categoryField = new JTextField(20);
        add(categoryLabel);
        add(categoryField);

        JLabel priceLabel = new JLabel("Cena:");
        priceField = new JTextField(20);
        add(priceLabel);
        add(priceField);

        JLabel discountLabel = new JLabel("Zniżka:");
        discountField = new JTextField(20);
        add(discountLabel);
        add(discountField);

        addButton = new JButton("Dodaj do biblioteki");
        add(addButton);

        // dodanie etykiety do wyświetlania informacji o dodaniu gry do biblioteki
        messageLabel = new JLabel();
        add(messageLabel);
    }

    public JTextField getTitleField() {
        return titleField;
    }

    public JTextField getDescriptionField() {
        return descriptionField;
    }

    public JTextField getCategoryField() {
        return categoryField;
    }

    public JTextField getPriceField() {
        return priceField;
    }

    public JTextField getDiscountField() {
        return discountField;
    }

    public JButton getAddButton() {
        return addButton;
    }

    // metoda do wyświetlania informacji o dodaniu gry do biblioteki na etykiecie messageLabel
    public void setMessage(String message) {
        messageLabel.setText(message);
    }
}
