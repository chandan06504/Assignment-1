package com.Bank.repository;

import com.Bank.entity.BankAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAddressRepository extends JpaRepository<BankAddress, Long> {
}
