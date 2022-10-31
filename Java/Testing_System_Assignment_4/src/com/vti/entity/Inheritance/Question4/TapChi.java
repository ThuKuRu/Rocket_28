package com.vti.entity.Inheritance.Question4;

import java.util.Scanner;

public class TapChi {
    private int soPhatHanh;
    private byte thangPhatHanh;

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public byte getThangPhatHanh() {
        return thangPhatHanh;
    }

    @Override
    public void input() {
        super.input();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số phát hành: ");
        soPhatHanh = scanner.nextInt();

        System.out.println("Nhập tháng phát hành: ");
        thangPhatHanh = scanner.nextByte();
    }

    @Override
    public void getInfor() {
        super.getInfor();

        System.out.println("Số phát hành: " + soPhatHanh);
        System.out.println("Tháng phát hành: " + thangPhatHanh);
    }
}