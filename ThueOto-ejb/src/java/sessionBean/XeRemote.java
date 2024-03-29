/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sessionBean;

import entityBean.Xe;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ADMIN
 */
@Remote
public interface XeRemote{
    void create(Xe xe);
    void edit(Xe xe);
    void remove(Xe xe);
    Xe find(Object id);
    List<Xe> findAll();
    List<Xe> findRange(int[] range);
    int count();
  
}
