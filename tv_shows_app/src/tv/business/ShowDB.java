package tv.business;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import tv.util.DBUtil;

public class ShowDB implements ShowDAO {
 
	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql:localhost:3306/tv_shows";
		String username = "tv_shows_user";
		String password = "sesame";
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		}
		catch (ClassNotFoundException cnfe) {
			System.out.println(cnfe);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection c = DriverManager.getConnection(dbUrl, username, password);
		return c;
	}
	
	@Override
	public Show get(String genre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Show get(int length) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Show> getAll() {
		String sql = "SELECT * FROM tvshow";
		List<Show> shows = new ArrayList<>();
		try (Connection connection = DBUtil.getConnection();
			 PreparedStatement ps = connection.prepareStatement(sql);
			 ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String rating = rs.getString(3);
				int length = rs.getInt(4);
				String genre = rs.getString(5);
				String network = rs.getString(6);
				Show s = new Show(id, name, rating, length, genre,
								network);
				shows.add(s);
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return shows;
	}

	@Override
	public boolean add(Show s) {
		System.out.println("Not yet implelented!");
		return false;
	}

	@Override
	public boolean update(Show s) {
		System.out.println("Not yet implelented!");
		return false;
	}

	@Override
	public boolean delete(Show s) {
		System.out.println("Not yet implelented!");
		return false;
	}

}
