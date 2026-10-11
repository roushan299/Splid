package com.roushan.splid.repositories;

import com.roushan.splid.models.Split;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

@Registered
public interface SplitRepository extends JpaRepository<Split, Long> {
}
