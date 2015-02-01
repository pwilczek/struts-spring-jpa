package name.wilu.model;

import javax.persistence.*;

@Entity
@Table(name = "reservation")
public class Reservation {

    private Long id;
    private String comment;
    private Hotel hotel;

    //
    public Reservation() {
    }

    public Reservation(Hotel hotel, String comment) {
        this.hotel = hotel;
        this.comment = comment;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    public Hotel getHotel() {
        return this.hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
