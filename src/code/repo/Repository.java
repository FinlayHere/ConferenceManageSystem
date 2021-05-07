package code.repo;

import java.util.List;

public interface Repository<E> {
		
		List<E> findAll();
		
		void addOne(E entity);
		
		Integer generateMaxId();
		
		void retrieveAll();
}
