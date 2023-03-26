package gaelo.livres;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Livres")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Livres implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "Titre", length = 25)
	private String titre;
	private String auteur;
	private String enfant;
	private String parent;
	private String synopsie;
	private String commentaire;
	private int dateEdition;
	private int note;
	private boolean lu;
	private String genre;
}
