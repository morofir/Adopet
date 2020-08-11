package View;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

@SuppressWarnings("serial")
public class SlideShow extends JFrame{
	JLabel pic;
	Timer tm;
	int x = 2;

	public SlideShow(){
		super("Adopet SlideShow");
		pic = new JLabel();
		pic.setBounds(40, 30, 700, 300);

		SetImageSize(1);		
		tm = new Timer(2000,new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SetImageSize(x);
				x += 1;
				if(x > 14) // number of pictures in database
					x = 1; 
			}
		});
		getContentPane().add(pic);
		tm.start();
		getContentPane().setLayout(null);
		setSize(800, 416);
		getContentPane().setBackground(Color.decode("#F8F9F9"));
		setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public void SetImageSize(int i){
		ClassLoader cl= this.getClass().getClassLoader();
		java.net.URL imageURL   = cl.getResource("jv"+(i)+".jpg");
		ImageIcon icon = new ImageIcon(imageURL);
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		pic.setIcon(newImc);

	}

	public static void main(String[] args){ 

		new SlideShow();
	}
}