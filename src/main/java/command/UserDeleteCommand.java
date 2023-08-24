package command;

import dao.UserDAO;
import dao.UserDAOimpl;
import domain.UserVO;
import main.galapagos.common.cli.Input;
import main.galapagos.common.cli.command.Command;

public class UserDeleteCommand implements Command {
    UserDAO dao = UserDAOimpl.getInstance();
    @Override
    public void execute() {
        System.out.println("사용자 삭제");

        String userId = Input.read("사용자 ID : ");
        UserVO user = dao.getUser(userId);
        if(user == null){
            System.out.println("존재하지 않는 ID입니다.");
            return;
        }
        //정말 삭제할까요(Y/N)
        boolean answer = Input.confirm("정말 삭제할까요?");
        if(answer){
            dao.deleteUser(user.getId());
            System.out.println(userId + "를 삭제했습니다.");
        }

        dao.deleteUser(user.getId());
    }
}
