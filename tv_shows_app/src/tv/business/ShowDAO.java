package tv.business;

import java.util.List;

public interface ShowDAO extends ShowConstants {
    Show get(String genre);
    Show get(int length);
    List<Show> getAll();
    boolean add(Show s);
    boolean update(Show s);
    boolean delete(Show s);
}