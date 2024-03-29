///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package sessionBean;
//
//import entityBean.XeEntity;
//import java.util.List;
//import javax.ejb.Stateless;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//import javax.persistence.criteria.CriteriaQuery;
//import javax.persistence.criteria.Root;
//
///**
// *
// * @author ADMIN
// */
//@Stateless
//public class XeBean implements XeRemote{
//    @PersistenceContext(unitName = "YourPersistenceUnit")
//    private EntityManager em;
//    
//    @Override
//    public void create(XeEntity xe) {
//        em.persist(xe);
//    }
//
//    @Override
//    public void edit(XeEntity xe) {
//        em.merge(xe);
//    }
//
//    @Override
//    public void remove(XeEntity xe) {
//        
//        em.remove(em.contains(xe) ? xe : em.merge(xe));
//    }
//
//    @Override
//    public XeEntity find(Object id) {
//        return em.find(XeEntity.class, id);
//    }
//
//    @Override
//    public List<XeEntity> findAll() {
//        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
//        cq.select(cq.from(XeEntity.class));
//        return em.createQuery(cq).getResultList();
//    }
//
//    @Override
//    public List<XeEntity> findRange(int[] range) {
//        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
//        cq.select(cq.from(XeEntity.class));
//        Query q = em.createQuery(cq);
//        q.setMaxResults(range[1] - range[0]);
//        q.setFirstResult(range[0]);
//        return q.getResultList();
//    }
//
//    @Override
//    public int count() {
//        CriteriaQuery cq = em.getCriteriaBuilder () . createQuery () ;
//        Root<XeEntity> rt = cq. from (XeEntity.class) ;
//        cq.select (em.getCriteriaBuilder () .count (rt) ) ;
//        Query q = em. createQuery (cq) ;
//        return ((Long) q.getSingleResult ()) . intValue ();
//    }
//    
//}
