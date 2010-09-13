package model;

public class PositionGPS extends Position{
	private double latitude;
	private double longitude;
	
	public PositionGPS(double lat, double lon)
	{
		latitude = lat;
		longitude = lon;
	}
	
	public double getLat()
	{
		return latitude;
	}
	
	public void setLat(double lat)
	{
		latitude = lat;
	}
	
	public double getLong()
	{
		return longitude;
	}
	
	public void setLong(double lon)
	{
		longitude = lon;
	}
}
