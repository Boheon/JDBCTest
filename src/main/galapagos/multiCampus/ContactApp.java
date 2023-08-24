package main.galapagos.multiCampus;


import main.galapagos.common.cli.ui.Application;
import main.galapagos.common.cli.ui.Menu;
import main.galapagos.common.cli.ui.MenuItem;
import main.galapagos.multiCampus.command.ListCommand;
import main.galapagos.multiCampus.command.SearchCommand;

public class ContactApp extends Application {
    @Override
    public void createMenu(Menu menu) {
        super.createMenu(menu);

        menu.add(new MenuItem("목록", new ListCommand()));
        menu.add(new MenuItem("검색", new SearchCommand()));
        menu.add(new MenuItem("추가", null));
    }

    public static void main(String[] args) {
        ContactApp app = new ContactApp();
        app.run();
    }
}
