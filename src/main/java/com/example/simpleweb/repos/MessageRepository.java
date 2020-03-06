package com.example.simpleweb.repos;
import com.example.simpleweb.domain.Message;
import org.springframework.data.repository.CrudRepository;
public interface MessageRepository  extends CrudRepository<Message, Long>{
}
