/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sessionBean;

import entityBean.CarEntity;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author ADMIN
 */
@Stateless
public class CarBean implements Car{

    @Override
    public List<CarEntity> initListCar() {
        List<CarEntity> carEntitys = new ArrayList<>();
        CarEntity car1 = new CarEntity(1, "SUZUKI ERTIGA 2016", "quan 10, hcm", 100);
        CarEntity car2 = new CarEntity(2, "TOYOTA VELOZ CROSS 2022", "quan 11, hcm", 971);
        CarEntity car3 = new CarEntity(3, "TOYOTA VIOS 2019", "quan 10, hcm", 804);
        CarEntity car4 = new CarEntity(4, "TOYOTA VIOS 2019", "quan 10, hcm", 804);
        carEntitys.add(car1);
        carEntitys.add(car2);
        carEntitys.add(car3);
        carEntitys.add(car4);
        return carEntitys;
    }

    @Override
    public CarEntity getDetailCar(List<CarEntity> listCar, int id) {
        for (CarEntity car: listCar){
            if (car.getId() == id)
                return car;
        }
        return null;
    }

    
    
}
