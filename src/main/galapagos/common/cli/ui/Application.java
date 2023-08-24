package main.galapagos.common.cli.ui;

import main.galapagos.common.cli.command.ExitCommand;

public class Application {
    private Menu menu;

    public void createMenu(Menu menu) {
    }

    public void init() {
        menu = new Menu();
        createMenu(menu);
        menu.add(new MenuItem("종료", new ExitCommand(this)));
    }

    public void cleanup(){

    }

    public void run() {
        init();
        while (true) {
            menu.print();
            MenuItem item = menu.select();
            if (item != null) {
                item.execute();
                System.out.println();
            }
        }
    }
}
