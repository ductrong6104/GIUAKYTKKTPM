/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entityBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "XE")
@XmlRootElement
public class Xe implements Serializable {

    @ManyToMany(mappedBy = "xeCollection", fetch = FetchType.EAGER)
    private List<Anh> anhCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MAXE")
    private Integer maxe;
    @Size(max = 100)
    @Column(name = "TENXE")
    private String tenxe;
    @Column(name = "SOGHE")
    private Integer soghe;
    @Size(max = 100)
    @Column(name = "NHIENLIEU")
    private String nhienlieu;
    @Size(max = 100)
    @Column(name = "TRUYENDONG")
    private String truyendong;
    @Column(name = "NLTIEUHAO")
    private Integer nltieuhao;
    @Size(max = 1073741823)
    @Column(name = "MOTA")
    private String mota;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "GIA")
    private BigDecimal gia;

    public Xe() {
    }

    public Xe(Integer maxe) {
        this.maxe = maxe;
    }

    public Integer getMaxe() {
        return maxe;
    }

    public void setMaxe(Integer maxe) {
        this.maxe = maxe;
    }

    public String getTenxe() {
        return tenxe;
    }

    public void setTenxe(String tenxe) {
        this.tenxe = tenxe;
    }

    public Integer getSoghe() {
        return soghe;
    }

    public void setSoghe(Integer soghe) {
        this.soghe = soghe;
    }

    public String getNhienlieu() {
        return nhienlieu;
    }

    public void setNhienlieu(String nhienlieu) {
        this.nhienlieu = nhienlieu;
    }

    public String getTruyendong() {
        return truyendong;
    }

    public void setTruyendong(String truyendong) {
        this.truyendong = truyendong;
    }

    public Integer getNltieuhao() {
        return nltieuhao;
    }

    public void setNltieuhao(Integer nltieuhao) {
        this.nltieuhao = nltieuhao;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public BigDecimal getGia() {
        return gia;
    }

    public void setGia(BigDecimal gia) {
        this.gia = gia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maxe != null ? maxe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Xe)) {
            return false;
        }
        Xe other = (Xe) object;
        if ((this.maxe == null && other.maxe != null) || (this.maxe != null && !this.maxe.equals(other.maxe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityBean.Xe[ maxe=" + maxe + " ]";
    }

    @XmlTransient
    public List<Anh> getAnhCollection() {
        return anhCollection;
    }

    public void setAnhCollection(List<Anh> anhCollection) {
        this.anhCollection = anhCollection;
    }
    
}
