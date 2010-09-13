package sitac.model;

public class PositionGPS extends Position {
	
	private double lat_;
	private double long_;
	
	public PositionGPS()
	{
		super();
	}
	
	public PositionGPS(double latitude,double longitude)
	{
		lat_=latitude;
		long_=longitude;
	}
	
	public void setLatitude(double latitude)
	{
		lat_=latitude;
	}
	
	public void setLongitude(double longitude)
	{
		long_=longitude;
	}
	
	public void setCoordinates(double latitude, double longitude)
	{
		lat_=latitude;
		long_=longitude;
	}
	
	public double getLatitude()
	{
		return lat_;
	}
	
	public double getLongitude()
	{
		return long_;
	}

}
