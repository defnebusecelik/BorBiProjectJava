package com.company;

import java.sql.SQLException;
import java.util.Scanner;

public class Ucus {

    public void UcusTipi() throws SQLException {
        System.out.println("1)Yurtdisi ucuslari listele");
        System.out.println("2)Yurtici ucuslari listele");
        Scanner scanner = new Scanner(System.in);
        UcusTip ucusTip = new UcusTip();

        int tip = scanner.nextInt();
        if (tip == 1) {
            ucusTip.UcusAra(1);
        } else if (tip == 2) {

            ucusTip.UcusAra(2);
        } else
            System.out.println("Hatali secim");
    }
