import org.chocosolver.solver.Model;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.variables.IntVar;

public class Projet {
	
	private static final int NB_GRUES = 4;
	private static final int NB_OUVRIERS = 10;
	private static final int NB_NAVIRES = 4;
	private static final int NB_TRACE = 50;
	private static final int TAILLE_QUAI = 30;
	
	private int [][] tailleNavires;
	private int [][] chargement_heure;
	
	private IntVar[][] grues;
	private IntVar[][] ouvriers;
	private IntVar[][] espace_quai;

	private Model model;	
	private Solver solver;
	
	public Projet() {
		// TODO Auto-generated constructor stub
		model = new Model();
		solver = model.getSolver();
		tailleNavires= new int [NB_NAVIRES][2];
		chargement_heure= new int [NB_GRUES][2];
		grues=model.intVarMatrix(NB_GRUES, 	NB_TRACE, -1, NB_NAVIRES);
		ouvriers=model.intVarMatrix(NB_OUVRIERS, NB_TRACE, -1, NB_OUVRIERS);
		espace_quai=model.intVarMatrix(TAILLE_QUAI, NB_TRACE, 0,NB_NAVIRES);
		
	}

}
