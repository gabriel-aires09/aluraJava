import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GraphicalUser extends JFrame {
    public GraphicalUser(){
        setTitle("FahrenCelsius");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400,300);
        graphicalUser();
    }

    public void graphicalUser(){
        SpringLayout springLayout = new SpringLayout();
        JPanel tempPanel = new JPanel();
        tempPanel.setLayout(springLayout);

        JLabel celsiusLabel = new JLabel("Digite temperatura em celsius");
        celsiusLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

        JTextField celsiusField = new JTextField(15);
        celsiusField.setFont(new Font("Dialog", Font.PLAIN, 18));

        // Posiciona celsiusLabel acima de celsiusField
        springLayout.putConstraint(SpringLayout.WEST, celsiusLabel, 0, SpringLayout.WEST, celsiusField);
        springLayout.putConstraint(SpringLayout.SOUTH, celsiusLabel, -10, SpringLayout.NORTH, celsiusField);

        // Posiciona celsiusField no centro da tela
        springLayout.putConstraint(SpringLayout.HORIZONTAL_CENTER, celsiusField, 0, SpringLayout.HORIZONTAL_CENTER, tempPanel);
        springLayout.putConstraint(SpringLayout.VERTICAL_CENTER, celsiusField, 0, SpringLayout.VERTICAL_CENTER, tempPanel);

        tempPanel.add(celsiusLabel);
        tempPanel.add(celsiusField);

        // Converter button
        JButton converterButton = new JButton("Login");
        converterButton.setFont(new Font("Dialog", Font.BOLD, 18));

        springLayout.putConstraint(SpringLayout.WEST, converterButton, 155, SpringLayout.WEST, tempPanel);
        springLayout.putConstraint(SpringLayout.NORTH, converterButton, 185, SpringLayout.NORTH, tempPanel);

        converterButton.addActionListener(new ActionListener() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
                String celsiusText = celsiusField.getText();
                int celsiusInt = Integer.parseInt(celsiusText);
                double celsius = (double) celsiusInt;

                double temperature = (celsius * 1.8) + 32;
                String convertTemperatura = String.format("%.1f", temperature);
                
                JOptionPane.showMessageDialog(tempPanel, "Temperatura em Fahrenheit: " + "\n" + convertTemperatura + "F");
                System.out.println(celsius);
                System.out.println(temperature);
            }
        });

        tempPanel.add(converterButton);
        this.getContentPane().add(tempPanel);
    }
}
