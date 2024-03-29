/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sessionBean;

import entityBean.Anh;
import entityBean.Xe;
import java.util.Base64;
import java.util.Collection;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author ADMIN
 */
@Stateless
public class XeBean implements XeRemote{
    @PersistenceContext(unitName = "ThueOto-ejbPU")
    private EntityManager em;
    
    @Override
    public void create(Xe xe) {
        em.persist(xe);
    }

    @Override
    public void edit(Xe xe) {
        em.merge(xe);
    }

    @Override
    public void remove(Xe xe) {
        
        em.remove(em.contains(xe) ? xe : em.merge(xe));
    }

    @Override
    public Xe find(Object id) {
        return em.find(Xe.class, id);
    }

    @Override
    public List<Xe> findAll() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Xe.class));
        return em.createQuery(cq).getResultList();
    }

    @Override
    public List<Xe> findRange(int[] range) {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Xe.class));
        Query q = em.createQuery(cq);
        q.setMaxResults(range[1] - range[0]);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    @Override
    public int count() {
        CriteriaQuery cq = em.getCriteriaBuilder () . createQuery () ;
        Root<Xe> rt = cq. from (Xe.class) ;
        cq.select (em.getCriteriaBuilder () .count (rt) ) ;
        Query q = em. createQuery (cq) ;
        return ((Long) q.getSingleResult ()) . intValue ();
    }

    
    
}
