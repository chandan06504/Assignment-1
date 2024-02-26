package com.Bank.repository;

import com.Bank.entity.BankServices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankServiceRepository extends JpaRepository<BankServices, Long> {
}
