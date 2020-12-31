/**
 * My custom interface for reader
 */
public interface MyInterfaceScanner {
    /**
     * Read and return String from console
     * @return String
     */
    String readString();

    /**
     * Read and return Integer from console
     * @return int
     */
    int readInt();

    /**
     * Read and return Double from console
     * @return double
     */
    double readDouble();

    /**
     * Close the input stream
     */
    void close();
}
