/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entityBean;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
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
@Table(name = "ANH")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Anh.findAll", query = "SELECT a FROM Anh a"),
    @NamedQuery(name = "Anh.findByMaanh", query = "SELECT a FROM Anh a WHERE a.maanh = :maanh")})
public class Anh implements Serializable {

    @Size(max = 100)
    @Column(name = "NGUONANH")
    private String nguonanh;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MAANH")
    private Integer maanh;
    @JoinTable(name = "CHITIETANHXE", joinColumns = {
        @JoinColumn(name = "MAANH", referencedColumnName = "MAANH")}, inverseJoinColumns = {
        @JoinColumn(name = "MAXE", referencedColumnName = "MAXE")})
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Xe> xeCollection;

    public Anh() {
    }

    public Anh(Integer maanh) {
        this.maanh = maanh;
    }

    public Integer getMaanh() {
        return maanh;
    }

    public void setMaanh(Integer maanh) {
        this.maanh = maanh;
    }


    @XmlTransient
    public Collection<Xe> getXeCollection() {
        return xeCollection;
    }

    public void setXeCollection(Collection<Xe> xeCollection) {
        this.xeCollection = xeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maanh != null ? maanh.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Anh)) {
            return false;
        }
        Anh other = (Anh) object;
        if ((this.maanh == null && other.maanh != null) || (this.maanh != null && !this.maanh.equals(other.maanh))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityBean.Anh[ maanh=" + maanh + " ]";
    }

    public String getNguonanh() {
        return nguonanh;
    }

    public void setNguonanh(String nguonanh) {
        this.nguonanh = nguonanh;
    }
    
}
