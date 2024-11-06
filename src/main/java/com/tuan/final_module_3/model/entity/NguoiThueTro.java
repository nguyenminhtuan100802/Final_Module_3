package com.tuan.final_module_3.model.entity;

import java.util.Date;

public class NguoiThueTro {
    private int maPhongTro;
    private String ten;
    private String sdt;
    private Date ngayBatDau;
    private String hinhThucThanhToan;
    private String ghiChu;
    private int hinhThucTT;

    public NguoiThueTro(int maPhongTro, String ten, String sdt, Date ngayBatDau, String hinhThucThanhToan, String ghiChu) {
        this.maPhongTro = maPhongTro;
        this.ten = ten;
        this.sdt = sdt;
        this.ngayBatDau = ngayBatDau;
        this.hinhThucThanhToan = hinhThucThanhToan;
        this.ghiChu = ghiChu;
    }

    public int getHinhThucTT() {
        return hinhThucTT;
    }

    public void setHinhThucTT(int hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

    public int getMaPhongTro() {
        return maPhongTro;
    }

    public void setMaPhongTro(int maPhongTro) {
        this.maPhongTro = maPhongTro;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getHinhThucThanhToan() {
        return hinhThucThanhToan;
    }

    public void setHinhThucThanhToan(String hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
