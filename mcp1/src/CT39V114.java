//Ce fichier est encod� en UTF8.

// VAESSEN Tanguy
// LEPINOIS Lo�c
// LAMBIN Gr�goire
// HAUET Alexandre

public class CT39V114 {
  
  // Le param�tre t n'est pas null. 
  // De plus, il repr�sente un vecteur non vide de n entiers relatifs.
  
  // Cette m�thode ne modifie pas les �l�ments du tableau t.
  // Elle renvoie la somme de la sous-sequence non vide maximum de t.
	
	public static long maxSum(int[] t) {
		int sum = Integer.MIN_VALUE;
		int currentSum = 0;
		for (int i =0; i < t.length; i++){
			currentSum += t[i];
			if (currentSum > sum){
				sum = currentSum;
			}else if(t[i]>sum){
				sum = t[i];
				currentSum = sum;
			}
		}
		return sum;
	}
  
  //***********************************************************************************
  //Expliquez la notion de "programme correct"
	
	// qui se termine
	// qui respecte les pr�conditions

  //***********************************************************************************
  //Expliquez comment vous avez développé ce programme
	
	//analyser la situation
	//exposer le probl�me sur papier
	//identifier les deux versions demand�es
	
  
  //***********************************************************************************
  //Expliquez pourquoi vous pensez que votre méthode est correcte
	
	//on a test� plusieurs cas sur papier
	//elle respecte la complexit� demand�e
	//
}
