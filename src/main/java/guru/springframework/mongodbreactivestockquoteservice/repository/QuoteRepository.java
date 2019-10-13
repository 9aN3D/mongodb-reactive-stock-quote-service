package guru.springframework.mongodbreactivestockquoteservice.repository;

import guru.springframework.mongodbreactivestockquoteservice.domain.Quote;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends ReactiveMongoRepository<Quote, String> {
}
