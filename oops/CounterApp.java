import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp {

    private JFrame frame;
    private JTextField countField;
    private JButton incrementButton;
    private JButton decrementButton;
    private int count = 0;

    public CounterApp() {
        frame = new JFrame("Counting App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new BorderLayout());

        countField = new JTextField(5);
        incrementButton = new JButton("Increment");
        decrementButton = new JButton("Decrement");

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                countField.setText(String.valueOf(count));
            }
        });

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                countField.setText(String.valueOf(count));
            }
        });

        frame.add(countField, BorderLayout.CENTER);
        frame.add(incrementButton, BorderLayout.SOUTH);
        frame.add(decrementButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CounterApp::new);
    }
}
