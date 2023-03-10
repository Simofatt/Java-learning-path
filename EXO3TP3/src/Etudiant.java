import java.sql.*;

public class Etudiant {
    int idEtu;
    String prenomEtu;
    String nomEtu;
    int numFiliere;

    public addEtudiant(int idEtu, String prenomEtu, String nomEtu, int numFiliere){
        this.idEtu = idEtu;
        this.prenomEtu = prenomEtu;
        this.nomEtu = nomEtu;
        this.numFiliere = numFiliere;
    }
    public void updatePrenom(String new_prenom) throws  Exception{
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole","root","");
            if (conn != null) {
                String query = "UPDATE etudiants SET prenomEtu=? WHERE idEtu = ?";
                PreparedStatement preparedStatement = conn.prepareStatement(query);
                preparedStatement.setString(1,new_prenom);
                preparedStatement.setInt(2,this.idEtu);
                preparedStatement.executeUpdate();
                System.out.println("Prenom modifié !");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void getAllEtudiants() throws Exception{
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole","root","");
            if (conn != null) {
                String query = "SELECT * FROM etudiants";
                PreparedStatement preparedStatement = conn.prepareStatement(query);
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


}
