package editor;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;

import javax.swing.JPanel;

public class Editor extends JPanel implements ActionListener 
{

	private static final long serialVersionUID = 1L;
	
	private Color initialColor;
	private Color finalColor;
	
	public Editor(Color initialColor, Color finalColor)
	{
		if (initialColor == null)
            throw new IllegalArgumentException("Invalid initial color!");
		if (finalColor == null)
            throw new IllegalArgumentException("Invalid final color!");
        this.initialColor = initialColor;
        this.finalColor = finalColor;		
	}

	@Override
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);		
		Graphics2D g2d = (Graphics2D) g.create();
		
		if (!isOpaque()) 
	    {
	        return;
	    }
		
		GradientPaint paint = new GradientPaint(
	            new Point2D.Float(getWidth() / 2, 0), initialColor, 
	            new Point2D.Float(getWidth() / 2, getHeight()), finalColor);
	    g2d.setPaint(paint);
	    g2d.fillRect(0, 0, getWidth(), getHeight());
	    g2d.dispose();

	}
	
	public static void main(String[] Args) {
		@SuppressWarnings("unused")
		Interface frame = new Interface();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
