package com.aphab.repository;

import org.springframework.data.repository.CrudRepository;
import com.aphab.domain.Vote;

public interface VoteRepository extends CrudRepository<Vote, Long> {

}
