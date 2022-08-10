public class Server {
    public static void main(String[] args) throws InvalidCaseException, NotSetException {
        Match matchInstance = new Match();
        matchInstance.setSelection1("s");
        matchInstance.setSelection2("s");
        System.out.println(matchInstance.executeMatch());
    }
}
