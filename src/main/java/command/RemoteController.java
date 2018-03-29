package command;

public class RemoteController {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonPressed(){
        command.excute();
    }
}
