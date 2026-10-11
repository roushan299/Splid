package com.roushan.splid.repositories;

import com.roushan.splid.models.ExpenseGroup;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

@Registered
public interface ExpenseGroupRepository extends JpaRepository<ExpenseGroup, Long> {
}
