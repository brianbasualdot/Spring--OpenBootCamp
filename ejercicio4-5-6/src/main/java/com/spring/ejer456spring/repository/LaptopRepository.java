package com.spring.ejer456spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.ejer456spring.entity.laptop;

@Repository
public interface LaptopRepository extends JpaRepository<LaptopRepository,Long> {

    static void save(laptop laptop1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
}
