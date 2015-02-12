//Ce fichier est encodé en UTF8.

// VAESSEN Tanguy
// LEPINOIS Loïc
// LAMBIN Grégoire
// HAUET Alexandre

public class CT39V114 {
  
  // Le paramètre t n'est pas null. 
  // De plus, il représente un vecteur non vide de n entiers relatifs.
  
  // Cette méthode ne modifie pas les éléments du tableau t.
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
	// qui respecte les préconditions

  //***********************************************************************************
  //Expliquez comment vous avez développé ce programme
	
	//analyser la situation
	//exposer le problème sur papier
	//identifier les deux versions demandées
	
  
  //***********************************************************************************
  //Expliquez pourquoi vous pensez que votre méthode est correcte
	
	//on a testé plusieurs cas sur papier
	//elle respecte la complexité demandée
	//
}
