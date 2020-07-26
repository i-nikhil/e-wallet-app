package e_wallet.UserService.Repository;

import e_wallet.UserService.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
