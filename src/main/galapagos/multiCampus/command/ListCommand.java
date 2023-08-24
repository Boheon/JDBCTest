package main.galapagos.multiCampus.command;


import main.galapagos.common.cli.command.Command;

public class ListCommand implements Command {
    @Override
    public void execute() {
        //실제 리스트 구하고 출력
        System.out.println("목록을 출력합니다.");

    }
}
