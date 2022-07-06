package Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity                             // COMENTÁRIO ÚTIL PARA DETERMINAR UMA ENTIDADE.       
@Table (name = "requisicoesModel")  // COMENTÁRIO ÚTIL PARA DETERMINAR UMA TABELA
public class RequisicoesModel { 
	
	
	@Id // DEFINIR COMO ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) // UTILIZADO PARA TORNAR ID CHAVE PRIMARIA
	private long id;
	
	private String nome;
	
	private String sobreNome;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new java.sql.Date(System.currentTimeMillis());	
	
	private String telefone;

	//////////////////////////////////////////////////////////
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	} 
	

	
	
	
}
