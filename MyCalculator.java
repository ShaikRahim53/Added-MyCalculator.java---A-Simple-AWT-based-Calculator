import java.awt.*;
import java.awt.event.*;
class MyCalculator extends Frame implements ActionListener
{
Frame frame = new Frame("MyCalculator");
TextField textField =new TextField();
int firstNumber,secondNumber,result;
char operator;
Button b1=new Button("1");
Button b2=new Button("2");
Button b3=new Button("3");
Button b4=new Button("4");
Button b5=new Button("5");
Button b6=new Button("6");
Button b7=new Button("7");
Button b8=new Button("8");
Button b9=new Button("9");
Button b0=new Button("0");
Button bc=new Button("C");
Button bp=new Button("+");
Button bs=new Button("-");
Button bm=new Button("*");
Button bd=new Button("/");
Button bq=new Button("=");
Panel panel = new Panel();
MyCalculator()
{
frame.add(textField,"North");
frame.add(panel ,"Center");
frame.addWindowListener(new WindowAdapter(){
   public void windowClosing(WindowEvent we) {
System.exit(0);
   }
  });
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
bc.addActionListener(this);
bp.addActionListener(this);
bs.addActionListener(this);
bm.addActionListener(this);
bd.addActionListener(this);
bq.addActionListener(this);
panel.add(b7);
panel.add(b8);
panel.add(b9);
panel.add(bp);
panel.add(b6);
panel.add(b5);
panel.add(b4);
panel.add(bs);
panel.add(b1);
panel.add(b2);
panel.add(b3);
panel.add(bm);
panel.add(bc);
panel.add(b0);
panel.add(bq);
panel.add(bd);
panel.setLayout(new GridLayout(4,4));
frame.setVisible(true);
frame.setSize(350,450);
}
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
if(str.equals("+"))
{
operator = str.charAt(0);
firstNumber = Integer.parseInt(textField.getText());
System.out.println(firstNumber) ;
textField.setText("");
}
else if(str.equals("-"))
{
operator = str.charAt(0);
firstNumber = Integer.parseInt(textField.getText());
System.out.println(firstNumber) ;
textField.setText("");
}
else if(str.equals("*"))
{
operator = str.charAt(0);
firstNumber = Integer.parseInt(textField.getText());
System.out.println(firstNumber) ;
textField.setText("");
}
else if(str.equals("/"))
{
operator = str.charAt(0);
firstNumber = Integer.parseInt(textField.getText());
System.out.println(firstNumber) ;
textField.setText("");
}
else if(str.equals("="))
{
String exp="";
secondNumber = Integer.parseInt(textField.getText());
System.out.println(secondNumber) ;
switch(operator ) 
{
case '+': result = firstNumber + secondNumber; 
		textField.setText(result+"");
          break;
case '-': result = firstNumber - secondNumber; 
	textField.setText(result+"");
          break;
case '*': result = firstNumber * secondNumber; 
textField.setText(result+"");
          break;
case '/': 
 try
	{
	  result = firstNumber/secondNumber ; 
textField.setText(result+"");
                    }
	        catch(ArithmeticException aex)
                                    {
			result=0;
			exp=exp.concat(aex.getMessage());
			textField.setText(result+exp);
		       	       }
	        catch(NumberFormatException nfe)
                                    {
		result=0;
		exp=exp.concat(nfe.getMessage());
textField.setText(result+exp);
                                   }
          break;
}
}
else if(str.equals("C"))
{
firstNumber = secondNumber = result = 0;
textField.setText("");
}
else
{
textField.setText(textField.getText()+str);
}
}
public static void main(String arg[])
{
new MyCalculator();
}
}

