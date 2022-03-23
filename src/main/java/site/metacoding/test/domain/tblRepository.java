package site.metacoding.test.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface tblRepository extends JpaRepository<boardTbl, Integer> {

    @Query(value = "SELECT * FROM boardTbl WHERE title LIKE %:search%", nativeQuery = true)
    List<boardTbl> mfindSearch(@Param("search") String search);
}
