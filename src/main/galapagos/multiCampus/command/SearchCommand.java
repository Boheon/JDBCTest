package main.galapagos.multiCampus.command;


import main.galapagos.common.cli.command.Command;

public class SearchCommand implements Command {
    @Override
    public void execute() {
        System.out.println("검색을 시작합니다.");
    }
}
