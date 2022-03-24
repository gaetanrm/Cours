package fr.romero.tp3.Repositories;

import fr.romero.tp3.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> { }

