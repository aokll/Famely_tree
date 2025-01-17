package MVP.View.Command;

import MVP.View.Console.ConsoleFT;

import java.text.ParseException;

public class RemoveHuman extends CommandClass{
    public RemoveHuman(ConsoleFT console) {
        super("Удалить человека из базы данных", console);
    }

    @Override
    public void execute() throws ParseException {
        super.getConsole().removeHuman();
    }
}
