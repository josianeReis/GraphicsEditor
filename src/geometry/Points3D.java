package geometry;

public class Points3D 
{
	
	private float x;
	private float y;
	private float w;
	private float z;
	
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
	
	public float getZ() 
	{
		return z;
	}
	
	public void setZ(float z) 
	{
		this.z = z;
	}
	
	public Points3D()
	{
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.w = 1;
	}
	
	public Points3D(float[][] mat)
	{
		this.x = mat[0][0];
		this.y = mat[0][1];
		this.z = mat[0][2];
		this.w = mat[0][3];
	}
	
	public Points3D(float x, float y, float z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = 1;
	}
	
	public Points3D(float x, float y,float z, float w)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	public float[][] getMat() 
	{		
		float[][] out = new float[1][4];
		out[0][0] = x;
		out[0][1] = y;
		out[0][2] = z;
		out[0][3] = w;
		return out;
	}

}
