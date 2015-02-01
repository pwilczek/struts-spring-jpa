package name.wilu.actions;

import com.opensymphony.xwork2.ActionSupport;
import name.wilu.model.Hotel;
import name.wilu.service.HotelService;
import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Action("reservations")
public class ReservationsAction extends ActionSupport {

    @Autowired
    private HotelService service;
    //
    private String selectedId, comment;


    public List<Hotel> getHotels() {
        return service.readHotels();
    }

    public void setHotel(String id) {
        selectedId = id;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void handle() {
        service.reserve(selectedId, comment);
    }

}
