package command;

public class RemoteLoader {
    public static void main(String args[]){
        RemoteController remote = new RemoteController();
        remote.setCommand(new LightCommand(new Light()));
        remote.buttonPressed();
    }
}
