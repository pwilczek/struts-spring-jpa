package name.wilu.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.SQLException;

@Action("hotels")
public class Hotels extends ActionSupport {

    public String execute() throws SQLException {
        return ActionSupport.SUCCESS;
    }


}
