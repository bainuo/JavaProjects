
package speedrun;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SpeedRun {

	private JFrame frame;
	
	private int count = 0;
	
	private double oldTime;
	
	private double time;

	//Создание фрейма
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpeedRun window = new SpeedRun();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Запуск фрейма
	public SpeedRun() {
		initialize();
	}
	
	//Метод возвращающий время
	private double seconds() {
		return (double)System.nanoTime()/1e9; // текущее время в секундах 
	}
	
	//Логика
	private String diff(double oldTime, double time, int count) {
		double sec = time - oldTime;
		double dt = count/sec*60;
		return String.format("%.0f", dt);
	}

	//Описание фрейма
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u041F\u0440\u043E\u0432\u0435\u0440\u043A\u0430 \u0441\u043A\u043E\u0440\u043E\u043F\u0435\u0447\u0430\u0442\u0430\u043D\u0438\u044F");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Текст о скоропечатания
		final JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 255, 255)); 
		lblNewLabel.setBounds(10, 236, 325, 14);
		frame.getContentPane().add(lblNewLabel);
		
		//Создание окна, где печатаем
		final JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true); //Перескакивает на новую строку, а не уходит в бесконечность
		textArea.setToolTipText("\u041D\u0430\u0447\u043D\u0438 \u0432\u0432\u043E\u0434\u0438\u0442\u044C \u0441\u044E\u0434\u0430 \u0442\u0435\u043A\u0441\u0442 \u043A\u0430\u043A \u043C\u043E\u0436\u043D\u043E \u0431\u044B\u0441\u0442\u0440\u0435\u0435");
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			
			
			//Метод описания команды при нажатии кнопки
			public void keyPressed  (KeyEvent e) {
						
                if (e.getKeyCode () >= 48 && e.getKeyCode () <= 90) {
                	count +=1;
                	
                	if (count == 1) {
                    	oldTime = seconds();
        				//System.out.println("currentTime = " + seconds());
                    }
                    else
                    {
                    	time = seconds();
                    	lblNewLabel.setText("Скорость печати примерно " + diff(oldTime, time, count) + " символов в минуту");
                    }
                }
            }
		});
		textArea.setBounds(10, 11, 414, 214);
		frame.getContentPane().add(textArea);
		
		//Создание кнопки для отчистки текста
		JButton btnNewButton = new JButton("\u0421\u0431\u0440\u043E\u0441");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				lblNewLabel.setText("");
				count = 0;
			}
		});
		btnNewButton.setBounds(345, 236, 79, 14);
		frame.getContentPane().add(btnNewButton);		
	}
}

