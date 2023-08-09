package com.example.demo.Repositori;

import com.example.demo.init.model.Location;
import com.example.demo.init.model.StorageLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Long> {
}
