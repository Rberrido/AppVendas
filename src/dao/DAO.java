package dao;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {

	Optional<T> getByID(long id);

	List<T> selectAll();

	boolean save(T t);

	boolean updatebyID(T t);

	boolean detelebyID(T t);

}
