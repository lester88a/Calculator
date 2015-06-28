package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Li XU 300735072 on 6/27/2015.
 */
public class Calculator extends JFrame{
    private JPanel mainPanel;
    private JPanel disAreaPanel;
    private JPanel btnAreaPanel;
    private JButton a7Button;
    private JButton aDivideButton;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton aMultiplyButton;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton aAddButton;
    private JButton a0Button;
    private JButton dotButton;
    private JButton aEqualButton;
    private JButton aSubButton;
    private JButton aClearButton;
    private JTextArea disTextArea;
    private JButton aPosNebutton;

    //some temporary variables later for calculations
    private double[] temporary = {0, 0};
    //variables of four basic functions for (+ - * /)
    private boolean[] function = new boolean[4];


    public Calculator() {
        super("Magic Calculator");
        //make each function to be disabled
        for(int i = 0; i < 4; i++) {
            function[i] = false;
        }
        //add each button a Action Listener
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                result2 += "7";
//                result1 += 7;
//                disTextField.setText(result2);
//                //temporary[1]=Double.parseDouble(result2);
                //when the button clicked, the number apparels
                disTextArea.append("7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                result2 += 8;
//                //temporary[0]+=8;
//                result1 =temporary[1];
//                disTextField.setText(result2);
//                //temporary[0]=Double.parseDouble(result2);
                //when the button clicked, the number apparels
                disTextArea.append("8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //when the button clicked, the number apparels
                disTextArea.append("9");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //when the button clicked, the number apparels
                disTextArea.append("4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //when the button clicked, the number apparels
                disTextArea.append("5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //when the button clicked, the number apparels
                disTextArea.append("6");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //when the button clicked, the number apparels
                disTextArea.append("1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //when the button clicked, the number apparels
                disTextArea.append("2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //when the button clicked, the number apparels
                disTextArea.append("3");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //when the button clicked, the number apparels
                disTextArea.append("0");
            }
        });
        dotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //when the button clicked, the number apparels
                disTextArea.append(".");
            }
        });
        aAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                result2="";
//                //result1+=0;
//                result2+=disTextField.getText()+"+";
//                //temporary[1]=Double.parseDouble(disTextField.getText());
//                disTextField.setText(result2);
                //use temporary0 to get the number that appareled, then parse to double type
                temporary[0] = Double.parseDouble(disTextArea.getText());
                //set the "+" to be enabled
                function[0] = true;
                //clear the textArea to be emptied
                disTextArea.setText("");
            }
        });
        aSubButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                result2="";
//                //result1-=0;
//                result2+=disTextField.getText()+"-";
//                disTextField.setText(result2);
                //same as the addition function
                temporary[0] = Double.parseDouble(disTextArea.getText());
                function[1] = true;
                disTextArea.setText("");

            }
        });
        aMultiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                result2="";
//                result1*=Integer.parseInt(disTextField.getText());
//                disTextField.setText(String.valueOf(result1));
                //multiply function[2]
                //same as the addition function
                temporary[0] = Double.parseDouble(disTextArea.getText());
                function[2] = true;
                disTextArea.setText("");

            }
        });
        aDivideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                result2="";
//                result1/=Integer.parseInt(disTextField.getText());
//                disTextField.setText(String.valueOf(result1));
                //divide function[3]
                //same as the addition function
                temporary[0] = Double.parseDouble(disTextArea.getText());
                function[3] = true;
                disTextArea.setText("");

            }
        });
        aEqualButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //using the getResult method to display the result
                getResult();
//                String total = result2+"=";
//                //temporary[0]=Double.parseDouble(total);
//                disTextField.setText(total+result1);
            }
        });
        aClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                disTextField.setText("0");
//                result2="";
//                result1=0;
//                temporary[0]=0;
                try {
                    //clear all the appealed numbers
                    disTextArea.setText("");
                    //set all the functions to be disabled
                    for (int i = 0; i < 4; i++)
                        function[i] = false;
                    //set the temporary values to zero
                    for (int i = 0; i < 2; i++)
                        temporary[i] = 0;
                } catch (NullPointerException e) {
                }

            }
        });
        aPosNebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //when the button clicked, the number will be positive or negative
                getPosNeg();
            }
        });
    }
    //public getResult method
    public void getResult() {
        double result = 0;
        temporary[1] = Double.parseDouble(disTextArea.getText());
        String temp0 = Double.toString(temporary[0]);
        String temp1 = Double.toString(temporary[1]);

        try {
            if(temp0.contains("-")) {
                String[] temp00 = temp0.split("-", 2);
                temporary[0] = (Double.parseDouble(temp00[1]) * -1);
            }
            if(temp1.contains("-")) {
                String[] temp11 = temp1.split("-", 2);
                temporary[1] = (Double.parseDouble(temp11[1]) * -1);
            }
        }
        catch(ArrayIndexOutOfBoundsException e) {
        }
        try {
            //add function[0]
            if(function[0] == true) {
                result = temporary[0] + temporary[1];
            }
            //subtract function[1]
            else if(function[1] == true) {
                result = temporary[0] - temporary[1];
            }
            //multiply function[2]
            else if(function[2] == true) {
                result = temporary[0] * temporary[1];
            }
            //divide function[3]
            else if(function[3] == true) {
                result = temporary[0] / temporary[1];
            }
            disTextArea.setText(Double.toString(result));
            for(int i = 0; i < 4; i++) {
                function[i] = false;
            }
        }
        catch(NumberFormatException e) {
        }

    }
    //getPosNeg method to determine positive or negative function
    public void getPosNeg() {
        try {
            double value = Double.parseDouble(disTextArea.getText());
            if(value != 0) {
                value = value * (-1);
                disTextArea.setText(Double.toString(value));
            }
            else {
            }
        }
        catch(NumberFormatException e) {
        }
    }

    public static void main(String[] args) {
//        JFrame frame = new JFrame("Calculator");
//        frame.setContentPane(new Calculator().mainPanel);
        Calculator frame = new Calculator();
        frame.setContentPane(frame.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
