package com.eidos.uuid;

import org.springframework.data.repository.CrudRepository;
import com.eidos.uuid.Uuid;
import org.springframework.stereotype.Repository;

public interface UuidRepository extends CrudRepository<Uuid, String> {

}
