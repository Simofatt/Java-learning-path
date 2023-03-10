
import java.sql.*;

public class Filiere {
    int numFiliere;
    String nomFiliere;

    public Filiere(int numFiliere, String nomFiliere){
        this.numFiliere = numFiliere;
        this.nomFiliere = nomFiliere;
    }
    public void getEtudiant() throws Exception{
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole","root","");
            if (conn != null) {
                String query = "SELECT * FROM etudiants WHERE numFiliere = ?";
                PreparedStatement preparedStatement = conn.prepareStatement(query);
                preparedStatement.setInt(1,this.numFiliere);
                ResultSet res = preparedStatement.executeQuery();
                while(res.next()){
                    System.out.println("Nom : " + res.getString("prenomEtu") + " Prenom : " + res.getString("nomEtu"));
                }
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void addEtudiant(Etudiant etudiant){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole","root","");
            if (conn != null) {
                String query = "INSERT INTO etudiants VALUES (?,?,?,?)";
                PreparedStatement preparedStatement = conn.prepareStatement(query);
                preparedStatement.setInt(1,etudiant.idEtu);
                preparedStatement.setString(2,etudiant.prenomEtu);
                preparedStatement.setString(3,etudiant.nomEtu);
                preparedStatement.setInt(4,this.numFiliere);
                preparedStatement.executeUpdate();
                System.out.println("Etudiant ajouté !");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteEtudiant(Etudiant etudiant){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole","root","");
            if (conn != null) {
                String query = "DELETE FROM etudiants WHERE idEtu = ?";
                PreparedStatement preparedStatement = conn.prepareStatement(query);
                preparedStatement.setInt(1,etudiant.idEtu);
                preparedStatement.executeUpdate();
                System.out.println("Etudiant supprimé !");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }


}
