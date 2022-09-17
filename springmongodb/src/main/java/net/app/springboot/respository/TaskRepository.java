package net.app.springboot.respository;
import org.springframework.data.mongodb.repository.MongoRepository;

import net.app.springboot.model.Task;
public interface TaskRepository extends MongoRepository<Task, Long> {

}
