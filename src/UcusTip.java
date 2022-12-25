package com.company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UcusTip implements DbHelperInterface{
    public void UcusAra(int tip) throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;


        if (tip == 1) {

            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM ucus.ucak where ucus_tip='yurtdışı'");
            if (resultSet.next()) {
                while (resultSet.next()) {
                    System.out.print(resultSet.getInt("ucus_no"));
                    System.out.print("  ");
                    System.out.print(resultSet.getString("kalkis_yon"));
                    System.out.print("  ");
                    System.out.print(resultSet.getString("varis_yon"));
                    System.out.print("  ");
                    System.out.print(resultSet.getString("saat"));
                    System.out.print("  ");
                    System.out.println(resultSet.getDouble("ucret"));
                }
            }
            System.out.println("Islemimiz sona erdi,iyi gunler");
        }


        if (tip == 2) {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM ucus.ucak where ucus_tip='yurtiçi'");
            if (resultSet.next()) {
                while (resultSet.next()) {
                    System.out.print(resultSet.getInt("ucus_no"));
                    System.out.print("  ");
                    System.out.print(resultSet.getString("kalkis_yon"));
                    System.out.print("  ");
                    System.out.print(resultSet.getString("varis_yon"));
                    System.out.print("  ");
                    System.out.print(resultSet.getString("saat"));
                    System.out.print("  ");
                    System.out.println(resultSet.getDouble("ucret"));
                }

            }
            System.out.println("Islemimiz sona erdi,iyi gunler");
        }

    }
}
