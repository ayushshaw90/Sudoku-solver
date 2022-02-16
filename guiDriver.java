import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class guiDriver {
  static JFrame f;
  
  static sudoku9 ob;
  
  static int[][][] C;
  
  static JLabel l;
  
  static JTextField[][] input;
  
  public static void main(String[] args) {
    ob = new sudoku9();
    C = new int[9][9][10];
    f = new JFrame();
    Container c = f.getContentPane();
    JLabel l1 = new JLabel("Welcome ");
    l = new JLabel("");
    input = new JTextField[9][9];
    JButton b = new JButton("Click here");
    b.addActionListener(new BUT());
    f.setSize(180, 320);
    c.setLayout(new FlowLayout());
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        input[i][j] = new JTextField(1);
        c.add(input[i][j]);
      } 
    } 
    c.add(l);
    f.setResizable(false);
    c.add(b);
    c.add(l1);
    f.setVisible(true);
    f.setDefaultCloseOperation(3);
  }
  
  static class BUT implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      int i;
      for (i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
          if (guiDriver.input[i][j].getText().equals(" ")) {
            guiDriver.C[i][j][0] = 0;
          } else {
            guiDriver.C[i][j][0] = Integer.parseInt("" + guiDriver.input[i][j].getText().charAt(0));
          } 
        } 
      } 
      guiDriver.ob.PrepareArray(guiDriver.C);
      guiDriver.ob.main1(guiDriver.C);
      if (!guiDriver.ob.checkComplete(guiDriver.C))
        do {
          guiDriver.ob.acceptAnAssumedValue(guiDriver.C);
          guiDriver.ob.PrepareArray(guiDriver.C);
          guiDriver.ob.main1(guiDriver.C);
        } while (!guiDriver.ob.checkComplete(guiDriver.C)); 
      //printing
      for (i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++)
          guiDriver.input[i][j].setText("" + guiDriver.C[i][j][0]); 
      } 
    }
  }
}
