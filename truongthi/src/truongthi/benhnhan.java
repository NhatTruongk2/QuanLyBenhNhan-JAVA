/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package truongthi;

import java.io.Serializable;

/**
 *
 * @author TRUONG
 */
public class benhnhan implements Serializable{
     String MaBN;
     String TenBN;
     String DiaChi;
     int DienThoai;
     String GioiTinh;
     String BHYT;
    int NgaySinh,ThangSinh,NamSinh;

    public benhnhan() {
    }
    
    

    public benhnhan(String MaBN, String TenBN, String DiaChi, String GioiTinh, String BHYT, int DienThoai, int NgaySinh, int ThangSinh, int NamSinh) {
        this.MaBN = MaBN;
        this.TenBN = TenBN;
        this.DiaChi = DiaChi;
        this.DienThoai = DienThoai;
        this.GioiTinh = GioiTinh;
        this.BHYT = BHYT;
        this.NgaySinh = NgaySinh;
        this.ThangSinh = ThangSinh;
        this.NamSinh = NamSinh;
    }

    

    public String getMaBN() {
        return MaBN;
    }

    public void setMaBN(String MaBN) {
        this.MaBN = MaBN;
    }

    public String getTenBN() {
        return TenBN;
    }

    public void setTenBN(String TenBN) {
        this.TenBN = TenBN;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getDienThoai() {
        return DienThoai;
    }

    public void setDienThoai(int DienThoai) {
        this.DienThoai = DienThoai;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getBHYT() {
        return BHYT;
    }

    public void setBHYT(String BHYT) {
        this.BHYT = BHYT;
    }

    public int getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(int NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public int getThangSinh() {
        return ThangSinh;
    }

    public void setThangSinh(int ThangSinh) {
        this.ThangSinh = ThangSinh;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }
    
 public int TinhTuoi(){
     int age;
     age = 2023 - getNamSinh();
     return age;
 }
}
