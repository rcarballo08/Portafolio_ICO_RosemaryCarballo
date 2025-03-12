package DWP.DWP.dao;

import DWP.DWP.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository <Categoria, Long> {
    
}
