package name.wilu.model;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class HotelRepository {

    @PersistenceContext
    private EntityManager em;

    public void store(Hotel hotel) {
        em.persist(hotel);
    }
}
