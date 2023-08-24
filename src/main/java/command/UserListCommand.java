package command;

import dao.UserDAOimpl;
import dao.UserDAO;
import domain.UserVO;
import main.galapagos.common.cli.command.Command;

import java.util.List;

public class UserListCommand implements Command {
    UserDAO dao = UserDAOimpl.getInstance();
    @Override
    public void execute() {
        System.out.println("User 목록 보기");
        List<UserVO> list = dao.getUserList();

        System.out.println("========================");
        for(int i = 0; i < list.size(); i++){
            UserVO user = list.get(i);
            System.out.printf("%d] %s\n", i+1, user.getId());
        }
        System.out.println("========================");
        System.out.printf("총 %d건 \n", list.size());
    }
}
