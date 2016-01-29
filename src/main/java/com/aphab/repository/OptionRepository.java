package com.aphab.repository;

import org.springframework.data.repository.CrudRepository;
import com.aphab.domain.Option;

public interface OptionRepository extends CrudRepository<Option, Long> {

}
