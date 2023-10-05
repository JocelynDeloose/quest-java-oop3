

public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return this.altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;

    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }


    @Override
    public void takeOff() {
        System.out.println(this.getName() + " takes off in the sky.");
    }

    @Override
    public void ascend(int dataAltitude) {
        this.altitude += dataAltitude;

        System.out.println(this.getName() + "flies upward, altitude:" + this.altitude);
    }

    @Override
    public void descend(int dataAltitude) {
        this.altitude -= dataAltitude;
        if (this.altitude >= 11) {
            System.out.println(this.getName() + " can't land, he's so hight");
        } else {
            System.out.println(this.getName() + "flies downward, altitude:" + this.altitude);
        }
    }

    @Override
    public void glide() {
        System.out.println("glides into the air.");

    }

    @Override
    public void land() {
        System.out.println(this.getName() + " lands on the ground.");
    }
}
