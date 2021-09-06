package pl.perfectsource.kogito.bugs.drools;

public class Output {

    boolean automatic;

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public static Output with(boolean value) {
        Output output = new Output();
        output.setAutomatic(value);
        return output;
    }
    
}
