public class Light {
    private String roomName;

    public Light(String roomName) {
        this.roomName = roomName;
    }

    public void turnOn() {
        System.out.println(roomName + " light is ON");
    }

    public void turnOff() {
        System.out.println(roomName + " light is OFF");
    }
}
