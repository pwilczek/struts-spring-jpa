package name.wilu.service;

import name.wilu.model.Hotel;
import name.wilu.model.HotelRepository;
import name.wilu.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HotelService {

    @Autowired
    private HotelRepository repo;

    public void store(Hotel hotel) {
        if (hotel != null && Hotel.isValid(hotel)) repo.store(hotel);
        else throw new IllegalArgumentException("Provided hotel is not correct!");
    }

    public List<Hotel> readHotels() {
        return repo.readHotels();
    }

    public void reserve(String hotelId, String comment) {
        Hotel hotel = repo.readHotel(Long.parseLong(hotelId));
        Reservation reservation = new Reservation(hotel, comment);
        reservation = repo.store(reservation);
        hotel.add(reservation);
    }
}
