package application;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankBalance {
    private static double balance = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bank Balance Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        // GUI Objects
    	JButton balanceButton = new JButton("Balance");
        JButton depositButton = new JButton("Deposit");
        JButton withdrawButton = new JButton("Withdraw");
        JTextField amountField = new JTextField(20);
        JLabel balanceLabel = new JLabel("Balance: $");

        // GUI Object Layout
        panel.setLayout(null);
        panel.add(balanceButton);
        panel.add(depositButton);
        panel.add(withdrawButton);
        panel.add(amountField);
        panel.add(balanceLabel);
        
        // GUI Object sizes (left, down, size, width) 
        balanceButton.setBounds(250, 80, 80, 25);
        depositButton.setBounds(40, 80, 80, 25);
        withdrawButton.setBounds(140, 80, 90, 25);
        amountField.setBounds(40, 20, 300, 25);
        balanceLabel.setBounds(40, 120, 300, 25);
        
        
       
        // Functionality code/action listeners section
        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                balance += Double.parseDouble(amountField.getText());
                amountField.setText("");
            }
        });

        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                balance -= Double.parseDouble(amountField.getText());
                amountField.setText("");
            }
        }); 
        
        balanceButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		amountField.setText("");
        		balanceLabel.setText("Balance: $" + String.format("%.2f", balance));
        	}
        });
    }
}




