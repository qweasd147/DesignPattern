package pattern.command.concrete;

import pattern.command.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {}
}
