package com.company;

import com.company.DbHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


import static java.sql.DriverManager.getConnection;

public class Iptal extends Menu implements  DbHelperInterface {
    Connection connection = null;
    DbHelper dbHelper = new DbHelper();
    PreparedStatement statement = null;
    ResultSet resultSet;
    String rezNo;
    String sql;
    String ucusNo;
    boolean ucus = true;
    int secim;

    public Iptal() {
        super();
    }

    public void Silme() throws SQLException {
        System.out.println("Rezervasyon numaranizi girin:");
        Scanner scan = new Scanner(System.in);
        rezNo = scan.next();
        if (resultSet != null) {
            connection = dbHelper.getConnection();
            sql = "SET SQL_SAFE_UPDATES = 0; delete from ucus.kullanici where rezervasyonNo='" + rezNo + "';";
            statement = connection.prepareStatement(sql);
            System.out.println("silindi");
        } else {
            System.out.println(" ");
        }

        if (ucus) {
            System.out.println("ucus numaranizi giriniz");
            ucusNo = scan.next();
            Odeme odeme = new Odeme();
            odeme.Iade(ucusNo);
        }
    }
}

