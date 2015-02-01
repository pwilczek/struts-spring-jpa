package name.wilu.model;

import org.apache.commons.lang3.StringUtils;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "hotel")
public class Hotel {

    private Long id;
    private String name;
    private Set<Reservation> reservations = new HashSet();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToMany(mappedBy = "hotel")
    public Set<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void add(Reservation reservation) {
        reservations.add(reservation);
    }

    public static boolean isValid(Hotel hotel) {
        return StringUtils.isNotBlank(hotel.getName());
    }

}
