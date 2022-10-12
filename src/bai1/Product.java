package bai1;

import java.util.Scanner;

public class Product {
    private int maSp;
    private String tenSp;
    private float giaNhap;
    private float giaBan;
    private int soLuongSp;
    private boolean trangThaiSp;

    public Product() {
    }

    public Product(int maSp, String tenSp, float giaNhap, float giaBan, int soLuongSp, boolean trangThaiSp) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.soLuongSp = soLuongSp;
        this.trangThaiSp = trangThaiSp;
    }

    public int getMaSp() {
        return maSp;
    }

    public void setMaSp(int maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public float getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuongSp() {
        return soLuongSp;
    }

    public void setSoLuongSp(int soLuongSp) {
        this.soLuongSp = soLuongSp;
    }

    public boolean isTrangThaiSp() {
        return trangThaiSp;
    }

    public void setTrangThaiSp(boolean trangThaiSp) {
        this.trangThaiSp = trangThaiSp;
    }

    public void inputData(Scanner sc){

        System.out.println("nhập vào mã sản phẩm");
        this.maSp= Integer.parseInt(sc.nextLine());
        System.out.println("nhập vào tên sản phẩm");
        this.tenSp=sc.nextLine();
        System.out.println("nhập vào giá bán sản phẩm");
        this.giaBan=Float.parseFloat(sc.nextLine());
        System.out.println("nhập vào số lượng sản phẩm");
        this.soLuongSp=Integer.parseInt(sc.nextLine());
        System.out.println("nhập vào trạng thái sản phẩm");
        this.trangThaiSp=Boolean.parseBoolean(sc.nextLine());

    }
    public void displayDaTa(){
        System.out.printf("Mã Sp: %d - Tên sp: %s - Gía Bán Sp %f - Số lương SP:%d - Trạng thái Sp:%b \n",this.maSp,this.tenSp,this.giaBan,this.soLuongSp,this.trangThaiSp);


    }
}
