package EXO3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class ConBD {
	public  static void main ( String [] args )  { 
		
		 
		try {
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole","root","6341");
			System.out.println("Connexion à la BD réussie.");
		    String requete = "Select nomEtu , prenomEtu from etudiant where numFiliere like ? " ; 
		    String requete2 = "Select numFiliere from etudiant where numFiliere like ? " ; 
			
		    
		    //FETCH LES ETUDIANTS DES FILIERES GI2
			PreparedStatement stmt = conn.prepareStatement(requete) ; 
			stmt.setInt(1,2) ; 
			ResultSet res = stmt.executeQuery() ; 
			
			
			//PreparedStatement stmt2 = conn.prepareStatement  ( requete) ; 
			//stmt2.setInt(1 , res ) ;
			//ResultSet rs = stmt.executeQuery(); 
	
			
			while ( res.next() ) { 
				        String nom = res.getString ( "nomEtu" ) ;  
						String prenom = res.getString("prenomEtu") ; 
						System.out.println(nom +" " + prenom ) ; 
			}
			
			//
			//AFFICHAGE DE TOUT LES ETUDIANTS 
			String requete3 = "select*from etudiant " ; 
			PreparedStatement stmt3 = conn.prepareStatement(requete3) ;
			ResultSet rs = stmt3.executeQuery() ; 
			
			while (rs.next()) { 
				int  id  = rs.getInt(1) ; 
				String nom = rs.getString(2) ; 
				String prenom = rs.getString(3) ; 
				String filiere = rs.getString(4) ;
				System.out.println(id +" " + nom +" " + prenom +" " +filiere) ;}
				
			//CHANGEMENT DUN NOM D'UN ETUDIANT 
			//UPDATE EN UTILISE = PAS LIKE 
				String requete4 = "Update etudiant set nomEtu= ? where nomEtu =  ?" ; 
				PreparedStatement stmt4 = conn.prepareStatement(requete4) ;
				stmt4.setString( 1, "mohamed") ; 
				stmt4.setString (2 , "MOHMADI") ; 
				int nbre = stmt4.executeUpdate()	 ; 	
				System.out.println(nbre   +" :Le nombre de lignes update ") ;
				
				
				//INSERE UN NV ETUDIANTS 
			    String requete5 = "insert into etudiant(idEtu ,nomEtu , prenomEtu  ,numFiliere)  values (?,?,?,? )  " ; 
				PreparedStatement stmt5 = conn.prepareStatement(requete5 ) ; 
				stmt5.setString( 2 , "Mohamed") ; 
				stmt5.setString ( 3 , "Fatehi ") ; 
				stmt5.setInt ( 4,3 ) ; 
				stmt5.setInt ( 1 ,106 ) ; 
				int nbre1  = stmt5.executeUpdate() ;  
				
			   //DELETE UN ETUDIANT 
			  String requete6 = "delete from etudiant where idEtu like ?" ; 
			  PreparedStatement stmt6 = conn.prepareCall(requete6 ) ; 
			  stmt6.setInt(1 , 105) ; 
			  int nbre6 = stmt6.executeUpdate() ; 
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			} catch (SQLException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
			} 
			
		
	}}


//}