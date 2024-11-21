import javax.swing.JOptionPane;
public class Introduction
{
	public static void main(String[] args)
	{
		int date = 0,age = 0;
		String name = " ", surname = " ";
		
		name = JOptionPane.showInputDialog(null,"Please enter your name: ");
		surname = JOptionPane.showInputDialog(null,"Please enter your surname: ");
		date = Integer.parseInt(JOptionPane.showInputDialog(null,"What year were you born in ?"));
		
		age = 2024-date;
		
		JOptionPane.showMessageDialog(null,"You're "+name+" "+surname+" who is "+age+" years old,born in "+date);
	}
}