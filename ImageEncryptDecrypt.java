import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class ImageEncryptDecrypt {

    public static void operate(int key)
    {

        JFileChooser fileChooser=new JFileChooser();
        fileChooser.showOpenDialog(null);
        File file=fileChooser.getSelectedFile();
        //file FileInputStream
        try
        {

            FileInputStream fis=new FileInputStream(file);

            byte []data=new byte[fis.available()];
            fis.read(data);
            int i=0;
            for(byte b:data)
            {
                System.out.println(b);
                data[i]=(byte)(b^key);
                i++;
            }

            FileOutputStream fos=new FileOutputStream(file);
            fos.write(data);
            fos.close();
            fis.close();
            JOptionPane.showMessageDialog(null, "Done");

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        
        System.out.println("running...");

        JFrame f=new JFrame();
        f.setResizable(false);
        f.setTitle("Image-Encrypt-Decrypt");
        f.setSize(400,300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font=new Font("Roboto",Font.BOLD,25);
        //creating button
        JButton button1=new JButton();
        button1.setText("Encrypt");
        button1.setFont(font);

        JButton button2 = new JButton();
        button2.setText("Decrypt");
        button2.setFont(font);
        //creating text field

        JTextField textField1=new JTextField(10);
        textField1.setFont(font);

        JTextField textField2=new JTextField(10);
        textField2.setFont(font);
        
        
        button1.addActionListener(e->{
            System.out.println("button clicked");
            String text=textField1.getText();
            int temp=Integer.parseInt(text);
            operate(temp);
        });

        button2.addActionListener(e->{
            System.out.println("button clicked");
            String text=textField2.getText();
            int temp=Integer.parseInt(text);
            operate(temp);
        });


        f.setLayout(new FlowLayout());

        
        f.add(textField1);
        f.add(button1);
        f.add(textField2);
        f.add(button2);
        f.setVisible(true);

    }
}