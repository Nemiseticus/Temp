package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.RequisicoesModel;


public interface RequisicoesRepository extends JpaRepository<RequisicoesRepository, Long> {
	
	public List<RequisicoesModel>  findAllByTituloContainingIgnoreCase (String nome);

	public RequisicoesModel save(RequisicoesModel requisicoesModel);

}
