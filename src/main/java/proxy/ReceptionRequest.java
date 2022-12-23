package proxy;

public class ReceptionRequest implements StorageRequest{
    @Override
    public void doRequest(Request request) {
        System.out.println("Do request with data: " + request.textData + ", " + request.numericalData);
    }
}
