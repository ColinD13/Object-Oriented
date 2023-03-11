public class Rock {

    private int samples;
    private String dec;
    private double weight;

    public Rock(int samples, double weight) {
        this.samples = samples;
        this.weight = weight;
        this.dec = "Unclassified";
    }

    public Rock() {
        this.samples = 0;
        this.weight = 0.0;
        this.dec = "";
    }

    public int getSamples() {
        return samples;
    }

    public String getDec() {
        return dec;
    }

    public double getWeight() {
        return weight;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    @Override
    public String toString() {
        return "Rock{" +
                "samples=" + samples +
                ", dec='" + dec + '\'' +
                ", weight=" + weight +
                '}';
    }
}
