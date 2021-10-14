package VehicleParkingLot;

import java.util.logging.Level;

public class ParkingSpot {
	
	Vehicle vehicle;
	VehicleSize spotSize;
	int row;
	int spotNumber;
	Level level;
	
	
	public ParkingSpot(Level lvl, int r, int n,VehicleSize s)
	{
		
	}
	
	  public boolean isAvailable()
	    {
	        return vehicle == null;
	    }
	  
	  public boolean FitinSpot(Vehicle vehicle) 
	  {
		return tru;
		  
	  }

}
