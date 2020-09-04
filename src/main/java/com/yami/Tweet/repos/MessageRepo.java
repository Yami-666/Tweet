package com.yami.Tweet.repos;

import com.yami.Tweet.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {
    List<Message> findByAuthor(String author);
}
