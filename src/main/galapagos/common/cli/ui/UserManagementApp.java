package main.galapagos.common.cli.ui;

import command.UserAddCommand;
import command.UserDetailCommand;
import command.UserListCommand;
import command.UserUpdateCommand;
import common.JDBCUtil;

public class UserManagementApp extends Application {
    @Override
    public void createMenu(Menu menu) {
        super.createMenu(menu);

        menu.add(new MenuItem("목록", new UserListCommand()));
        menu.add(new MenuItem("상세보기", new UserDetailCommand()));
        menu.add(new MenuItem("추가", new UserAddCommand()));
        menu.add(new MenuItem("수정", new UserUpdateCommand()));
        menu.add(new MenuItem("삭제", null));

    }

    @Override
    public void cleanup() {
        super.cleanup();

        JDBCUtil.close();
    }

    public static void main(String[] args) {

        Application app = new UserManagementApp();
        app.run();

    }
}
