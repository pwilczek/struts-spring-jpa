package name.wilu.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import name.wilu.model.Hotel;
import name.wilu.service.HotelService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.SQLException;

@Action(value = "manager")
public class HotelManager extends ActionSupport implements ModelDriven<Hotel> {

    @Autowired
    private HotelService service;
    //
    private Hotel hotel = new Hotel();

    public String execute() throws SQLException {
        return SUCCESS;
    }

    public Hotel getModel() {
        return hotel;
    }

    public String handle() {
        service.store(hotel);
        return SUCCESS;
    }
}
