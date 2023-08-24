package test;

import common.JDBCUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectUserTest {
    public static void main(String[] args) {
        try(Connection conn = JDBCUtil.getConnection()) {
            String sql ="select * from users";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                System.out.println(rs.getString("name"));
            }
            stmt.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}