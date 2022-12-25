package com.company;

import java.sql.*;
import java.util.Random;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Rezervasyon extends Menu implements DbHelperInterface{
    int secim;
    public Rezervasyon() throws SQLException {
        super();
    }
    Scanner scan = new Scanner(System.in);
    PreparedStatement statement1 = null;
    Connection connection = null;
    DbHelper dbHelper = new DbHelper();
    Statement statement = null;
    boolean ucus = true;

    ResultSet resultSet;
    int rezervasyonNo;
    String Ad;
    String SoyAd;
    private String tcNo;
    private int yas;
    String saat;

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas < 0) {
            System.out.println("yasiniz negatif olamaz");
            yas = 0;
            ucus = false;
        }
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) throws SQLException {
        if (tcNo.length() == 11) {
            this.tcNo = tcNo;
        } else {
            System.out.println("Tcniz 11 haneli olmak zorunda");
            ucus = false;
            sec(secim);
        }
    }

    public void UcusSecme() throws SQLException {

        System.out.println("Kalkis yonunuzu giriniz");
        String kalkis = scan.next();
        System.out.println("Varis yonunuzu giriniz");
        String varis = scan.next();
        connection = dbHelper.getConnection();
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM ucus.ucak where kalkis_yon='" + kalkis + "' and varis_yon='" + varis + "'");

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
        } else {
            System.out.println("BU YONLERDE UCUSUMUZ BULUNMAMAKTADIR ");
            ucus = false;
            sec(secim);


        }
        if (ucus == true) {
            System.out.println("Bir saat dilimi seciniz:");
            saat = scan.next();

            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM ucus.ucak where saat='" + saat + "';");
            if (resultSet.next()) {
                while (resultSet.next()) {
                    System.out.println(resultSet.getString("saat"));
                }
            } else {
                System.out.println("YANLIS SAAT GIRDINIZ,ana menuye yonlendiriyorsunuz");
                ucus = false;
                sec(secim);
            }
        }
        connection.close();
        if (ucus == true) {
            Random r = new Random();

            int a = r.nextInt(100);
            int b = r.nextInt(100);
            int c = r.nextInt(100);

            rezervasyonNo = a * b * c * 43;
            System.out.println("Adiniz:");
            Ad = scan.next();
            System.out.println("Soyadiniz:");
            SoyAd = scan.next();
            String kullaniciAdi = Ad + "" + SoyAd;
            System.out.println("TC kimlik no'nuz:");
            tcNo = scan.next();
            setTcNo(tcNo);
            if (ucus == true) {
                System.out.println("Yasiniz:");
                yas = scan.nextInt();
                setYas(yas);
            }

                if (ucus == true) {
                    System.out.println("veri tabani baglantisi olustu, ve veriler sisteme girildi");
                    connection = dbHelper.getConnection();

                    String sql = "insert into ucus.kullanici (kullaniciAdi , kullaniciYasi ,kullaniciTc,rezervasyonNo,kalkisYonu,varisYonu,saat) values (?,?,?,?,?,?,?);";
                    statement1 = connection.prepareStatement(sql);
                    statement1.setString(1,kullaniciAdi );
                    statement1.setInt(2, yas);
                    statement1.setString(3, tcNo);
                    statement1.setInt(4, rezervasyonNo);
                    statement1.setString(5, kalkis);
                    statement1.setString(6, varis);
                    statement1.setString(7, saat);
                    int result = statement1.executeUpdate();
                    }


            }connection.close();




        if (ucus == true) {
            System.out.println("Odeme kismina gecmek icin 1 e basin");
            int secenek = scan.nextInt();
            if (secenek == 1) {
                Odeme odeme = new Odeme();
                odeme.Odemecik(kalkis, varis, saat, yas);
                connection = dbHelper.getConnection();
                statement = connection.createStatement();
                resultSet = statement.executeQuery("SELECT * FROM ucus.kullanici where kullaniciTc='" + tcNo + "'");
                if (resultSet.next()) {
                    while (resultSet.next()) {
                        System.out.print("rezervasyon numaraniz: ");
                        System.out.print(resultSet.getString("rezervasyonNo"));
                    }
                } else System.out.println("TC nizi yanlis girdiniz");
                ucus = false;
                sec(secim);
            } else
                System.out.println("isleminiz sona erdi");
        }
    }
}
