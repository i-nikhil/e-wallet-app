package e_wallet.WalletService.Repository;

import e_wallet.WalletService.Model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction,Integer>
{
    @Query("select u from Transaction u where u.sid = ?1 OR u.rid = ?1")
    List<Transaction> findBysidAndrid(int sid);
}
