
/* FEATURES: Modulo, Age, Birth Year, Disounted Price, Average Score */


import javax.swing.*; // package for frame, label,textfield, buttons
import java.awt.*;  //package for contentpane,background, foreground and font 
import java.awt.event.ActionEvent; //package for action event e
import java.awt.event.ActionListener; //package for action listener 
import java.time.LocalDate; //package use to get the current date 





//Implementing ActionListener 
public class Calculator implements ActionListener {
    private static Calculator Calculator;
    
    //declaring variables
    double number= 0; // for storing value 
    double output= 0; 
    int operation= 0;
    
    //Instantiating of frame,label,textfield and button
    JFrame frame = new JFrame ("My Everyday Calculator"); 
    
    JLabel label = new JLabel (); //to make the user aware on what is inputted 
    JTextField textField = new JTextField (); //shows the number clicked from buttons 


    //Instantiation of buttons  
    JButton Clear = new JButton ("CLEAR");
    JButton Modulo = new JButton ("Mod");
    JButton Delete = new JButton ("Del");
    JButton Addition = new JButton ("+");
    JButton Subtraction = new JButton ("-");
    JButton Multiplication = new JButton ("x");
    JButton Division = new JButton ("÷");
    JButton Equals = new JButton ("=");
    JButton Decimal = new JButton (".");
    JButton Zero = new JButton ("0");
    JButton One = new JButton ("1");
    JButton Two = new JButton ("2");
    JButton Three = new JButton ("3");
    JButton Four = new JButton ("4");         
    JButton Five = new JButton ("5");
    JButton Six = new JButton ("6");
    JButton Seven = new JButton ("7");
    JButton Eight = new JButton ("8");
    JButton Nine = new JButton ("9");
    JButton Age = new JButton ("Age");
    JButton Year = new JButton ("Birth Year");
    JButton Discount = new JButton ("Discounted Price");
    JButton Average = new JButton ("Average Score");


    //Calculator method
    Calculator(){

        CalFrame(); //method call for Calculator Frame
        Components(); //method call for Calculator button and text field components 
        ActionEvents(); //method call for action events
    }

    //executes what's inside the CalFrame method 
    public void CalFrame (){
        
        frame.setSize (320, 470); //for position and size of the frame
        frame.getContentPane().setLayout(null); //to add objects and to position components 
        frame.getContentPane().setBackground(Color.decode("#FFC0CB")); //set to color light pink
        frame.setLocationRelativeTo(null); //to make it center when opened
        frame.setVisible(true); //to make the frame visible 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to exit the application
        
    }

