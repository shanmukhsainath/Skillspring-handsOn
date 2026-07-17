public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        // Remote does not know the actual device logic.
        this.command = command;
    }

    public void pressButton() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No command is assigned");
        }
    }
}
