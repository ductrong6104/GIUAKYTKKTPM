/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sessionBean;

import entityBean.Khachhang;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ADMIN
 */
@Stateless
public class KhachHangBean implements KhachHangRemote{
    @PersistenceContext(unitName = "ThueOto-ejbPU")
    private EntityManager em;
    @Override
    public void create(Khachhang kh) {
        em.persist(kh);
    }
    
}
