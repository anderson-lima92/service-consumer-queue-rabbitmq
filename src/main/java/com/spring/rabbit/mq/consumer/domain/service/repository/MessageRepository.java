package com.spring.rabbit.mq.consumer.domain.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.rabbit.mq.consumer.domain.model.dto.Messege;

@Repository
public interface MessageRepository extends JpaRepository<Messege, Long>{

}
