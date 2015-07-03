package com.platform.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.platform.bean.ArtifactoryTPB;

@Repository
public interface ArtifactoryTPBDao extends CrudRepository<ArtifactoryTPB, Long> {
//	/**
//	 * Find the artifactory with the given username. This method will be translated into a query using the
//	 * {@link javax.persistence.NamedQuery} annotation at the {@link artifactory} class.
//	 * 
//	 * @param lastname
//	 * @return
//	 */
//	Artifactory findByTheUsersName(String username);
//
//	/**
//	 * Find all users with the given lastname. This method will be translated into a query by constructing it directly
//	 * from the method name as there is no other query declared.
//	 * 
//	 * @param lastname
//	 * @return
//	 */
//	List<Artifactory> findByName(String lastname);
//
//	/**
//	 * Returns all users with the given firstname. This method will be translated into a query using the one declared in
//	 * the {@link Query} annotation declared one.
//	 * 
//	 * @param firstname
//	 * @return
//	 */
//	@Query("select name, version from artifactorytpbs")
	List<ArtifactoryTPB> findAll();

//	/**
//	 * Returns all users with the given name as first- or lastname. Makes use of the {@link Param} annotation to use named
//	 * parameters in queries. This makes the query to method relation much more refactoring safe as the order of the
//	 * method parameters is completely irrelevant.
//	 * 
//	 * @param name
//	 * @return
//	 */
//	@Query("select u from User u where u.firstname = :name or u.lastname = :name")
//	List<Artifactory> findByFirstnameOrLastname(@Param("name") String name);
}
