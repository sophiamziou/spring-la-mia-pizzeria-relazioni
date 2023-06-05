package org.java.demo.repo;

import org.java.demo.pojo.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepo extends JpaRepository<Discount, Integer>  {

}
