	import java.util.Scanner;
	import java.io.*;
	import javax.swing.*;


	public class File_Choosers_Demo {
		public static void main(String[] args) throws IOException {
			JFrame frame = new JFrame("File Chooser Demo");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			JTextArea text_area = new JTextArea(30, 30);
			JFileChooser file_chooser = new JFileChooser();

			int check_status = file_chooser.showOpenDialog(null);
		
			if(check_status != JFileChooser.APPROVE_OPTION)
				text_area.setText("No File Chosen");
			else {
				File chosen_file = file_chooser.getSelectedFile();
				Scanner scan = new Scanner(chosen_file);
				String text = "";
				while(scan.hasNext())
					text+=scan.nextLine()+"\n";
				text_area.setText(text);
			}
		
			frame.getContentPane().add(text_area);
			frame.pack();
			frame.setVisible(true);
		}
	}
