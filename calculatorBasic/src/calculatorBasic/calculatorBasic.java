package calculatorBasic;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class calculatorBasic {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private HistoryManager historyManager = new HistoryManager();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatorBasic window = new calculatorBasic();
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
	public calculatorBasic() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calculator Basic");
		frame.setBounds(100, 100, 306, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Membuat kolom teks untuk menampilkan angka dan hasil perhitungan
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		textField.setBounds(6, 6, 291, 78);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//Membuat tombol angka
		JButton btn0 = new JButton("0");
		//Actionlistener ketika tombol ditekan
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Ketika btn0 ditekan
				String number = textField.getText() + btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn0.setBounds(6, 314, 69, 55);
		frame.getContentPane().add(btn0);
		
		JButton btn1 = new JButton("1");
		//Actionlistener ketika tombol ditekan
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn1.setBounds(6, 259, 69, 55);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		//Actionlistener ketika tombol ditekan
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn2.setBounds(81, 259, 69, 55);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		//Actionlistener ketika tombol ditekan
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn3.setBounds(155, 259, 69, 55);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		//Actionlistener ketika tombol ditekan
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn4.setBounds(6, 204, 69, 55);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		//Actionlistener ketika tombol ditekan
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn5.setBounds(81, 204, 69, 55);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		//Actionlistener ketika tombol ditekan
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn6.setBounds(155, 204, 69, 55);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		//Actionlistener ketika tombol ditekan
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn7.setBounds(6, 150, 69, 55);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		//Actionlistener ketika tombol ditekan
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn8.setBounds(81, 150, 69, 55);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		//Actionlistener ketika tombol ditekan
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn9.setBounds(155, 150, 69, 55);
		frame.getContentPane().add(btn9);
		
		JButton btnDot = new JButton(".");
		//Actionlistener ketika tombol ditekan
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText() + btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnDot.setBounds(81, 314, 69, 55);
		frame.getContentPane().add(btnDot);
		
		JButton btnDelete = new JButton("DEL");
		//Actionlistener ketika tombol ditekan
		btnDelete.addActionListener(new ActionListener() {
			//Menghapus satu bilangan
			public void actionPerformed(ActionEvent e) {
				String delete = null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					delete = str.toString();
					textField.setText(delete);
				}
			}
		});
		btnDelete.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnDelete.setBounds(6, 96, 69, 55);
		frame.getContentPane().add(btnDelete);
		
		
		JButton btnClear = new JButton("C");
		//Actionlistener ketika tombol ditekan
		btnClear.addActionListener(new ActionListener() {
			//Menghapus semua bilangan di textfield
			public void actionPerformed(ActionEvent args0) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnClear.setBounds(81, 96, 69, 55);
		frame.getContentPane().add(btnClear);
		
		
		JButton btnHistory = new JButton("H");
		//Actionlistener ketika tombol ditekan
		btnHistory.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        ArrayList<String> history = HistoryManager.fetchHistory();

		        // buat window baru untuk history perhitungan
		        JFrame historyFrame = new JFrame("Calculation History");
		        historyFrame.setSize(400, 300);
		        historyFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		        // buat scrollable text area
		        JTextArea historyTextArea = new JTextArea();
		        historyTextArea.setEditable(false); // Mencegah edit
		        historyTextArea.setLineWrap(true); // line wrap
		        historyTextArea.setWrapStyleWord(true);

		        // Untuk history ditambahkan ke window
		        for (String entry : history) {
		            historyTextArea.append(entry + "\n");
		        }
		        
		     // Mouselistener agar window history calculation bisa di klik
		        historyTextArea.addMouseListener(new MouseAdapter() {
		            @Override
		            public void mouseClicked(MouseEvent e) {
		                // Get the clicked line
		            	try {
		                    // Get the clicked line
		                    int clickedLine = historyTextArea.getLineOfOffset(historyTextArea.getCaretPosition());
		                    String clickedText = historyTextArea.getText().split("\n")[clickedLine];

		                    // Extract the result from the clicked text (assuming a format like "expression = result")
		                    String[] parts = clickedText.split(" = ");
		                    String result = parts[1];

		                    // Set the textField to the result
		                    textField.setText(result);

		                    // Allow the user to perform calculations using the clicked result
		                    textField.requestFocus(); // Set focus to the textField
		                } catch (BadLocationException ex) {
		                    ex.printStackTrace(); // Handle the exception appropriately
		                }
		            }
		        });

		        // Add the text area to the history window with scrolling
		        JScrollPane scrollPane = new JScrollPane(historyTextArea);
		        historyFrame.add(scrollPane);

		        // Display the history window
		        historyFrame.setVisible(true);
		    }
		});
		btnHistory.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnHistory.setBounds(155, 96, 69, 55);
		frame.getContentPane().add(btnHistory);
		
		
		JButton btnEqual = new JButton("=");
		//Actionlistener ketika tombol ditekan
		btnEqual.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent args0) {
                try {
                    second = Double.parseDouble(textField.getText());
                    Calculator calculator = new Calculator();

                    switch (operation) {
                        case "+":
                            result = calculator.add(first, second);
                            break;
                        case "-":
                            result = calculator.subtract(first, second);
                            break;
                        case "*":
                            result = calculator.multiply(first, second);
                            break;
                        case "/":
                            result = calculator.divide(first, second);
                            break;
                        case "%":
                            result = first * (second / 100);
                            break;
                    	} 
                	}catch (NumberFormatException e) {
                        // Handle invalid input (non-numeric characters)
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
                    }
                

             // Mengecek output dari perhitungan bilangan bulat atau bilangan float
                if (result % 1 == 0) {
                    answer = String.valueOf((int) result); // Use int for integer results
                    HistoryManager.storeHistory(first + " " + operation + " " + second, answer);
                } else {
                    answer = String.valueOf(result); // Use double for float results
                    HistoryManager.storeHistory(first + " " + operation + " " + second, answer);
                }
                textField.setText(answer);
                }
        });
		btnEqual.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnEqual.setBounds(155, 314, 69, 55);
		frame.getContentPane().add(btnEqual);
		
		JButton btnPlus = new JButton("+");
		//Actionlistener ketika tombol ditekan
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnPlus.setBounds(228, 96, 69, 55);
		frame.getContentPane().add(btnPlus);
		
		JButton btnSubtraction = new JButton("-");
		//Actionlistener ketika tombol ditekan
		btnSubtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSubtraction.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnSubtraction.setBounds(228, 150, 69, 55);
		frame.getContentPane().add(btnSubtraction);
		
		
		JButton btnMultiply = new JButton("*");
		//Actionlistener ketika tombol ditekan
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMultiply.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnMultiply.setBounds(228, 204, 69, 55);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		//Actionlistener ketika tombol ditekan
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnDivide.setBounds(228, 259, 69, 55);
		frame.getContentPane().add(btnDivide);
		
		JButton btnPercent = new JButton("%");
		//Actionlistener ketika tombol ditekan
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnPercent.setBounds(228, 314, 69, 55);
		frame.getContentPane().add(btnPercent);
		
		
		
		
	}
}
