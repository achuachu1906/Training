package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
import com.example.demo.entity.*;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {

}