    //executes what's inside the Components method 
    public void Components(){

        label.setBounds(250,0,50,50); //for position and size of the label
        label.setForeground(Color.BLACK); //set color of the text 
        frame.add (label); // to insert label to frame

        textField.setBounds (10,40,285,40);//for position and size of the textfield
        textField.setFont(new Font ("Calibri", Font.PLAIN, 20)); //setting th fonts 
        textField.setEditable(true); //make text field  editable
        textField.setHorizontalAlignment(SwingConstants.RIGHT); //text alignment to right
        frame.add(textField);// to insert textfield to frame

        
        /*Inserting all the components to the frame and setting bounds for positioning and sizing */
        
        // Clear
        frame.add(Clear); 
        Clear.setBounds (10, 95, 60, 40);

        //Modulo
        frame.add(Modulo); 
        Modulo.setBounds (85, 95, 60, 40);

        //Delete
        frame.add(Delete);
        Delete.setBounds (160, 95, 60, 40);

        //Addition
        frame.add(Addition); 
        Addition.setBounds (235, 95, 60, 40);
        
        //Subtraction
        frame.add(Subtraction); 
        Subtraction.setBounds (235, 145, 60, 40);

        
        //Multiplication 
        frame.add(Multiplication); 
        Multiplication.setBounds(235, 195, 60, 40);
     
        //Division 
        frame.add(Division); 
        Division.setBounds (235, 245, 60, 40);


        // Equals 
        frame.add(Equals); 
        Equals.setBounds (235, 295, 60, 40);

       //Decimal
        frame.add(Decimal);
        Decimal.setBounds (160, 295, 60, 40);
        
        //Zero 
        frame.add(Zero);
        Zero.setBounds (10, 295, 135, 40);


        //One 
        frame.add(One);
        One.setBounds (10, 245, 60, 40);

        //Two
        frame.add(Two);
        Two.setBounds (85, 245, 60, 40);


       //Three
        frame.add(Three);
        Three.setBounds (160, 245, 60, 40);

        //Four
        frame.add(Four);
        Four.setBounds (10, 195, 60, 40);

        //Five
        frame.add(Five);
        Five.setBounds (85, 195, 60, 40);

        //Six
        frame.add(Six);
        Six.setBounds (160, 195, 60, 40);

        //Seven
        frame.add(Seven);
        Seven.setBounds (10, 145, 60, 40);

        //Eight 
        frame.add(Eight);
        Eight.setBounds (85, 145, 60, 40);

        //Nine
        frame.add(Nine);
        Nine.setBounds (160, 145, 60, 40);

        //Age Calculator 
        frame.add(Age);
        Age.setBounds (10, 345, 135, 40);

        //Birth Year Calculator
        frame.add(Year);
        Year.setBounds (160, 345, 135, 40);

        //Discounted Price 
        frame.add(Discount);
        Discount.setBounds (10, 390, 135, 40);

        //Average Score
        frame.add(Average);
        Average.setBounds (160, 390, 135, 40);

       
    }
    
    //Registering ActionListener to buttons when clicked 
    public void ActionEvents(){
        
       
        Clear.addActionListener(this);
        Modulo.addActionListener(this);
        Delete.addActionListener(this);
        Addition.addActionListener(this);
        Subtraction.addActionListener(this);
        Multiplication.addActionListener(this);
        Division.addActionListener(this);
        Equals.addActionListener(this);
        Decimal.addActionListener(this);
        Zero.addActionListener(this);  
        One.addActionListener(this);
        Two.addActionListener(this);
        Three.addActionListener(this);
        Four.addActionListener(this);
        Five.addActionListener(this);
        Six.addActionListener(this);
        Seven.addActionListener(this);
        Eight.addActionListener(this);
        Nine.addActionListener(this);
        Age.addActionListener(this);
        Year.addActionListener(this);
        Discount.addActionListener(this);
        Average.addActionListener(this);
        
    }
    
  
 public static void main (String[] args){
       
       //Instantiation of a class or constructor 
       Calculator = new Calculator ();

       
    }
    //Overriding actionPerformed() method
    @Override
    
