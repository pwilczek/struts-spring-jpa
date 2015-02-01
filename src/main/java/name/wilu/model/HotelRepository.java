package name.wilu.model;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Repository
@Transactional
public class HotelRepository {

    @PersistenceContext
    private EntityManager em;

    public void store(Hotel hotel) {
        em.persist(hotel);
    }

    public List<Hotel> readHotels() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Hotel> query = cb.createQuery(Hotel.class);
        CriteriaQuery<Hotel> all = query.select(query.from(Hotel.class));
        return em.createQuery(all).getResultList();
    }

    public Hotel readHotel(Long id) {
        return em.find(Hotel.class, id);
    }

    public Reservation store(Reservation reservation) {
        em.persist(reservation);
        return reservation;
    }
}
