import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;
import java.awt.SystemColor;
import java.awt.Font;

public class Plansza {

	private JFrame frame;
	private JTextField textField;
	private boolean czyOperacja;
	private boolean czyDodawanie;
	private boolean czyOdejmowanie;
	private boolean czyMnozenie;
	private double liczba1 = 0;
	private double liczba2 = 0;
	private double wynik = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Plansza window = new Plansza();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Plansza() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	public void initialize() {
		
		czyDodawanie = false;
		czyOdejmowanie = false;
		czyOperacja = false;
		czyMnozenie = false;
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 380, 258);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(SystemColor.inactiveCaptionBorder);
		frame.getContentPane().add(desktopPane, BorderLayout.CENTER);

		/* TWO BUTTON */
		JButton btnTwo = new JButton("2");
		btnTwo.setBounds(75, 167, 55, 42);
		desktopPane.add(btnTwo);
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (czyOperacja == true) {
					textField.setText("");
					textField.setText(textField.getText() + "2");
					czyOperacja = false;
				} else {

					textField.setText(textField.getText() + "2");
				}
			}
		});
		/* END TWO BUTTON */
		
		JButton btnOne = new JButton("1");
		btnOne.setBounds(10, 167, 55, 42);
		desktopPane.add(btnOne);
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (czyOperacja == true) {
					textField.setText("");
					textField.setText(textField.getText() + "1");
					czyOperacja = false;
				} else {

					textField.setText(textField.getText() + "1");
				}
			}
		});
		
		JButton btnThree = new JButton("3");
		btnThree.setBounds(140, 167, 55, 42);
		desktopPane.add(btnThree);
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (czyOperacja == true) {
					textField.setText("");
					textField.setText(textField.getText() + "3");
					czyOperacja = false;
				} else {

					textField.setText(textField.getText() + "3");
				}
			}
		});
		
		JButton btnNine = new JButton("9");
		btnNine.setBounds(140, 61, 55, 42);
		desktopPane.add(btnNine);
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (czyOperacja == true) {
					textField.setText("");
					textField.setText(textField.getText() + "9");
					czyOperacja = false;
				} else {

					textField.setText(textField.getText() + "9");
				}
			}
		});
		
		JButton btnEight = new JButton("8");
		btnEight.setBounds(75, 61, 55, 42);
		desktopPane.add(btnEight);
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (czyOperacja == true) {
					textField.setText("");
					textField.setText(textField.getText() + "8");
					czyOperacja = false;
				} else {

					textField.setText(textField.getText() + "8");
				}
			}
		});
		
		JButton btnSeven = new JButton("7");
		btnSeven.setBounds(10, 61, 55, 42);
		desktopPane.add(btnSeven);
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (czyOperacja == true) {
					textField.setText("");
					textField.setText(textField.getText() + "7");
					czyOperacja = false;
				} else {

					textField.setText(textField.getText() + "7");
				}
			}
		});
		
		JButton btnSix = new JButton("6");
		btnSix.setBounds(140, 114, 55, 42);
		desktopPane.add(btnSix);
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (czyOperacja == true) {
					textField.setText("");
					textField.setText(textField.getText() + "6");
					czyOperacja = false;
				} else {

					textField.setText(textField.getText() + "6");
				}
			}
		});
		
		JButton btnFive = new JButton("5");
		btnFive.setBounds(75, 114, 55, 42);
		desktopPane.add(btnFive);
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (czyOperacja == true) {
					textField.setText("");
					textField.setText(textField.getText() + "5");
					czyOperacja = false;
				} else {

					textField.setText(textField.getText() + "5");
				}
			}
		});
		
		
		
		JButton btnFour = new JButton("4");
		btnFour.setBounds(10, 114, 55, 42);
		desktopPane.add(btnFour);
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (czyOperacja == true) {
					textField.setText("");
					textField.setText(textField.getText() + "4");
					czyOperacja = false;
				} else {

					textField.setText(textField.getText() + "4");
				}
			}
		});
		
		/* MNOZENIE BUTTON */

		JButton btnMnozenie = new JButton("*");
		btnMnozenie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() != 0) {
					liczba1 = Double.parseDouble(textField.getText());
					czyOperacja = true;
					czyMnozenie = true;
				}
			}
		});
		btnMnozenie.setBounds(256, 114, 41, 42);
		desktopPane.add(btnMnozenie);

		/* MNOZENIE BUTTON */
		/* PLUS BUTTON */

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() != 0) {
					liczba1 = Double.parseDouble(textField.getText());
					czyOperacja = true;
					czyDodawanie = true;
				}
			}
		});
		btnPlus.setBounds(205, 167, 41, 42);
		desktopPane.add(btnPlus);

		/* END PLUS */
		
		
		/* MINUS BUTTON */

		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() != 0) {
					liczba1 = Double.parseDouble(textField.getText());
					czyOperacja = true;
					czyOdejmowanie = true;
				}
			}
		});
		btnMinus.setBounds(256, 167, 41, 42);
		desktopPane.add(btnMinus);

		/* END MINUS */
		/* WYNIK BUTTON */
		Operacje operacje = new Operacje();
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.getText().length() != 0) {
				liczba2 = Double.parseDouble(textField.getText());
				}
				if (liczba1 != 0 && liczba2 != 0) {
					if (czyDodawanie) {
						wynik = operacje.dodaj(liczba1, liczba2);
						textField.setText("");
						textField.setText(String.valueOf(wynik));
						wynik=0;

					}
					
					if (czyOdejmowanie) {
						wynik = operacje.odejmij(liczba1, liczba2);
						textField.setText("");
						textField.setText(String.valueOf(wynik));
						wynik=0;

					}
					
					if (czyMnozenie) {
						wynik = operacje.pomnoz(liczba1, liczba2);
						textField.setText("");
						textField.setText(String.valueOf(wynik));
						wynik=0;

					}
				}
			}
		});
		btnEqual.setBounds(307, 167, 43, 42);
		desktopPane.add(btnEqual);
		/* END WYNIK */

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField.setBounds(0, 0, 434, 50);
		desktopPane.add(textField);
		textField.setColumns(10);
		
		
		/* CE BUTTON */
		JButton btnCe = new JButton("CE");
		btnCe.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				liczba1=0;
				liczba2=0;
				wynik=0;
				
			}
		});
		btnCe.setBounds(307, 114, 47, 42);
		desktopPane.add(btnCe);
		/* END CE BUTTON */
	}
}
