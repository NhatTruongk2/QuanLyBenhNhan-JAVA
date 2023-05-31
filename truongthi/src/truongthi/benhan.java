/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package truongthi;

import java.util.List;

/**
 *
 * @author TRUONG
 */
public class benhan {
    String MaBA,TenBA,Khoa,Phong;
    int NgayVao,Thangvao,NamVao,NgayRa,ThangRa,NamRa,VienPhi;

    public benhan() {
    }

    public benhan(String MaBA, String TenBA, String Khoa, String Phong, int NgayVao, int Thangvao, int NamVao, int NgayRa, int ThangRa, int NamRa, int VienPhi) {
        this.MaBA = MaBA;
        this.TenBA = TenBA;
        this.Khoa = Khoa;
        this.Phong = Phong;
        this.NgayVao = NgayVao;
        this.Thangvao = Thangvao;
        this.NamVao = NamVao;
        this.NgayRa = NgayRa;
        this.ThangRa = ThangRa;
        this.NamRa = NamRa;
        this.VienPhi = VienPhi;
    }

    public String getMaBA() {
        return MaBA;
    }

   

   

    public void setMaBA(String MaBA) {
        this.MaBA = MaBA;
    }

    public String getTenBA() {
        return TenBA;
    }

    public void setTenBA(String TenBA) {
        this.TenBA = TenBA;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    public String getPhong() {
        return Phong;
    }

    public void setPhong(String Phong) {
        this.Phong = Phong;
    }

    public int getNgayVao() {
        return NgayVao;
    }

    public void setNgayVao(int NgayVao) {
        this.NgayVao = NgayVao;
    }

    public int getThangvao() {
        return Thangvao;
    }

    public void setThangvao(int Thangvao) {
        this.Thangvao = Thangvao;
    }

    public int getNamVao() {
        return NamVao;
    }

    public void setNamVao(int NamVao) {
        this.NamVao = NamVao;
    }

    public int getNgayRa() {
        return NgayRa;
    }

    public void setNgayRa(int NgayRa) {
        this.NgayRa = NgayRa;
    }

    public int getThangRa() {
        return ThangRa;
    }

    public void setThangRa(int ThangRa) {
        this.ThangRa = ThangRa;
    }

    public int getNamRa() {
        return NamRa;
    }

    public void setNamRa(int NamRa) {
        this.NamRa = NamRa;
    }

    public int getVienPhi() {
        return VienPhi;
    }

    public void setVienPhi(int VienPhi) {
        this.VienPhi = VienPhi;
    }
  
       public static benhan timBenhNhanMaxVienPhi(List<benhan> danhSachBenhNhan) {
        if (danhSachBenhNhan.isEmpty()) {
            return null;
        }
        
        benhan benhNhanMaxVienPhi = danhSachBenhNhan.get(0);
        
        for (benhan benhNhan : danhSachBenhNhan) {
            if (benhNhan.getVienPhi() > benhNhanMaxVienPhi.getVienPhi()) {
                benhNhanMaxVienPhi = benhNhan;
            }
        }
        
        return benhNhanMaxVienPhi;
    }
       
 
}
