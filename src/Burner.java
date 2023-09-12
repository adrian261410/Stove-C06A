/**
 * Burner class.
 * Represents a single burner on the stove.
 */
public class Burner {
    public static final int OFF = 0;
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;

    private int temperature;
    private Indicator indicator;

    public Burner() {
        temperature = OFF;
        indicator = new Indicator();
    }

    public int getTemperature() {
        return temperature;
    }

    public String getIndicator() {
        return indicator.toString();
    }

    public void plusButton() {
        if (temperature == OFF) {
            temperature = LOW;
        } else if (temperature < HIGH) {
            temperature++;
        }
        indicator.updateIndicator(temperature);
    }

    public void minusButton() {
        if (temperature > OFF) {
            temperature--;
        }
        indicator.updateIndicator(temperature);
    }

    public void updateTemperature() {
        // Simulate temperature changes over time here if needed.
    }
}
