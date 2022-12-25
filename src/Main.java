package com.company;

import com.sun.source.tree.UsesTree;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.Scanner;

public class Main  {


    public static void main(String[] args) throws SQLException {

        Menu d=new Menu();
        Scanner scan = new Scanner(System.in);
        System.out.println("BORBI Havayoluna Hosgeldiniz");
        System.out.println("-----------------------------");
        System.out.println("1)Rezervasyon Yapma");
        System.out.println("2)Ucuslari Gosterme");
        System.out.println("3)Rezervasyon Iptali");
        System.out.println("4)Bilet Bilgileri");
        System.out.println("Yapmak istediginiz islemi seciniz:");
        int islem = scan.nextInt();
        if (islem == 1) {
            Rezervasyon rezervasyon = new Rezervasyon();
            rezervasyon.UcusSecme();

        } else if (islem == 2) {
            Ucus ucus = new Ucus();
            ucus.UcusTipi();
        } else if (islem == 3) {
            Iptal iptal = new Iptal();
            iptal.Silme();

        } else if (islem == 4) {

            System.out.println("TC numaranizi giriniz:");
            String TC = scan.next();
            Connection connection = null;
            DbHelper dbHelper = new DbHelper();
            Statement statement = null;
            ResultSet resultSet;
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM ucus.kullanici where kullaniciTc='" + TC + "'");
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

            }else{
                System.out.println("BOYLE BIR KULLANICI BULUNAMAMISTIR");
                System.out.println("Devam etmek istiyor musunuz -- evetse 1 ye basin");
                int devam= Integer.parseInt(scan.next());
                switch (devam) {
                    case 1:
                        int yon=0;
                        d.sec(yon);
                        break;
                    default:
                        System.out.println("sistem kapaniyor");
                }
            }
        }  else
            System.out.println("Hatali secim!!!");
    }

}