    //defines what will program do when the users clicks the components being monitored by action event
    public void actionPerformed(ActionEvent e) {
        
        Object click = e.getSource(); // returns the object on which the event occured and stored to click 

        /*Condition for every click */

        if (click == Clear){ //set the text field to blank
            label.setText(""); 
            textField.setText("");
        }
        else if (click == Delete) { // get the length -1 to delete
            int length = textField.getText().length(); // get the length and get text returns the string 
            int number = length - 1;

            if (length > 0) { //stringbuilder to modify the string
                StringBuilder back = new StringBuilder(textField.getText()); 
                back.deleteCharAt(number);
                textField.setText(back.toString()); //set text receives a string 

            }
            if (textField.getText().endsWith("")) {
                label.setText("");
            }
        }
        /* what the user clicks will be shown on the text fields */
        else if (click == Zero) {
            if (textField.getText().equals("0")) { 
                return;
            }

            else {
                textField.setText(textField.getText() + "0");
            }
        }
        else if (click == One) {
            textField.setText(textField.getText() + "1");
        }
        
        else if (click == Two) {
            textField.setText(textField.getText() + "2");
        } 
        
        else if (click == Three) {
            textField.setText(textField.getText() + "3");
        } 
        
        else if (click == Four) {
            textField.setText(textField.getText() + "4");
        } 
        
        else if (click == Five) {
            textField.setText(textField.getText() + "5");
        } 
        
        else if (click == Six) {
            textField.setText(textField.getText() + "6");
        } 
        
        else if (click == Seven) {
            textField.setText(textField.getText() + "7");
        } 
        
        else if (click == Eight) {
            textField.setText(textField.getText() + "8");
        } 
        
        else if (click == Nine) {
            textField.setText(textField.getText() + "9");
        }
        
        else if (click == Decimal) {
            if (textField.getText().contains(".")) {
                return;
            }
            else {
                textField.setText(textField.getText() + ".");
            }

        }
        /* what the user clicks will be perform the operation */

        else if (click == Addition) {
            String str = textField.getText(); //returns the value from the text field and store to str 
            number  = Double.parseDouble(textField.getText()); //converts string to double and store to variable number
            textField.setText("");
            label.setText(str + "+"); //displays label
            operation = 1; // go to switch: case 1
        }
        
        else if (click == Subtraction) {
            String str = textField.getText(); //returns the value from the text field and store to str 
            number  = Double.parseDouble(textField.getText()); //converts string to double and store to variable number
            textField.setText("");
            label.setText(str + "-"); //displays label
            operation = 2; // go to switch: case 2
        }
        
        else if (click == Multiplication) {
            String str = textField.getText(); //returns the value from the text field and store to str 
            number  = Double.parseDouble(textField.getText()); //converts string to double and store to variable number
            textField.setText("");
            label.setText(str + "x");//displays label
            operation = 3; // go to switch: case 3
        }
        
        else if (click == Division) {
            String str = textField.getText(); //returns the value from the text field and store to str 
            number  = Double.parseDouble(textField.getText()); //converts string to double and store to variable number
            textField.setText("");
            label.setText(str + "÷");//displays label
            operation = 4; // go to switch: case 4
        }
        else if (click == Modulo) {
            String str = textField.getText(); //returns the value from the text field and store to str 
            number  = Double.parseDouble(textField.getText()); //converts string to double and store to variable number
            textField.setText("");
            label.setText(str + "%");//displays label
            operation = 5; // go to switch: case 5
        }
        else if (click == Age) {
            String str = textField.getText(); //returns the value from the text field and store to str 
            number  = Double.parseDouble(textField.getText()); //converts string to double and store to variable number
            textField.setText("");
            label.setText(str); //displays label
            operation = 6; // go to switch: case 6
        }
        else if (click == Year) {
            String str = textField.getText(); //returns the value from the text field and store to str 
            number  = Double.parseDouble(textField.getText()); //converts string to double and store to variable number
            textField.setText("");
            label.setText(str); //displays label
            operation = 6; // go to switch: case 6
        }
        else if (click == Discount) {
            String str = textField.getText(); //returns the value from the text field and store to str 
            number  = Double.parseDouble(textField.getText()); //converts string to double and store to variable number
            textField.setText("");
            label.setText(str + "%" + " " + "of" + " "); //displays label
            operation = 7; // go to switch: case 7
        }
        else if (click == Average) {
            String str = textField.getText(); //returns the value from the text field and store to str 
            number  = Double.parseDouble(textField.getText()); //converts string to double and store to variable number
            textField.setText("");
            label.setText(str + "/" ); //displays label
            operation = 8; // go to switch: case 8
        }

        /* When the user clicks equals it goes to switch operation base on the case */
        else if (click == Equals) {
            switch (operation) {

                case 1:
                    output = number  + Double.parseDouble(textField.getText()); //gets the text and parse to double, add and store it to output 
                    if (Double.toString(output).endsWith(".0")) { //check if the output ends with .0 if yes replace with empty string
                        textField.setText(Double.toString(output).replace(".0", ""));
                    }
                    else {
                        textField.setText(Double.toString(output)); //else output will be displayed to textfield
                    }

                    label.setText("");
                    break;

                case 2:
                    output = number  - Double.parseDouble(textField.getText()); //gets the text and parse to double, minus and store it to output 
                    if (Double.toString(output).endsWith(".0")) { //check if the output ends with .0 if yes replace with empty string
                        textField.setText(Double.toString(output).replace(".0", ""));
                    }

                    else {
                        textField.setText(Double.toString(output)); //else output will be displayed to textfield 
                    }

                    label.setText("");
                    break;

                case 3:

                    output = number  * Double.parseDouble(textField.getText());//gets the text and parse to double, multiply and store it to output 
                    if (Double.toString(output).endsWith(".0")) { //check if the output ends with .0 if yes replace with empty string
                        textField.setText(Double.toString(output).replace(".0", ""));
                    }

                    else {
                        textField.setText(Double.toString(output)); //else output will be displayed to textfield 
                    }

                    label.setText("");
                    break;
                case 4:
                    output = number  / Double.parseDouble(textField.getText()); //gets the text and parse to double, divide and store it to output 
                    if (Double.toString(output).endsWith(".0")) {  //check if the output ends with .0 if yes replace with empty string
                        textField.setText(Double.toString(output).replace(".0", ""));
                    }
                    
                    else {
                        textField.setText(Double.toString(output)); //else output will be displayed to textfield 
                    }

                    label.setText("");
                    break;
                //Modulo Feature
                case 5:
                    output = number  % Double.parseDouble(textField.getText()); //gets the text and parse to double, perform modulo and store it to output 
                    if (Double.toString(output).endsWith(".0")) { //check if the output ends with .0 if yes replace with empty string
                        textField.setText(Double.toString(output).replace(".0", ""));
                    }
                    
                    else {
                        textField.setText(Double.toString(output)); //else output will be displayed to textfield 
                    }

                    label.setText("");
                    break;
                //Age and Birth Year Calculator Feature
                case 6:

                LocalDate current_date = LocalDate.now(); // store the local date to curren year variable 
                int current_Year = current_date.getYear(); //get the year of the current date 
               output = current_Year - number; // subtract the current year to what is inputted by the user and store it to output
                    if (Double.toString(output).endsWith(".0")) {  //check if the output ends with .0 if yes replace with empty string
                        textField.setText(Double.toString(output).replace(".0", ""));
                    }

                    else {
                        textField.setText(Double.toString(output)); //else output will be displayed to textfield 
                    }

                    label.setText("");
                    break;

                // Dicounted Price Feature
                case 7:
                         
                        double price = Double.parseDouble(textField.getText()); //gets the text and parse to double and store it to price
                        double percentage = (number/ 100 * price); //perform the operation and store to percentage 
                        output = price - percentage; //subtract price to percentage and store it to output
                        if (Double.toString(output).endsWith(".0")) { //check if the output ends with .0 if yes replace with empty string
                            textField.setText(Double.toString(output).replace(".0", ""));
                        }
    
                        else {
                            textField.setText(Double.toString(output));  //else output will be displayed to textfield 
                        }
    
                        label.setText("");
                        break;
                    // Average  Score Feature
                    case 8:
                        double over = Double.parseDouble(textField.getText()); //gets the text and parse to double and store it to over
                        double average = number/over; //perform the operation and store to average
                        average = average * 50;
                        average = average+ 50;
                        output = average; //store average to output 
                            if (Double.toString(output).endsWith(".0")) { //check if the output ends with .0 if yes replace with empty string
                                textField.setText(Double.toString(output).replace(".0", ""));
                            }
        
                            else {
                                textField.setText(Double.toString(output));  //else output will be displayed to textfield 
                            }
        
                            label.setText("");
                            break;
        
            }
        }
    }   
}


 
