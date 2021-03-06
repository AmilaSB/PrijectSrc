package finalProject.geospatialwebapp.utility;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class UserRegistrationIdGenerator implements IdentifierGenerator{

	public Serializable generate(SessionImplementor session, Object object) throws HibernateException {
		Connection connection = session.connection();
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT nextval ('seq_useregistration') as seqId");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return rs.getLong("seqId");
			}

		} catch (SQLException e) {
			throw new HibernateException("Unable to generate User Registration Id Sequence");
		}
		return null;
	}

}