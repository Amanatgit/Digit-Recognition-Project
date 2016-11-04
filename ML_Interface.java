import java.awt.EventQueue;
import javax.swing.*;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.*;
//import java.awt.Canvas;
//import java.awt.Label;
//import java.awt.Color;
//import java.awt.Button;
//import javax.swing.JComboBox;
//import javax.swing.DefaultComboBoxModel;
//import java.awt.Toolkit;
//import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import javax.swing.JTextField;

public class ML_Interface {

	private JFrame frmMachineLearning;
	private JTextField hufmanCod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ML_Interface window = new ML_Interface();
					window.frmMachineLearning.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	DigitRecognition drawDigit= new DigitRecognition();
	public ML_Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmMachineLearning = new JFrame();
		frmMachineLearning.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\MLDM\\m2\\ML project\\ML_Project\\Capture.PNG"));
		frmMachineLearning.setTitle("Machine Learning");
		frmMachineLearning.setBounds(100, 100, 798, 497);
		frmMachineLearning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMachineLearning.getContentPane().setLayout(null);
		
		JLabel lblDigitRecognition = DefaultComponentFactory.getInstance().createLabel("Digit Recognition ");
		lblDigitRecognition.setForeground(Color.BLUE);
		lblDigitRecognition.setBackground(new Color(0, 0, 255));
		lblDigitRecognition.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblDigitRecognition.setBounds(323, 11, 214, 31);
		frmMachineLearning.getContentPane().add(lblDigitRecognition);
		
		Canvas canvasDrawing = new Canvas();
		canvasDrawing.setForeground(SystemColor.windowText);
		canvasDrawing.setBackground(Color.WHITE);
		canvasDrawing.setBounds(232, 81, 200, 200);
		canvasDrawing.addMouseListener(drawDigit);
		frmMachineLearning.getContentPane().add(canvasDrawing);
		
		Label label = new Label("Write your Digit");
		label.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label.setBounds(268, 53, 164, 22);
		frmMachineLearning.getContentPane().add(label);
		
		Canvas classifyCanvas = new Canvas();
		classifyCanvas.setBackground(Color.WHITE);
		classifyCanvas.setBounds(530, 81, 200, 200);
		frmMachineLearning.getContentPane().add(classifyCanvas);
		
		Button buttonTraining = new Button("Add to Training");
		buttonTraining.setBounds(232, 298, 93, 22);
		frmMachineLearning.getContentPane().add(buttonTraining);
		
		Label label_1 = new Label("Classification");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_1.setBounds(572, 53, 102, 22);
		frmMachineLearning.getContentPane().add(label_1);
		
		Button buttonClassify = new Button("Classify");
		buttonClassify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				classifyCanvas.setBackground(Color.black);
			}
		});
		buttonClassify.setBounds(358, 298, 70, 22);
		frmMachineLearning.getContentPane().add(buttonClassify);
		
		Button buttonClear = new Button("Clear");
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hufmanCod.setText(null);
				classifyCanvas.setBackground(Color.WHITE);
			}
		});
		buttonClear.setBackground(Color.RED);
		buttonClear.setBounds(300, 333, 70, 22);
		frmMachineLearning.getContentPane().add(buttonClear);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1NN", "KNN", "HMM"}));
		comboBox.setBounds(45, 86, 102, 20);
		frmMachineLearning.getContentPane().add(comboBox);
		
		Label label_2 = new Label("Choose Algorithm");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_2.setBounds(35, 53, 139, 22);
		frmMachineLearning.getContentPane().add(label_2);
		
		JRadioButton rdbtnAutoConnect = new JRadioButton("Auto Connect");
		rdbtnAutoConnect.setBounds(49, 258, 109, 23);
		frmMachineLearning.getContentPane().add(rdbtnAutoConnect);
		
		Button buttonCode = new Button("Code");
		buttonCode.setFont(new Font("Times New Roman", Font.BOLD, 14));
		buttonCode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hufmanCod.setText("here is the huffman code");
			}
		});
		buttonCode.setBounds(58, 391, 70, 22);
		frmMachineLearning.getContentPane().add(buttonCode);
		
		hufmanCod = new JTextField();
		hufmanCod.setEditable(false);
		hufmanCod.setBounds(136, 393, 594, 20);
		frmMachineLearning.getContentPane().add(hufmanCod);
		hufmanCod.setColumns(10);
	}
}
