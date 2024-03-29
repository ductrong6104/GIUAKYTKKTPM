/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sessionBean;

import entityBean.CarEntity;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ADMIN
 */
@Remote
public interface Car {
    public List<CarEntity> initListCar();
    public CarEntity getDetailCar(List<CarEntity> listCar, int id);
    
}
