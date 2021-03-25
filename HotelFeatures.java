class HotelRoom
{
    protected String HotelName;
    protected int Sqfeet;
    protected boolean hasTv;
    protected boolean hasWifi;

    public HotelRoom(String HotelName, int Sqfeet, boolean hasTv, boolean hasWifi)
    {
        this.HotelName = HotelName;
        this.Sqfeet = Sqfeet;
        this.hasTv = hasTv;
        this.hasWifi = hasWifi;
    }

    public int getRateperSqfeet()
    {
        return 0;
    }
    public int calculateTariff()
    {
        return this.Sqfeet * this.getRateperSqfeet();
    }
}


class DeluxeRoom extends HotelRoom
{
    private final int ratePerSqfeet;
    public DeluxeRoom(String HotelName, int Sqfeet, boolean hasTv, boolean hasWifi, int ratePerSqfeet) {
        super(HotelName, Sqfeet, hasTv, hasWifi);
        this.ratePerSqfeet = 10;
    }


    public int getRatePerSqfeet()
    {
        if(this.hasWifi)
            return (ratePerSqfeet + 2);
        else
            return ratePerSqfeet;
    }
}


class DeluxeACRoom extends HotelRoom {

    private final int ratePerSqfeet;
    public DeluxeACRoom(String HotelName, int Sqfeet, boolean hasTv, boolean hasWifi, int ratePerSqfeet) {
        super(HotelName, Sqfeet, hasTv, hasWifi);
        this.ratePerSqfeet = 12;
    }


    public int getRatePerSqfeet()
    {
        if(this.hasWifi)
            return (ratePerSqfeet + 2);
        else
            return ratePerSqfeet;
    }
}


class SuiteACRoom extends HotelRoom {

    private final int ratePerSqfeet;
    public SuiteACRoom(String HotelName, int Sqfeet, boolean hasTv, boolean hasWifi, int ratePerSqfeet) {
        super(HotelName, Sqfeet, hasTv, hasWifi);
        this.ratePerSqfeet = 15;
    }


    public int getRatePerSqfeet()
    {
        if(this.hasWifi)
            return (ratePerSqfeet + 2);
        else
            return ratePerSqfeet;
    }
}



public class HotelFeatures {
    public static void main(String[] args)
    {
        DeluxeACRoom Surabhi = new DeluxeACRoom("Surabhi", 2500, true, false, 2);
        System.out.println(Surabhi.calculateTariff());
    }
}
