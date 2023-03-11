public class ElectricBlanket extends Blanket{
    private int numSettings;
    private boolean shutoff;

    public ElectricBlanket() {
        super();
        this.numSettings =1;
        this.shutoff=false;
    }

    public int getNumSettings() {
        return numSettings;
    }

    public void setNumSettings(int numSettings) {
        if(numSettings<1 || numSettings>5)
            this.numSettings=1;
        else
            this.numSettings = numSettings;
    }

    public boolean isShutoff() {
        return shutoff;
    }

    public void setShutoff(boolean shutoff) {
        this.shutoff = shutoff;

        if(this.shutoff==true)
        {
            this.price+=5.75;
        }
    }

    @Override
    public String toString() {
        return "ElectricBlanket{" +
                "numSettings=" + numSettings +
                ", shutoff=" + shutoff +
                super.toString();
    }
}
