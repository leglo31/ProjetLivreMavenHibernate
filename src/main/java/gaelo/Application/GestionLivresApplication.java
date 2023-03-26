package gaelo.Application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import gaelo.repositories.dao.EnfantRepository;
import gaelo.repositories.dao.GenreRepository;
import gaelo.repositories.dao.LivresRepository;
import gaelo.repositories.dao.ParentRepository;

@SpringBootApplication
public class GestionLivresApplication implements CommandLineRunner {


	private EnfantRepository enfantRepository;

	private LivresRepository livresRepository;

	private ParentRepository parentRepository;

	private GenreRepository genreRepository;

	public static void main(String[] args) {
		SpringApplication.run(GestionLivresApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * genreRepository.save(new Genre(null, "Science_fiction"));
		 * genreRepository.save(new Genre(null, "Petite_histoire"));
		 * 
		 * parentRepository.save(new Parent(null, "Laurent")); parentRepository.save(new
		 * Parent(null, "Gaëlle"));
		 * 
		 * enfantRepository.save(new Enfant(null, 2015, "Charlie"));
		 * enfantRepository.save(new Enfant(null, 2019, "Jeanne"));
		 */

		
		/*
		 * livresRepository.save(new Livres(null, "Arthur et la corde d'or",
		 * "Joe Tood - Stanton", "Charlie", "Laurent",
		 * "Découvre l'histoire en terre vicking du tout premier héros de la famille Vieillepierre: Arthur"
		 * , "Belle histoire remplie d'objets magiques", 2019, 9, true,
		 * "Science-fiction")); livresRepository.save(new Livres(null,
		 * "Boîtes à bonheurs", "Carl Norac & Claude K.Dubois", "Jeanne",
		 * "Laurent-Gaëlle",
		 * "Aujourd’hui, Lola peut choisir un cadeau. Tiens, des boîtes ! Une petite et une grande. Ce sera mes boîtes à bonheurs!"
		 * , "Jolie histoire de la famille hamster", 2015, 7, false,
		 * "Petite histoire")); livresRepository.save(new Livres(null, "Titi",
		 * "Carl Norac & Claude K.Dubois", "Jeanne", "Laurent-Gaëlle",
		 * "Aujourd’hui, Lola peut choisir un cadeau. Tiens, des boîtes ! Une petite et une grande. Ce sera mes boîtes à bonheurs!"
		 * , "Jolie histoire de la famille hamster", 2015, 7, true, "Petite_histoire"));
		 */
		 

/*		System.out.println("***********************");

		livresRepository.findAll().forEach(t -> {
			System.out.println(t.toString());
		});
		System.out.println("***********************");

		Livres livres = livresRepository.findById(1L).get();
		System.out.println(livres.getTitre());

		System.out.println("***********************");

		List<Livres> livreJeanne = livresRepository.findByEnfantContains("Jeanne");
		livreJeanne.forEach(l -> {
			System.out.println(l.getTitre());
		});

		System.out.println("***********************");

		List<Livres> livreParent = livresRepository.findByParentContains("L");
		livreParent.forEach(l -> {
			System.out.println(l.getTitre());
		});

		System.out.println("***********************");

		List<Livres> livreLu = livresRepository.findByLu(false);
		livreLu.forEach(l -> {
			System.out.println(l.getTitre());
		});

		System.out.println("***********************");
		// La pagination permet d'afficher juste page par page
		Page<Livres> livreParPage = livresRepository.findAll(PageRequest.of(0, 2));
		List<Livres> livreList = livreParPage.getContent();

		livreList.forEach(l -> {
			System.out.println("list par page: " + l.getTitre());
		});

		System.out.println("***********************");

	
	*/
	}
}
