package proxy;

public class Request {
    int numericalData;
    String textData;

    public Request(int numericalData, String textData) {
        this.numericalData = numericalData;
        this.textData = textData;
    }

    public int getNumericalData() {
        return numericalData;
    }

    public void setNumericalData(int numericalData) {
        this.numericalData = numericalData;
    }

    public String getTextData() {
        return textData;
    }

    public void setTextData(String textData) {
        this.textData = textData;
    }
}
