///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package entityBean;
//
//import java.io.Serializable;
//import java.math.BigDecimal;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
///**
// *
// * @author ADMIN
// */
//@Entity
//@Table(name = "XE")
//public class XeEntity implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Id
//    @Column(name = "MAXE")
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    @Column(name = "TENXE")
//    private String tenXe;
//    @Column(name = "SOGHE")
//    private Integer soGhe;
//    @Column(name = "NHIENLIEU")
//    private String nhienLieu;
//    @Column(name = "TRUYENDONG")
//    private String truyenDong;
//    @Column(name = "NLTIEUHAO")
//    private String nlTieuHao;
//    @Column(name = "MOTA")
//    private String moTa;
//    @Column(name = "GIA")
//    private BigDecimal gia;
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (id != null ? id.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof XeEntity)) {
//            return false;
//        }
//        XeEntity other = (XeEntity) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "entityBean.Xe[ id=" + id + " ]";
//    
//    }
//
//    public XeEntity() {
//    }
//    
//
//    public XeEntity(Long id, String tenXe, Integer soGhe, String nhienLieu, String truyenDong, String nlTieuHao, String moTa, BigDecimal gia) {
//        this.id = id;
//        this.tenXe = tenXe;
//        this.soGhe = soGhe;
//        this.nhienLieu = nhienLieu;
//        this.truyenDong = truyenDong;
//        this.nlTieuHao = nlTieuHao;
//        this.moTa = moTa;
//        this.gia = gia;
//    }
//
//    public static long getSerialVersionUID() {
//        return serialVersionUID;
//    }
//
//    public String getTenXe() {
//        return tenXe;
//    }
//
//    public Integer getSoGhe() {
//        return soGhe;
//    }
//
//    public String getNhienLieu() {
//        return nhienLieu;
//    }
//
//    public String getTruyenDong() {
//        return truyenDong;
//    }
//
//    public String getNlTieuHao() {
//        return nlTieuHao;
//    }
//
//    public String getMoTa() {
//        return moTa;
//    }
//
//    public BigDecimal getGia() {
//        return gia;
//    }
//
//    public void setTenXe(String tenXe) {
//        this.tenXe = tenXe;
//    }
//
//    public void setSoGhe(Integer soGhe) {
//        this.soGhe = soGhe;
//    }
//
//    public void setNhienLieu(String nhienLieu) {
//        this.nhienLieu = nhienLieu;
//    }
//
//    public void setTruyenDong(String truyenDong) {
//        this.truyenDong = truyenDong;
//    }
//
//    public void setNlTieuHao(String nlTieuHao) {
//        this.nlTieuHao = nlTieuHao;
//    }
//
//    public void setMoTa(String moTa) {
//        this.moTa = moTa;
//    }
//
//    public void setGia(BigDecimal gia) {
//        this.gia = gia;
//    }
//    
//}
