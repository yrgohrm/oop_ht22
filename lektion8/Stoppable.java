public interface Stoppable {
    default void stop() {
        System.out.println("stop!");
    }
}
