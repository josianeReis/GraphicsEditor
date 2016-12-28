package geometry;

public class Points2D 
{	
	private float x;
	private float y;
	private float w;	
	
	public float getX() 
	{
		return x;
	}
	
	public void setX(float x) 
	{
		this.x = x;
	}
	
	public float getY() 
	{
		return y;
	}
	
	public void setY(float y) 
	{
		this.y = y;
	}
	
	public float getW() 
	{
		return w;
	}
	
	public void setW(float w) 
	{
		this.w = w;
	}
	
	public Points2D()
	{
		this.x = 0;
		this.y = 0;
		this.w = 1;
	}
	
	public Points2D(float[][] mat)
	{
		this.x = mat[0][0];
		this.y = mat[0][1];
		this.w = mat[0][2];
	}
	
	public Points2D(float x, float y)
	{
		this.x = x;
		this.y = y;
		this.w = 1;
	}
	
	public Points2D(float x, float y, float w)
	{
		this.x = x;
		this.y = y;
		this.w = w;
	}
	
	public float[][] getMat() 
	{
		float[][] out = new float[1][3];
		out[0][0] = x;
		out[0][1] = y;
		out[0][2] = w;
		return out;
	}
}
