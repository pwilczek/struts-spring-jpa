package name.wilu.service;

import name.wilu.model.Hotel;
import name.wilu.model.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional()
public class HotelService {

    @Autowired
    private HotelRepository repo;

    public void store(Hotel hotel) {
        if (hotel != null && Hotel.isValid(hotel)) repo.store(hotel);
        else throw new IllegalArgumentException("Provided hotel is not correct!");
    }
}
