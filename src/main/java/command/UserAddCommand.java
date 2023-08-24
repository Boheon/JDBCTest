package command;

import dao.UserDAO;
import dao.UserDAOimpl;
import domain.UserVO;
import main.galapagos.common.cli.Input;
import main.galapagos.common.cli.command.Command;

public class UserAddCommand implements Command {

    UserDAO dao = UserDAOimpl.getInstance();


    @Override
    public void execute() {
        System.out.println("사용자 추가");

        String userID = Input.read("사용자 Id : ");
        //id중복체크
        UserVO user = dao.getUser(userID);
        if(user != null){//이미 존재하는 id
            System.out.println("이미 존재하는 id입니다.");
            return;
        }

        String password = Input.read("비밀번호 : ");
        String name = Input.read("이름 : ");
        String role = Input.read("역할 : ");

        user = new UserVO(userID, password,name, role);
        dao.insertUser(user);
        System.out.println("================================");
    }
}
