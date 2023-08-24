package dao;

import domain.UserVO;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;


class UserDAOimplTest {
    UserDAO userDAO = UserDAOimpl.getInstance();
//    @Test
    void insertUser() {
        UserVO user = new UserVO("test", "1234", "테스트", "USER");
        userDAO.insertUser(user);

        user = userDAO.getUser("test");
        assertNotNull(user);
        assertEquals("test", user.getId());
    }

//    @Test
    void getUserList() {

        List<UserVO> list = userDAO.getUserList();
        assertEquals(3, list.size(), "목록의 개수가 일치하지 않음");
//        for(UserVO user : list){
//            System.out.println(user);
//        }
    }

//    @Test
    void getUser() {
        UserVO user = userDAO.getUser("admin");
        assertNotNull(user);
        assertEquals("admin", user.getId());
    }

  //  @Test
    void updateUser() {
        UserVO user = userDAO.getUser("admin");
        user.setName("최고관리자");

        userDAO.updateUser(user);
        user = userDAO.getUser("admin");

        assertNotNull(user);
        assertEquals("최고관리자", user.getName());
    }

  //  @Test
    void deleteUser() {
        userDAO.deleteUser("test");

        UserVO user = userDAO.getUser("test");
        assertNull(user);
    }
}