import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



public class WelcomeFrame extends JFrame
{

	private ReservationManager model;

	public WelcomeFrame(ReservationManager model)
	{
		this();
		this.model = model;
	}
	
	public WelcomeFrame() //PUT MODEL IN PARAMETERS 
	{
		this.setTitle("Pen Pineapple Apple Pen Hotel Reservation System");


		JPanel container = new JPanel();
		container.setPreferredSize(new Dimension(475, 325));

		JLabel welcomeLabel = new JLabel("  Welcome to the Pineapple Hotel", SwingConstants.CENTER);
		//welcomeLabel.setAlignmentX(CENTER_ALIGNMENT);
		welcomeLabel.setFont(new Font("Calibri", Font.BOLD, 25));
		welcomeLabel.setPreferredSize(new Dimension(475, 100));

		JButton guestButton = new JButton("Hotel Guest");
		guestButton.setPreferredSize(new Dimension(300,100));
		guestButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				new GuestFrame(model);
			}
		});

		JButton managerButton = new JButton("Hotel Manager");
		managerButton.setPreferredSize(new Dimension(300,100));
		managerButton.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) 
			{
				new CalendarFrameBeta(model);
				new RoomViewFrame(model);
			}
		});

		container.add(welcomeLabel);
		container.add(guestButton);
		container.add(managerButton);

		add(container);		
		pack();		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

