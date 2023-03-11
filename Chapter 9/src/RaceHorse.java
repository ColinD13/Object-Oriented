public class RaceHorse extends Horse{
    private String races;

    public RaceHorse(String name, String color, String year, String races) {
        super(name, color, year);
        this.races = races;
    }

    public String getRaces() {
        return races;
    }

    public void setRaces(String races) {
        this.races = races;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Races='" + races + '\'' +
                '}';
    }
}
