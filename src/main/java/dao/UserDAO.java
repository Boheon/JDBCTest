package dao;

import domain.UserVO;

import java.util.List;

public interface UserDAO {
    // 회원 등록
    void insertUser(UserVO user);

    List<UserVO> getUserList();

    UserVO getUser(String id);

    void updateUser(UserVO user);

    // USERS 테이블 관련 CRUD 메소드
    // 회원 삭제
    void deleteUser(String id);
}
