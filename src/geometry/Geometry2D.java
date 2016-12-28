package geometry;

import java.util.ArrayList;
import java.util.List;


public class Geometry2D 
{
	private String color;
	private String idGeometry;
	private List<Points2D> pontos = new ArrayList<Points2D>();
	private List<Edge> edges = new ArrayList<Edge>();
	
	public String getColor() 
	{
		return color;
	}
	
	public void setColor(String color) 
	{
		this.color = color;
	}
	
	public String getIdGeometry() 
	{
		return idGeometry;
	}
	
	public void setIdGeometry(String idGeometry) 
	{
		this.idGeometry = idGeometry;
	}
	
	public List<Points2D> getPontos() 
	{
		return pontos;
	}
	
	public void setPontos(List<Points2D> pontos) 
	{
		this.pontos = pontos;
	}
	
	public List<Edge> getEdges() 
	{
		return edges;
	}
	
	public void setEdges(List<Edge> edges) 
	{
		this.edges = edges;
	}	
	
}
