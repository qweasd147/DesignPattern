package pattern.command.invoker;

import pattern.command.Command;
import pattern.command.concrete.NoCommand;

public class RemoteControl {

    public static final int REMOTE_CONTROL_SLOT_SIZE = 7;

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for (int i= 0;i<REMOTE_CONTROL_SLOT_SIZE;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        if(!isAvailableSlot(slot)){
            System.out.println("remote control 사이즈를 벗어남");

            return;
        }

        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        if(!isAvailableSlot(slot)){
            System.out.println("remote control 사이즈를 벗어남");
            return;
        }

        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot){
        if(!isAvailableSlot(slot)){
            System.out.println("remote control 사이즈를 벗어남");
            return;
        }

        offCommands[slot].execute();
    }

    private boolean isAvailableSlot(int slot){
        if(slot < 0 || REMOTE_CONTROL_SLOT_SIZE < slot){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("\n----------Remote Control---------\n");
        for(int i=0;i<REMOTE_CONTROL_SLOT_SIZE;i++){
            sb.append("[slot "+i+"] "+onCommands[i].getClass().getName()
                    +"      " + offCommands[i].getClass().getName()+"\n");
        }

        return sb.toString();
    }
}
