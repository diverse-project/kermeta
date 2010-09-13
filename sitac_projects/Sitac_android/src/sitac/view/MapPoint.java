package sitac.view;

import org.andnav.osm.util.GeoPoint;
import org.andnav.osm.util.constants.GeoConstants;
import org.andnav.osm.views.util.constants.MathConstants;

import android.location.Location;

public class MapPoint implements Cloneable{	

	protected static final String LAT_EDEFAULT = null;
	protected static final String LONG_EDEFAULT = null;
	
	private int lat;
	private int long_;

	public MapPoint(final int aLatitudeE6, final int aLongitudeE6) {
		this.lat = aLatitudeE6;
		this.long_ = aLongitudeE6;
	}

	public MapPoint(final double aLatitude, final double aLongitude) {
		this.lat = (int)(aLatitude * 1E6);
		this.long_ = (int)(aLongitude * 1E6);
	}

	public MapPoint(Location aLocation) {
		this(aLocation.getLatitude(), aLocation.getLongitude());
	}


	protected static MapPoint fromDoubleString(final String s, final char spacer) {
		final int spacerPos = s.indexOf(spacer);
		return new MapPoint((int) (Double.parseDouble(s.substring(0,
				spacerPos - 1)) * 1E6), (int) (Double.parseDouble(s.substring(
						spacerPos + 1, s.length())) * 1E6));
	}

	public static MapPoint fromIntString(final String s){
		final int commaPos = s.indexOf(',');
		return new MapPoint(Integer.parseInt(s.substring(0,commaPos-1)),
				Integer.parseInt(s.substring(commaPos+1,s.length())));
	} 

	public int getLongitudeE6() {
		return this.long_;
	}

	public int getLatitudeE6() {
		return this.lat;
	}

	public void setLongitudeE6(final int aLongitudeE6) {
		this.long_ = aLongitudeE6;
	}

	public void setLatitudeE6(final int aLatitudeE6) {
		this.lat = aLatitudeE6;
	}

	public void setCoordsE6(final int aLatitudeE6, final int aLongitudeE6) {
		this.lat = aLatitudeE6;
		this.long_ = aLongitudeE6;
	}

	public String toDoubleString() {
		return new StringBuilder().append(this.lat / 1E6).append(",").append(this.long_  / 1E6).toString();
	}

	public GeoPoint toGeoPoint()
	{
		return new GeoPoint(this.lat,this.long_);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (obj == this) return true;
		if (obj.getClass() != getClass()) return false;
		final MapPoint rhs = (MapPoint)obj;
		return rhs.lat == this.lat && rhs.long_ == this.long_;
	}

	public int distanceTo(final MapPoint other) {           

		final double a1 = MathConstants.DEG2RAD * (this.lat / 1E6);
		final double a2 = MathConstants.DEG2RAD * (this.long_ / 1E6);
		final double b1 = MathConstants.DEG2RAD * (other.lat / 1E6);
		final double b2 = MathConstants.DEG2RAD * (other.long_ / 1E6);

		final double cosa1 = Math.cos(a1);
		final double cosb1 = Math.cos(b1);

		final double t1 = cosa1*Math.cos(a2)*cosb1*Math.cos(b2);

		final double t2 = cosa1*Math.sin(a2)*cosb1*Math.sin(b2);

		final double t3 = Math.sin(a1)*Math.sin(b1);

		final double tt = Math.acos( t1 + t2 + t3 );

		return (int)(GeoConstants.RADIUS_EARTH_METERS*tt);
	}	

	@Override
	public String toString()
	{
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lat: ");
		result.append(lat);
		result.append(", long: ");
		result.append(long_);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
