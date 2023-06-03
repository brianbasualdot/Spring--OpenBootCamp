package jsilgado.spring.openbootcampspringej789.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jsilgado.spring.openbootcampspringej789.domain.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {

}
