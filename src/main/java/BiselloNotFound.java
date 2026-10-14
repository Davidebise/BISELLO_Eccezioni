public class BiselloNotFound extends Exception {
    private int statusCode;
    public BiselloNotFound(String message) {
        super(message);
    }

    public BiselloNotFound(String message,int statusCode) {
        super(message);
        this.statusCode=statusCode;
    }

    public int getStatusCode() {
            return statusCode;
    }
}
