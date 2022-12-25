package com.company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.Scanner;

public class Odeme extends Menu implements DbHelperInterface{
    Connection connection = null;
    DbHelper dbHelper = new DbHelper();
    Statement statement = null;
    ResultSet resultSet;
    boolean ucus = true;

    double ucrettutucu = 0;
    int yastutucu = 0;
    int secim=0;
    public Odeme() throws SQLException {
        super();
    }

    public void Odemecik(String kalkis, String varis, String saat, int yas) throws SQLException {

        connection = dbHelper.getConnection();
        statement = connection.createStatement();

        resultSet = statement.executeQuery("SELECT * FROM ucus.ucak where kalkis_yon='" + kalkis + "' and varis_yon='" + varis + "' and saat='" + saat + "'");
        if (resultSet.next()) {
            while (resultSet.next()) {
                ucrettutucu = resultSet.getDouble("ucret");
            }
        } else {
            System.out.println("YANLIS KALKIS YONU GIRDINIZ");
            ucus = false;
        }
        if (ucus==true) {
            BaseHesapla baseHesapla = new BaseHesapla();

            resultSet = statement.executeQuery("SELECT * FROM ucus.kullanici where kalkisYonu='" + kalkis + "' and varisYonu='" + varis + "' and saat='" + saat + "'");
            if (resultSet.next()) {
                while (resultSet.next()) {
                    yastutucu = resultSet.getInt("kullaniciYasi");
                }
                baseHesapla.Indirim(ucrettutucu, yastutucu);
            } else {
                System.out.println("YANLIS KALKIS YONU GİRDİNİZ");
                sec(secim);
            }
        }
    }

    public void Iade(String ucusNo) throws SQLException {
        Menu m=new Menu();
        System.out.println("Yaptiginiz odemenin yalnizca %50'si iade edilir. Devam etmek istiyor musunuz? e/h");
        Scanner scanner = new Scanner(System.in);
        String cevap = scanner.next();
        switch (cevap.toLowerCase(Locale.ROOT)) {
            case "e":
                connection = dbHelper.getConnection();
                statement = connection.createStatement();

                resultSet = statement.executeQuery("SELECT * FROM ucus.ucak where ucus_no='" + ucusNo + "'");
                if (resultSet.next()) {
                    while (resultSet.next()) {
                        ucrettutucu = resultSet.getDouble("ucret");
                    }
                    BaseHesapla baseHesapla = new BaseHesapla();
                    baseHesapla.Iade(ucrettutucu);
                } else {System.out.println("Yanlis ucus numarasi girdiniz,ana menuye tekrar yonlendiriliyorsunuz");
                    sec(secim);
                }
                break;


            case "h":
                System.out.println("ISLEMINIZ SONLANDIRILDI");
                break;
        }
    }
}
