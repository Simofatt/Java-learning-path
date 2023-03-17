import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

public class ConventionStage {

	@SuppressWarnings("deprecation")
	public static void main (String[] args )throws FileNotFoundException, MalformedURLException  {
		
		//The variable that we'll use to fill the document
		String nom ="Mohamed Fatehi Alhabib" ; 
		String cycle= "Genie informatique " ;  
		String nom_societé = "SAFRAN NACELLES MOROCCO" ; 
		String adresse_societe = " Aéroport Mohamed V Technopole De Nouaceur Bp 80 - Casablanca" ; 
		String date_debut_stage ="20/06/2022" ;
		String date_fin_stage ="20/08/2022" ;
		String date_actuel = " 20/05/2022" ; 
		String nom_coordonnateur="DKHISSI IBTISSAM" ;
		
		//Creating a path to the pdf 
		String path ="C:\\\\Users\\\\Simofatt\\\\Desktop\\\\Convention_de_stage.pdf " ; 
		String imagePath ="C:\\Users\\Simofatt\\Downloads\\Logo.png" ; 
		String imagePath2 ="C:\\Users\\Simofatt\\Downloads\\Signature .jpg" ; 
		
		
		
		//Creating a PdfWriter object ,
		//which will contain the path to the  pdf 
		//+ Creating a pdfDocument object
		//that have as a parameter the 
		//pdfWriter Object
		//+creating a document object that'll
		//contains the pdf 
		//+The size of the pdf 
		//+ a custom border
		PdfWriter pdfWriter = new PdfWriter(path) ; 
		PdfDocument pdfDocument = new PdfDocument(pdfWriter) ; 
		Document document = new Document (pdfDocument ) ;
		pdfDocument.setDefaultPageSize(PageSize.A4) ;    
		SolidBorder gb = new SolidBorder(Color.BLACK ,1f/2f) ; 

		//Creating a table that contain 2 columns
		float two_col150  = 350f; 
		float columnWidth [] = {two_col150} ; 
		 //IMAGE LOGO : 
		ImageData imageData = ImageDataFactory.create(imagePath) ;
		Image image = new Image(imageData) ;  
		 
		float x =pdfDocument.getDefaultPageSize().getWidth()/2 ; 
		float y =pdfDocument.getDefaultPageSize().getHeight() /2; 
		
		image.setFixedPosition(x-70,y+280); 
		image.setHeight(112) ; 
	    document.add(image ) ; 
	    
		//HEADER OF THE DOC : 
		document.add(new Paragraph("ROYAUME DU MAROC \r\n"
				+ "Université Abdelmalek Essaadi \r\n"
				+ "Ecole Nationale des Sciences \r\n"
				+ "Appliquées \r\n"
				+ "Tetouan               \r\n \r\n"  ).setFontSize(10F));
		
		//Creating a table object that have an array as a parameter
		//And adding a new cell to the array so i can write on it
		//what i want 		
		Table table = new Table (columnWidth) ;
		table.setMarginLeft(80f) ; 
		table.addCell(new Cell().add( "CONVENTION DE STAGE  ").setBold().setFontSize(20F).setPaddingLeft(50).setBorder(gb)) ; 
		  document.add(table) ;
		  document.add(new Paragraph ("\n \n ENTRE \n \n").setPaddingLeft(230)) ;
		
		  document.add( new Paragraph (" L'Ecole Nationale des Sciences Appliquées, Université Abdelmalek Essaâdi - Tétouan B.P. 2222, Mhannech II, Tétouan , Maroc \n"
				+"Tél. +212 5 39 68 80 27 ; Fax. +212 39 99 46 24.   Web: https://ensa-tetouan.ac.ma \n\n " 
				+"	Représenté par le Professeur Mostafa STITOU en qualité de Directeur. ").setFontSize(10F));
		  
		  
		  document.add(new Paragraph ("Ci-aprés, dénommé l'Etablissement").setPaddingLeft(320).setFontSize(10F)) ;
		  document.add(new Paragraph ("ET").setPaddingLeft(230).setFontSize(10F)) ;
		  document.add(new Paragraph (  "La Société : "+nom_societé+ "\n"
		+	"Adresse : "+adresse_societe+"  \n"
		+"	Tél :..........................Email:................................... \n "	
		+"	Représentée par Monsieur...............................en qualité...............................................").setFontSize(10F)) ;
		
		
		  document.add(new Paragraph ("Ci-aprés dénommée l'ENTREPRISE " ).setPaddingLeft(320)); 
		
		  document.add(new Paragraph ("Article 1 : Engagement" ).setBold().setFontSize(10F));
		  document.add(new Paragraph ("L'ENTREPRISE accepte de recevoir à titre de stagiaire " +nom+ " étudiant(e) "
				+ "de la filière du Cycle Ingénieur"+cycle+"de I'ENSA de Tétouan, "
				+ "Université Abdelmalek Essaâdi (Tétouan), pour une période allant du " +date_debut_stage+ "au" +date_fin_stage ).setFontSize(10F));

		   document.add(new Paragraph ("En aucun cas, cette convention ne pourra autoriser les étudiants à s'absenter durant"
				+ " la période des contrôles ou des enseignements.").setFontSize(10F));
		
		   document.add(new Paragraph ("Article 2 : Objet" ).setBold().setFontSize(10F)) ;
		   document.add(new Paragraph ("Le stage aura pour objet essentiel d'assurer l'application pratique de l'enseignement donné par l'Etablissement, et ce, "
				+ "en organisant des visites sur les installations et en réalisant des études proposées par L'ENTREPRISE.").setFontSize(10F));
		
		   document.add(new Paragraph ("Article 3 : Encadrement et suivi" ).setBold().setFontSize(10F)) ; 
		   document.add(new Paragraph ("Pour accompagner le Stagiaire durant son stage, et ainsi instaurer une véritable collaboration L'ENTREPRISE/Stagiaire/Etablissement,"
								+ " L'ENTREPRISE désigne Mme/Mr......................encadrant(e) et parrain(e), pour superviser et assurer la qualité du travail fourni par le Stagiaire. \n"
								+"L'Etablissement désigne.........................en tant que tuteur qui procurera une assistance pédagogique" ).setFontSize(10F)) ; 
	
		   document.add(new Paragraph ("Article 4 : Programme:" ).setBold().setFontSize(10F));
		   document.add(new Paragraph ("Le thème du stage est :................................................................ "
				+"	programme a été défini conjointement par l'Etablissement, L'ENTREPRISE et le Stagiaire."
				+"Le contenu de ce programme doit permettre au Stagiaire une réflexion en relation avec les enseignements ou le projet de"
			    +" fin d'études qui s'inscrit dans le programme de formation de l'Etablissement.").setFontSize(10F));

	       document.add(new Paragraph ("Article 5 : Indemnité de stage" ).setBold().setFontSize(10F)) ;
	       document.add(new Paragraph ("Au cours du stage, l'étudiant ne pourra prétendre à aucun salaire de la part de L'ENTREPRISE. \n"
				 	    +"Cependant si l'ENTREPRISE et l'étudiant le conviennent, ce dernier pourra recevoir"
				 		+ " une indemnité forfaitaire de la part de l'ENTREPRISE des frais occasionnés par la mission confiée à l'étudiant.").setFontSize(10F));
		   document.add(new Paragraph ("Article 6 : Règlement" ).setBold().setFontSize(10F)) ; 
		   document.add(new Paragraph ("Pendant la durée du stage, le Stagiaire reste placé sous la responsabilité de l'Etablissement. \n"+""
				 		+ "Cependant, l'étudiant est tenu d'informer l'école dans un délai de 24h sur toute modification portant sur la convention déjà signée,"
				 		+ " sinon il en assumera toute sa responsabilité sur son non-respect de la convention signée par l'école." 
				 		+"Toutefois, le Stagiaire est soumis à la discipline et au règlement intérieur de L'ENTREPRISE.\r\n"
				 		+ "En cas de manquement, L'ENTREPRISE se réserve le droit de mettre fin au stage après en avoir\r\n").setFontSize(10F));
				 		
		    document.add(new Paragraph ("Article 7 : Confidentialité" ).setBold().setFontSize(10F)) ; 
		    document.add(new Paragraph ( "Le Stagiaire et l'ensemble des acteurs liés à son travail "
				 		+ "(l'administration de l'Etablissement, le parrain pédagogique ...) sont tenus au secret professionnel."
				 		+ " Ils s'engagent à ne pas diffuser les informations recueillies à des fins de publications, conférences, "
				 		+ "communications, sans raccord préalable de L'ENTREPRISE. Cette obligation demeure valable après l'expiration du "
				 		+ "stage.\n").setFontSize(10F));
		    document.add(new Paragraph ( "Article 8 : Assurance accident de travail Le stagiaire " ).setBold().setFontSize(10F)); 
			document.add(new Paragraph ( "stagiaire devra obligatoirement souscrire une assurance couvrant la Responsabilité Civile et Accident de"
						 		+ " Travail du Stagiaire, durant les stages et trajets effectués.\r\n"
						 		+ "En cas d'accident de travail survenant durant la période du stage, L'ENTREPRISE s'engage à faire parvenir immédiatement à "
						 		+ "l'Etablissement toutes les informations indispensables à la déclaration dudit accident.\r\n").setFontSize(10F));
						 		
             document.add(new Paragraph ( "Article 9: Evaluation de L'ENTREPRISE ").setBold().setFontSize(10F));
			 document.add(new Paragraph ( "Le stage accompli, le parrain établira un rapport d'appréciations"
								 		+ " générales sur le travail effectué et le comportement du Stagiaire durant son séjour chez L'ENTREPRISE.\r\n"
								 		+ "L'ENTREPRISE remettra au Stagiaire une attestation indiquant la nature et la durée des travaux effectués.\r\n").setFontSize(10F));
								 		
							
			 document.add(new Paragraph ( "Article 10 : Rapport de stage ").setBold().setFontSize(10F));
			 document.add(new Paragraph ( " A l'issue de chaque stage, le Stagiaire rédigera un rapport de stage faisant état de ses travaux et de son vécu"
										 		+ " au sein de L'ENTREPRISE. Ce rapport sera communiqué à L'ENTREPRISE et restera strictement confidentiel " ).setFontSize(10F)) ; 										 
			 document.add(new Paragraph ( " \r\nFait à Tétouan en quatre exemplaires, le "+date_actuel+" \n\n" ).setMarginLeft(120)) ;
												 
		

			//FOOTER : 
		      Table table3 = new Table (2) ;
	          table3.addCell(new Cell().add("Nom et signature du Stagiaire").setBorder(Border.NO_BORDER).setFontSize(10F).setPaddingLeft(20)) ;
	          table3.addCell(new Cell().add("Le Coordonnateur de la filière \r\n").setBorder(Border.NO_BORDER).setFontSize(10F).setPaddingLeft(90)) ;
	          table3.addCell(new Cell().add("  Safae BAZ").setBorder(Border.NO_BORDER).setFontSize(10F).setPaddingLeft(60)) ;
	          table3.addCell(new Cell().add( nom_coordonnateur+"\r\n ").setBorder(Border.NO_BORDER).setFontSize(10F).setPaddingLeft(95)) ;
	          document.add(table3); 
	          
	          
	          Table table4 = new Table (2) ;
	          table4.addCell(new Cell().add(" \r \n Signature et cachet de l.'Etablissement").setBorder(Border.NO_BORDER).setFontSize(10F).setPaddingLeft(20)) ;
	          table4.addCell(new Cell().add(" \r\nSignature et cachet de L'ENTREPRISE").setBorder(Border.NO_BORDER).setFontSize(10F).setPaddingLeft(20)) ;
	          document.add(table4); 
	          ImageData imageData2 = ImageDataFactory.create(imagePath2) ;
	  		  Image image2 = new Image(imageData2) ;  
	  		 
	  		  //SIGNATURE IMAGE :
	  		float z=pdfDocument.getDefaultPageSize().getWidth()/2 ; 
	  		float t =pdfDocument.getDefaultPageSize().getHeight() /2; 
	  		
	  		image2.setFixedPosition(z-250,t-400); 
	  		image2.setHeight(50) ;
	  		image2.setWidth(200) ; 
	  	    document.add(image2) ; 
		
	 
		
		//Closing the document 
		document.close() ; 
		//Making sure the code got executed 
		System.out.println("hello") ; 
	
	
	
	
	
}

	
}
