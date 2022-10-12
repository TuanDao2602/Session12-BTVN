package bai1;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.*;

public class ProductMaganament {
    static List<Product> listProduct =new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        do {

            System.out.println("------------Quản lý sản phẩm ------------");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2 update sản phẩm");
        System.out.println("3 xóa sản phẩm theo id");
        System.out.println("4. Hiển thị danh sách sản phẩm");
        System.out.println("5.Tìm kiếm sản phẩm theo tên");
        System.out.println("6.Sắp xếp sản phẩm tăng dần theo giá bán");
        System.out.println("7.Sắp xếp sản phẩm giảm dần theo giá bán");
        System.out.println("8 thoát");
        System.out.println("sự lựa chọn của bạn là");
        int choice = Integer.parseInt(sc.nextLine());

        switch (choice){
            case 1:
                System.out.println("nhập vào số sản phẩm muốn thêm");
                int soLuong = Integer.parseInt(sc.nextLine());
                for (int i = 0; i < soLuong; i++) {
                    Product product=new Product();
                    product.inputData(sc);
                    listProduct.add(product);
                }

                break;
            case 2:
                System.out.println("nhập vào mã sản phẩm cần update");
                int inputMaSp = Integer.parseInt(sc.nextLine());
                for (Product sp:listProduct) {
                    if (sp.getMaSp()==inputMaSp){
                        System.out.println("nhập lại tên sản phẩm");
                        String updateName = sc.nextLine();
                        if (updateName!=""&& updateName.length()!=0){
                            sp.setTenSp(updateName);
                        }
                        System.out.println("nhập vào giá bán sản phẩm");
                        float giaBanUpdate = Float.parseFloat(sc.nextLine());
                        sp.setGiaBan(giaBanUpdate);
                        System.out.println("nhập vào số lượng sản phẩm");
                        int soLuongUpdate = Integer.parseInt(sc.nextLine());
                        sp.setSoLuongSp(soLuongUpdate);
                        System.out.println("nhập vào trạng thái sản phẩm");
                        boolean trangThaiUpdate = Boolean.parseBoolean(sc.nextLine());
                        sp.setTrangThaiSp(trangThaiUpdate);

                    }
                }
                break;
            case 3:
                System.out.println("nhập vào id sản phẩm muốn xóa");
                int idDelete =Integer.parseInt(sc.nextLine());
                for (Product deleteSp: listProduct) {
                    if (deleteSp.getMaSp()==idDelete){
                        listProduct.remove(deleteSp);
                    }
                }
                break;
            case 4:
                for (Product display: listProduct) {
                    display.displayDaTa();
                }

                break;
            case 5:
                System.out.println("nhập vào tên sản phẩm cần tìm");
                String nameSeach =sc.nextLine();
                for (Product sanPham: listProduct) {
                    if (sanPham.getTenSp().equals(nameSeach)){
                        sanPham.displayDaTa();
                    }

                }
                break;
            case 6:
                System.out.println("sắp xếp giá tăng dần");
                Collections.sort(listProduct, new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        if (o1.getGiaBan() > o2.getGiaBan()){
                            return 1;
                        }else if (o1.getGiaBan()==o2.getGiaBan()){
                            return 0;
                        }else {
                            return -1;
                        }


                    }
                });
                break;
            case 7:
                System.out.println("sắp xếp giá giảm dân");
                Collections.sort(listProduct, new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        if (o1.getGiaBan() < o2.getGiaBan()){
                            return 1;
                        }else if (o1.getGiaBan()==o2.getGiaBan()){
                            return 0;
                        }else {
                            return -1;
                        }


                    }
                });


                break;
            case 8:
                System.exit(0);
                break;
            default:
                System.out.println("nhập vào số từ 1-6");
        }
        }while (true);
    }
}
