package command;

import dao.UserDAO;
import dao.UserDAOimpl;
import domain.UserVO;
import main.galapagos.common.cli.Input;
import main.galapagos.common.cli.command.Command;

public class UserUpdateCommand implements Command {
    UserDAO dao = UserDAOimpl.getInstance();
    @Override
    public void execute() {
        System.out.println("사용자 정보 수정");

        //1.수정할 userid입력
        //2. 기존 데이터 얻기
        //3. 기존 데이터 보여주면서 업데이트할 내용 입력
        //4. 업데이트
        String userId = Input.read("사용자 ID : ");
        UserVO user = dao.getUser(userId);
        if(user == null){
            System.out.println("존재하지 않는 ID입니다.");
            return;
        }

        String name = Input.read("이름", user.getName());
        String role = Input.read("역할", user.getRole());

        user.setName(name);
        user.setRole(role);

        dao.updateUser(user);
    }
}
