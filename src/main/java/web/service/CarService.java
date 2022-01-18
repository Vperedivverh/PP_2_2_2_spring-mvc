package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
@Service
public class CarService {
    List<Car>carsList;
    {
        carsList.add(new Car("Baklazhan","purple", 111));
        carsList.add(new Car("Devjatochka","green", 512));
        carsList.add(new Car("Kalinka","ice", 214));
        carsList.add(new Car("Almera","black", 534));
        carsList.add(new Car("Krokodil","white", 584));
    }
    public List<Car> getList(int count) {
        if (count < 5 && count > 0 ) {
            return carsList.subList(0, count);
        }
        return carsList;
    }
}
