package com.intheeast.exceptions.trywithresources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ViewTableExample {

    // 주어진 메서드
    public static void viewTable(Connection con) throws SQLException {
        String query = "SELECT COF_NAME, SUP_ID, PRICE, SALES, TOTAL FROM COFFEES";

        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String coffeeName = rs.getString("COF_NAME");
                int supplierID = rs.getInt("SUP_ID");
                float price = rs.getFloat("PRICE");
                int sales = rs.getInt("SALES");
                int total = rs.getInt("TOTAL");

                System.out.println(coffeeName + ", " + supplierID + ", " +
                                   price + ", " + sales + ", " + total);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    // SQLException 출력 유틸리티
    public static void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.err.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

    public static void main(String[] args) {
        // MySQL DB 접속 정보
        String jdbcURL = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "1234";

        // MySQL 연결
        try (Connection con = DriverManager.getConnection(jdbcURL, username, password)) {
            System.out.println("데이터베이스 연결 성공!");

            // COFFEES 테이블 조회
            viewTable(con);

        } catch (SQLException e) {
            printSQLException(e);
        }
    }
}
