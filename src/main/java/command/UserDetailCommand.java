package command;

import dao.UserDAO;
import dao.UserDAOimpl;
import domain.UserVO;
import main.galapagos.common.cli.Input;
import main.galapagos.common.cli.command.Command;

public class UserDetailCommand implements Command {
    UserDAO dao = UserDAOimpl.getInstance();
    @Override
    public void execute() {
        System.out.println("User 상세보기");

        String userID = Input.read("사용자 ID: ");
        UserVO user = dao.getUser(userID);
        if(user == null){
            System.out.println("존재하지 않는 ID");
            return;
        }
        System.out.println("이름 : "+user.getName());
        System.out.println("비밀번호 : "+user.getPassword());
        System.out.println("역할 : "+user.getRole());
        System.out.println("======================");





    }
}
