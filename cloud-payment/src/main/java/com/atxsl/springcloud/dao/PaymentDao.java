package com.atxsl.springcloud.dao;

import com.atxsl.springcloud.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

/**
 * @author xusonglin
 * @date 2020/9/22 - 17:21
 */
@Repository
public interface PaymentDao extends JpaRepository<Payment,String> {

    @Query(value = "select p.* from payment p where id = ?1" ,nativeQuery = true)
    public Payment getPaymentById(String id);
}
