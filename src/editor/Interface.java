package editor;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Interface extends JFrame implements ActionListener {

	static final long serialVersionUID = 1L;
	
	private Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize(); //get the window size
	private Font font = new Font("DejaVu Sans", Font.PLAIN, 13); 
	
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenu editMenu;
	private JMenu viewMenu;
	private JMenu helpMenu;
	
	private JMenuItem newMenuItem;
	private JMenuItem mode2dItem;
	private JMenuItem mode3dItem;

	public Interface() 
	{
		super("Graphics Editor");
		createWindow();
		createMenuBar();
		setLayout(null);
		setVisible(true);
	}

	private void createMenuBar() 
	{
		menuBar = new JMenuBar();
		menuBar.setPreferredSize(new Dimension(100, 30));
		menuBar.setFont(font);
		menuBar.setBackground(Color.decode("#6D6C6C"));
		
	    fileMenu = new JMenu("File");
	    fileMenu.setMnemonic(KeyEvent.VK_F);
	    fileMenu.setPreferredSize(new Dimension(80, 30));
	    fileMenu.setFont(font);
	    fileMenu.setForeground(Color.white);
	    menuBar.add(fileMenu);
	    
	    editMenu = new JMenu("Edit");
	    editMenu.setMnemonic(KeyEvent.VK_F);
	    editMenu.setPreferredSize(new Dimension(80, 30));
	    editMenu.setFont(font);
	    editMenu.setForeground(Color.white);
	    menuBar.add(editMenu);
	    
	    viewMenu = new JMenu("View");
	    viewMenu.setMnemonic(KeyEvent.VK_F);
	    viewMenu.setPreferredSize(new Dimension(80, 30));
	    viewMenu.setFont(font);	    
	    viewMenu.setForeground(Color.white);
	    menuBar.add(viewMenu);
	    
	    helpMenu = new JMenu("Help");
	    helpMenu.setMnemonic(KeyEvent.VK_F);
	    helpMenu.setPreferredSize(new Dimension(80, 30));
	    helpMenu.setFont(font);	
	    helpMenu.setForeground(Color.white);
	    menuBar.add(helpMenu);	  

	    newMenuItem = new JMenuItem("New", KeyEvent.VK_N);
	    fileMenu.add(newMenuItem);
	    
	    mode2dItem = new JMenuItem("2D Mode", KeyEvent.VK_N);
	    viewMenu.add(mode2dItem);
	    
	    mode3dItem = new JMenuItem("3D Mode", KeyEvent.VK_N);
	    viewMenu.add(mode3dItem);

	    this.setJMenuBar(menuBar);	
	    this.setVisible(true);	    
	    
	}

	private void createWindow() 
	{		
		setSize(windowSize.width, windowSize.height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub

	}
}
