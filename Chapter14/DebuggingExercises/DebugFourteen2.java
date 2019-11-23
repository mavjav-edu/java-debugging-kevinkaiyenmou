// Displays list of payment options
//      - credit card, check or cash
// Displays fee for using each - 5%, 2% or 0%
// Note from kevin: Character limit for commits are annoying
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DebugFourteen2 extends JFrame implements ItemListener
{
   FlowLayout flow = new FlowLayout();
   JComboBox<String> payMethod = new JComboBox<String>();
   JLabel payList = new JLabel("Pay List");
   JTextField totFees = new JTextField(25);
   String pctMsg = new String("per cent will be added to your bill");
   int[] fees = {5, 2, 0};
   int feePct = 0;
   String output;
   int fee = 0;
   public DebugFourteen2()
   {
      super("Pay List");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      setLayout(flow);
      payMethod.addItemListener(payMethod);
      add(payList);
      add(payMethod);
      payMethod.addItem("Credit card");
      payMethod.addItem("Check");
      payMethod.addItem("Cash");
      add(totFees);
   }
   public static void main(String[] arg)
   {
      JFrame cframe = new DebugFourteen2();
      cframe.setSize(350, HIGHT);
      cframe.setVisible(true);
   }
   @Override
   public void itemStateChanged()
   {
      Object source = list.getSource();
      if(source == payMethod)
      {
         int fee = payMethod.getSelectedIndex();
         feePct = fees[x]; // Note from Kevin: x isn't right but I don't know what to replace it with
         output = feePct + " " + pctMsg;
         totFees.setText(output);
      }
   }
}