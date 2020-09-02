package week2.Task4;

public class KelvinConvert implements BaseConvert {
    @Override
    public double convert(double celsius) {
        return 273.15 + celsius;
    }

}
