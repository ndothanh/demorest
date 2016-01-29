package com.aphab.repository;

import org.springframework.data.repository.CrudRepository;
import com.aphab.domain.Poll;

public interface PollRepository extends CrudRepository<Poll, Long> {

}
