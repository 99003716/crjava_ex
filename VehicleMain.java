import java.util.*;
class Vehicle
{
    protected String Make;
    protected String VehicleNumber;
    protected String FuelType;
    protected int FuelCapacity;
    protected int cc;

    public Vehicle(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc)
    {
        this.Make = make;
        this.VehicleNumber = vehicleNumber;
        this.FuelType = fuelType;
        this.FuelCapacity = fuelCapacity;
        this.cc = cc;
    }
    void displayMake()
    {
        System.out.println("Make is:"+(this.Make));
    }
    void displayBasicinfo()
    {

        System.out.println("VehicleNumber:"+(this.VehicleNumber));
        System.out.println("FuelCapacity:"+(this.FuelCapacity));
        System.out.println("FuelType:"+(this.FuelType));
        System.out.println("CC:"+(this.cc));
    }
    void displayDetailInfo()
    {

    }

}
class FourWheeler extends Vehicle{

    private int NoOfDoors;
    private String AudioSystem;

    public FourWheeler(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc, String AudioSystem, int NoOfDoors) {
        super(make, vehicleNumber, fuelType, fuelCapacity, cc);
        this.NoOfDoors = NoOfDoors;
        this.AudioSystem = AudioSystem;
    }
}

class TwoWheeler extends Vehicle{
    private boolean KickStartAvailable;

    public TwoWheeler(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc, boolean KicStartAvailable) {
        super(make, vehicleNumber, fuelType, fuelCapacity, cc);
        this.KickStartAvailable = KicStartAvailable;
    }

    @Override
    public void displayDetailInfo()
    {
        if(this.KickStartAvailable)
        System.out.println("Kick Start Not available");

        else
            System.out.println("Kick Start Not available");
    }
}

public class VehicleMain {
        public static void main(String[] args)
        {
            Vehicle vh = new Vehicle("2 wheeler", "KA01 MA 0212", "Diesel", 2000, 300);
            TwoWheeler tw = new TwoWheeler("2 wheeler", "KA01 MA 0212", "Petrol", 60, 200, false);
            FourWheeler fw = new FourWheeler("4 wheeler", "KA 01 MM 2133", "Diesel", 200, 4000, "Stereo", 4);
            fw.displayBasicinfo();
            tw.displayDetailInfo();
        }
}
