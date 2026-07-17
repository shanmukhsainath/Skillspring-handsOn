public interface MediaPlayer {
    // Client expects every player to support this method.
    void play(String audioType, String fileName);
}
