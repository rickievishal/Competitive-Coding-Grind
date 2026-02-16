import javax.swing.*;
import java.awt.*;

public class ToDoApp {
    public static void main (String[] args){
        Color primary = new Color(98, 255, 0);
        Color secondary = Color.BLACK;
        JFrame frame = new JFrame("To Do App by Vishal");
        frame.setSize(400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JTextField taskField = new JTextField();
        JButton addButton = new JButton("Add");

        DefaultListModel<String> model = new DefaultListModel<>();
        JList <String> list = new JList<>(model);

        taskField.setBackground(new Color(20, 20, 20));
        taskField.setForeground(primary);
        taskField.setCaretColor(Color.WHITE);
        taskField.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        list.setBackground(secondary);
        list.setForeground(primary);
        list.setSelectionBackground(new Color(60, 60, 60));
        list.setSelectionForeground(Color.WHITE);
        
        addButton.addActionListener(e -> {
            String task = taskField.getText();
            if(!task.isEmpty()){
                model.addElement(task);
                taskField.setText("");
            }
        });

        
        
        addButton.setOpaque(true);
        addButton.setBorderPainted(false);
        addButton.setBackground(primary);
        addButton.setForeground(secondary);
        mainPanel.add(taskField,BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setBorder(null);
        scrollPane.getViewport().setBackground(secondary);
        scrollPane.setBackground(secondary);

        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(addButton,BorderLayout.SOUTH);
        mainPanel.setOpaque(true);
        
        mainPanel.setForeground(primary);
        mainPanel.setBackground(secondary);

    
        frame.getContentPane().setBackground(secondary);
        frame.add(mainPanel);
        frame.setVisible(true);

    }
}