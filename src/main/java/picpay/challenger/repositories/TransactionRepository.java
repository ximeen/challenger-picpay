package picpay.challenger.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import picpay.challenger.domain.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
