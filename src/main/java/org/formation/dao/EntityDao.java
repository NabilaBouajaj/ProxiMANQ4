package org.formation.dao;


import java.util.List;




public interface EntityDao<E> {
	
	public void persist(E e) throws Exception;
	
	public void merge(E e) throws Exception;

	public void remove(Object id) throws Exception;
	
	public E findById(long id) throws Exception;
	
	public List<E> findAll() throws Exception;
	
	public List<E> findByProperty(String prop, Object val) throws Exception;
	
	public List<E> findInRange(int firstResult, int maxResults) throws Exception;
	
	public long count() throws Exception;
	
	
}
