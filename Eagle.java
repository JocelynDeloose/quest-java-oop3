

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

        System.out.println(this.getName() + "flies downward, altitude:" + this.altitude);

    }

    @Override
    public void glide() {
        System.out.println("glides into the air.");

    }

    @Override
    public void land() {
        if (this.flying && this.altitude <= 1) {
            System.out.printf("%s lands on the ground.%n", this.getName());
        } else {
            System.out.printf("%s is too high, it can't land.%n", this.getName());
        }
    }
}
