package alexsandro.dsclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import alexsandro.dsclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
