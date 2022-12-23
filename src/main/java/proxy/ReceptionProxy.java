package proxy;

public class ReceptionProxy implements StorageRequest{
    ReceptionRequest receptionRequest;

    {
        receptionRequest = new ReceptionRequest();
    }

    @Override
    public void doRequest(Request request) {
        startRequest();
        receptionRequest.doRequest(request);
        endRequest();
    }

    private void startRequest() {
        System.out.println("Request start");
    }

    private void endRequest() {
        System.out.println("Request end");
    }
}
