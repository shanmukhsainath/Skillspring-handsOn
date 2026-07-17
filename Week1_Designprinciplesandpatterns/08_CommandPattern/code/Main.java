public class Main {
    public static void main(String[] args) {
        Light hallLight = new Light("Hall");
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(new LightOnCommand(hallLight));
        remoteControl.pressButton();

        remoteControl.setCommand(new LightOffCommand(hallLight));
        remoteControl.pressButton();
    }
}
