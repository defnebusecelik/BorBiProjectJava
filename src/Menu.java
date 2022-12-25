package com.company;

import java.util.Scanner;
import java.sql.SQLException;
import java.sql.*;
import java.util.Random;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Menu {

    public Menu(int secim) throws SQLException {
        sec(secim);
    }

    public Menu() {
    }

    public void sec(int secim) throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("  " +
                "TEKRARDAN BORBI Havayoluna Hosgeldiniz");
        System.out.println("-----------------------------");
        System.out.println("1)Rezervasyon Yapma");
        System.out.println("2)Ucuslari Gosterme");
        System.out.println("3)Rezervasyon Iptali");
        System.out.println("4)Bilet Bilgileri");
        System.out.println("Yapmak istediginiz islemi seciniz:");
        int islem = scan.nextInt();
        if (islem == 1) {
            Rezervasyon rezervasyon = new Rezervasyon();
            try {
                rezervasyon.UcusSecme();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        } else if (islem == 2) {
            Ucus ucus = new Ucus();
            try {
                ucus.UcusTipi();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else if (islem == 3) {
            Iptal iptal = new Iptal();
            try {
                iptal.Silme();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        } else if (islem == 4) {

            System.out.println("TC numaranizi giriniz:");
            String TC = scan.next();
            Connection connection = null;
            DbHelper dbHelper = new DbHelper();
            Statement statement = null;
            ResultSet resultSet;
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM ucus.kullanici where kullaniciTc='" + TC + "';");
            if (resultSet.next()) {
                System.out.print(resultSet.getString("kullaniciAdi"));
                System.out.print("  ");
                System.out.print(resultSet.getInt("kullaniciYasi"));
                System.out.print("  ");
                System.out.print(resultSet.getString("kullaniciTc"));
                System.out.print("  ");
                System.out.print(resultSet.getInt("rezervasyonNo"));
                System.out.print("  ");
                System.out.print(resultSet.getString("kalkisYonu"));
                System.out.print("  ");
                System.out.print(resultSet.getString("varisYonu"));
                System.out.print("  ");
                System.out.println(resultSet.getString("saat"));
            }

        } else
            System.out.println("Hatali secim!!!");
    }
}
