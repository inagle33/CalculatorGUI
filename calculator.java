import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator extends JFrame {

   static JFrame win;            //static variable declarations to be used throughout program
   static JPanel pan;
   static JTextField textBox;
   static JButton clear;
   static JButton decimal;
   static JButton plus;
   static JButton multiply;
   static JButton divide;
   static JButton equal;
   static JButton sqrt;
   static JButton one;
   static JButton two;
   static JButton three;
   static JButton four;
   static JButton five;
   static JButton six;
   static JButton seven;
   static JButton eight;
   static JButton nine;
   static JButton zero;
   static JButton sin;
   static JButton cos;
   static JButton tan;
   static JButton fact;
   static JButton x;
   static JButton squared;
   static JButton log;
   
   static double first;
   static double second;
   static double third;
   
   static String operation; 
   static String answer;

   public static void main(String args[]) {
   
      win = new JFrame("Calculator"); //set title of GUI
      win.setSize(380,460); //set size of windown
      
      pan = new JPanel(); //create panel
      win.add(pan);
      pan.setBackground(Color.RED);
      
      textBox = new JTextField(20);
      pan.add(textBox);
      textBox.setEditable(false); //user cannot edit text box 
      
      clear = new JButton("Clear"); //creating buttons for calculator and adding them to panel
      pan.add(clear);
      clear.addActionListener(new Clear());
      decimal = new JButton(".");
      pan.add(decimal);
      decimal.addActionListener(new decimal());
      plus = new JButton("+");
      pan.add(plus);
      plus.addActionListener(new add());
      multiply = new JButton("*");
      pan.add(multiply);
      multiply.addActionListener(new mult());
      divide = new JButton("/");
      pan.add(divide);
      divide.addActionListener(new div());
      equal = new JButton("=");
      pan.add(equal);
      equal.addActionListener(new solve());
      sqrt = new JButton("√");
      pan.add(sqrt);
      sqrt.addActionListener(new root());
      one = new JButton("1");
      pan.add(one);
      one.addActionListener(new One());
      two = new JButton("2");
      pan.add(two);
      two.addActionListener(new Two());
      three = new JButton("3");
      pan.add(three);
      three.addActionListener(new Three());
      four = new JButton("4");
      pan.add(four);
      four.addActionListener(new Four());
      five = new JButton("5");
      pan.add(five);
      five.addActionListener(new Five());
      six = new JButton("6");
      pan.add(six);
      six.addActionListener(new Six());
      seven = new JButton("7");
      pan.add(seven);
      seven.addActionListener(new Seven());
      eight = new JButton("8");
      pan.add(eight);
      eight.addActionListener(new Eight());
      nine = new JButton("9");
      pan.add(nine);
      nine.addActionListener(new Nine());
      zero = new JButton("0");
      pan.add(zero);
      zero.addActionListener(new Zero());
      sin = new JButton("sin");
      pan.add(sin);
      sin.addActionListener(new sine());
      cos = new JButton("cos");
      pan.add(cos);
      cos.addActionListener(new cosine());
      tan = new JButton("tan");
      pan.add(tan);
      tan.addActionListener(new tangent());
      fact = new JButton("!");
      pan.add(fact);
      fact.addActionListener(new factorial());
      x = new JButton("1/x");
      pan.add(x);
      x.addActionListener(new divByX());
      squared = new JButton("x^2");
      pan.add(squared);
      squared.addActionListener(new square());
      log = new JButton("log");
      pan.add(log);
      log.addActionListener(new logarithm());
      
      ImageIcon ram = new ImageIcon("ram.jpeg"); //add image to panel
      JLabel photo = new JLabel(ram);
      photo.setIcon(ram);
      pan.add(photo);
      
      win.setVisible(true);
      win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //calculator closes when you exit out of it
   
   }
   //private classes for making buttons on calculator function
   private static class Clear implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         textBox.setText(""); //clears text box
      }
   }
    
   private static class decimal implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         String output = textBox.getText() + decimal.getText();
         textBox.setText(output);
      }
   }  
   
   private static class add implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         first = Double.parseDouble(textBox.getText()); //gets input from text box and converts it to double
         textBox.setText(""); //resets text box
         operation = "+";
      }
   }
   
   private static class mult implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         first = Double.parseDouble(textBox.getText());
         textBox.setText("");
         operation = "*";
      }
   }
   
   private static class div implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         first = Double.parseDouble(textBox.getText());
         textBox.setText("");
         operation = "/";
      }
   }
   
   private static class root implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         third = Math.sqrt(Double.parseDouble(textBox.getText()));
         answer = Double.toString(third);
         textBox.setText(answer);
      }
   }
  
   private static class One implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         String output = textBox.getText() + one.getText();
         textBox.setText(output);
      }
   }

   private static class Two implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         String output = textBox.getText() + two.getText();
         textBox.setText(output);
      }
   }
   private static class Three implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         String output = textBox.getText() + three.getText();
         textBox.setText(output);
      }
   }
   private static class Four implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         String output = textBox.getText() + four.getText();
         textBox.setText(output);
      }
   }
   private static class Five implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         String output = textBox.getText() + five.getText();
         textBox.setText(output);
      }
   }
   private static class Six implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         String output = textBox.getText() + six.getText();
         textBox.setText(output);
      }
   }   
   private static class Seven implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         String output = textBox.getText() + seven.getText();
         textBox.setText(output);
      }
   }   
   private static class Eight implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         String output = textBox.getText() + eight.getText();
         textBox.setText(output);
      }
   }
   private static class Nine implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         String output = textBox.getText() + nine.getText();
         textBox.setText(output);
      }
   }
   private static class Zero implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         String output = textBox.getText() + zero.getText();
         textBox.setText(output);
      }
   } 
   private static class sine implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         third = Math.sin(Double.parseDouble(textBox.getText()));
         answer = Double.toString(third);
         textBox.setText(answer);
      }
   }
   
   private static class cosine implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         third = Math.cos(Double.parseDouble(textBox.getText()));
         answer = Double.toString(third);
         textBox.setText(answer);
      }
   }
   
   private static class tangent implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         third = Math.tan(Double.parseDouble(textBox.getText()));
         answer = Double.toString(third);
         textBox.setText(answer);
      }
   }
   
   private static class factorial implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         first = Double.parseDouble(textBox.getText());
         third = factorial(first); //method call
         answer = Double.toString(third);
         textBox.setText(answer);
      }
      public double factorial(double num) { //recursive method for getting factorial of a number
         if(num == 1) { //base case
            return 1;
         }
         else { //recursive case
            return num * factorial(num-1);
         }
      }
   }
   
   private static class divByX implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         first = Double.parseDouble(textBox.getText());
         third = 1 / first;
         answer = Double.toString(third);
         textBox.setText(answer);
      }
   }
   
   private static class square implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         first = Double.parseDouble(textBox.getText());
         third = first * first;
         answer = Double.toString(third);
         textBox.setText(answer);
      }
   }
   
   private static class logarithm implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         third = Math.log(Double.parseDouble(textBox.getText()));
         answer = Double.toString(third);
         textBox.setText(answer);
      }
   }
   
   private static class solve implements ActionListener { //class for +, *, and / operations
      public void actionPerformed(ActionEvent e) {
         second = Double.parseDouble(textBox.getText()); //gets second value from text box and converts it to double
        
         if(operation == "+") {
            third = first + second;
            answer = Double.toString(third);
            textBox.setText(answer);
         }
         else if(operation == "*") {
            third = first * second;
            answer = Double.toString(third);
            textBox.setText(answer);
         }
         else if(operation == "/") {
            third = first / second;
            answer = Double.toString(third);
            textBox.setText(answer);
         }
      
      }
      
   }

}
