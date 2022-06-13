package dao;

import java.util.List;


public interface genericDao<T, K> {
	public List<T> selectAll();

	public T selectById(K id);

	public List<T> selectByName(String key);

	public boolean insert(T entity);

	public boolean update(T entity);

	public boolean remove(K id);
}



