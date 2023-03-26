package gaelo.repositories.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import gaelo.livres.Livres;

public interface LivresRepository extends JpaRepository<Livres, Long>{
	//Important de respecter le nommage tel que Enfant ou Parent ou AgeMini
public List<Livres> findByEnfantContains(String enfant);
public List<Livres> findByParentContains(String parent);
public List<Livres> findByLu(Boolean lu);

}
