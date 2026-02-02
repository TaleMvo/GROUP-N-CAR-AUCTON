import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class QTN2 {
    public static void main(String[] args) {
        // Create window
        JFrame frame = new JFrame("New Student Registration Form");
        frame.setSize(600, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Text fields
        JTextField firstName = new JTextField(15);
        JTextField lastName = new JTextField(15);
        JTextField email = new JTextField(15);
        JPasswordField password = new JPasswordField(15);

        // Gender
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        // Department
        String[] depts = {"CSE", "Civil", "Electrical", "Mechanical"};
        JComboBox<String> department = new JComboBox<>(depts);

        // Output area
        JTextArea output = new JTextArea(8, 20);
        output.setBorder(BorderFactory.createTitledBorder("Your Data is Below"));
        output.setEditable(false);

        // Buttons
        JButton submit = new JButton("Submit");
        JButton cancel = new JButton("Cancel");

        // Add components to window
        frame.add(new JLabel("First Name")); frame.add(firstName);
        frame.add(new JLabel("Last Name")); frame.add(lastName);
        frame.add(new JLabel("Email")); frame.add(email);
        frame.add(new JLabel("Password")); frame.add(password);

        frame.add(new JLabel("Gender"));
        frame.add(male); frame.add(female);

        frame.add(new JLabel("Department"));
        frame.add(department);

        frame.add(submit);
        frame.add(cancel);
        frame.add(output);

        // Button actions
        submit.addActionListener(e -> {
            String g = male.isSelected() ? "Male" : "Female";

            output.setText(
                    "Name: " + firstName.getText() + " " + lastName.getText() + "\n" +
                            "Email: " + email.getText() + "\n" +
                            "Gender: " + g + "\n" +
                            "Department: " + department.getSelectedItem()
            );
        });

        cancel.addActionListener(e -> System.exit(0));

        // Show window
        frame.setVisible(true);
    }
}
