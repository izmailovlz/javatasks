package week2.Task4;

public class FarenheitConvert implements BaseConvert {
    @Override
    public double convert(double celsius) {
        return (celsius * (9 / 5)) + 32;
    }
}
