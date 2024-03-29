/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entityBean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "KHACHHANG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Khachhang.findAll", query = "SELECT k FROM Khachhang k"),
    @NamedQuery(name = "Khachhang.findBySogplx", query = "SELECT k FROM Khachhang k WHERE k.sogplx = :sogplx"),
    @NamedQuery(name = "Khachhang.findByHo", query = "SELECT k FROM Khachhang k WHERE k.ho = :ho"),
    @NamedQuery(name = "Khachhang.findByTen", query = "SELECT k FROM Khachhang k WHERE k.ten = :ten"),
    @NamedQuery(name = "Khachhang.findByNgaysinh", query = "SELECT k FROM Khachhang k WHERE k.ngaysinh = :ngaysinh"),
    @NamedQuery(name = "Khachhang.findByAnh", query = "SELECT k FROM Khachhang k WHERE k.anh = :anh")})
public class Khachhang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "SOGPLX")
    private String sogplx;
    @Size(max = 100)
    @Column(name = "HO")
    private String ho;
    @Size(max = 100)
    @Column(name = "TEN")
    private String ten;
    @Column(name = "NGAYSINH")
    @Temporal(TemporalType.DATE)
    private Date ngaysinh;
    @Size(max = 10)
    @Column(name = "ANH")
    private String anh;

    public Khachhang() {
    }

    public Khachhang(String sogplx) {
        this.sogplx = sogplx;
    }

    public String getSogplx() {
        return sogplx;
    }

    public void setSogplx(String sogplx) {
        this.sogplx = sogplx;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sogplx != null ? sogplx.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Khachhang)) {
            return false;
        }
        Khachhang other = (Khachhang) object;
        if ((this.sogplx == null && other.sogplx != null) || (this.sogplx != null && !this.sogplx.equals(other.sogplx))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityBean.Khachhang[ sogplx=" + sogplx + " ]";
    }
    
}
