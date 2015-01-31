package name.wilu.datasource;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import javax.sql.DataSource;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

import static org.junit.Assert.assertThat;

public class DataSourceConfigurationTest {

    @Test
    public void shouldGetConnection() throws PropertyVetoException, SQLException {
        DataSourceConfiguration sut = new DataSourceConfiguration();
        DataSource dataSource = sut.dataSource();
        assertThat(dataSource.getConnection(), CoreMatchers.notNullValue());
    }
}
