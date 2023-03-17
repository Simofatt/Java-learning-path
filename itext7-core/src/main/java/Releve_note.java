







//ALL THE BIBLIO THAT WE'LL NEED
import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfWriter ;  
import com.itextpdf.kernel.pdf.PdfDocument;  
import com.itextpdf.layout.Document ;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph ;
import com.itextpdf.layout.element.Table;  


public class Releve_note {
	public static void main (String[] args )throws FileNotFoundException, MalformedURLException  {
	
		//The variable that we'll use to fill the document
		String sexe = "Monsieur " ; 
		String nom ="Mohamed Fatehi Alhabib" ; 
		String cin ="BE911812" ; 
		String code_natio = " R134480330" ; 
		String c_apoge ="18044080" ; 
		String date_naiss ="15 Mars 2020" ;
		String annee_actuel = " 2022/2023" ; 
		String annee_etude ="2eme Annee du Cycle Ingenieur: Genie Informatique" ; 
		String date_attestation = " 4 decembre 2022" ; 
		String admis ="Validé" ; 
		String Resultat_total = " 12/20" ; 
	
		String matiere1 = "Algebre1 " ; 
		String matiere2 = "Analyse " ; 
		String matiere3 ="Mecanique" ; 
		String matiere4 ="Informatique" ;
		String matiere5 =" langues " ; 
		
		String note_matiere1 ="10/20" ; 
		String note_matiere2 ="15/20" ; 
		String note_matiere3 ="13/20" ; 
		String note_matiere4 ="10/20" ; 
		String note_matiere5 ="15/20" ; 
		
		String Resultat_matiere1 ="Validé" ; 
		String Resultat_matiere2 ="Validé" ; 
		String Resultat_matiere3 ="Validé" ; 
		String Resultat_matiere4 ="Validé" ; 
		String Resultat_matiere5 ="Validé" ; 
		
		String Session = " S1 2019/2020" ; 
		//Creating a path to the pdf 
		String path ="C:\\\\Users\\\\Simofatt\\\\Desktop\\\\Releve_note.pdf " ; 
		String imagePath ="C:\\Users\\Simofatt\\Downloads\\Logo.png" ; 
		String imagePath2 ="C:\\Users\\Simofatt\\Downloads\\Signature .jpg" ; 
		String imagePath3 = "C:\\Users\\Simofatt\\Downloads\\arabe_en_tete.jpg" ; 
		
		//Creating a PdfWriter object ,
		//which will contain the path to the  pdf 
		//+ Creating a pdfDocument object
		//that have as a parameter the 
		//pdfWriter Object
		//+creating a document object that'll
		//contains the pdf 
		//+	//The size of the pdf 
		PdfWriter pdfWriter = new PdfWriter(path) ; 
		PdfDocument pdfDocument = new PdfDocument(pdfWriter) ; 
		Document document = new Document (pdfDocument ) ;
		pdfDocument.setDefaultPageSize(PageSize.A4) ;
		
		//Creating a table that contain 2 columns
		float two_col150 = 390f; 
		float columnWidth [] = {two_col150} ; 
		
		//CUSTOM BORDER :
		SolidBorder gb = new SolidBorder(Color.BLACK ,1f/2f) ; 
		
		 //IMAGE LOGO : 
		ImageData imageData = ImageDataFactory.create(imagePath) ;
		Image image = new Image(imageData) ;  
		 
		float x =pdfDocument.getDefaultPageSize().getWidth()/2 ; 
		float y =pdfDocument.getDefaultPageSize().getHeight() /2; 
		
		image.setFixedPosition(x-70,y+280); 
		image.setHeight(112) ; 
	    document.add(image ) ; 
	    
	    //IMAGE ARABE : 
		ImageData imageData3 = ImageDataFactory.create(imagePath3) ;
		Image image3 = new Image(imageData3) ;  
		 
		float a =pdfDocument.getDefaultPageSize().getWidth()/2 ; 
		float b =pdfDocument.getDefaultPageSize().getHeight() /2; 
		
		image3.setFixedPosition(a+90,b+285); 
		image3.setHeight(112) ; 
		image3.setOpacity((float ) 1) ; 
	    document.add(image3 ) ; 
	    
	    
	    
	    //IMAGE SIGNATURE: 
	    ImageData imageData2 = ImageDataFactory.create(imagePath2) ;
		Image image2 = new Image(imageData2) ;  
		 
		float z=pdfDocument.getDefaultPageSize().getWidth()/2 ; 
		float t =pdfDocument.getDefaultPageSize().getHeight() /2; 
		
		image2.setFixedPosition(z-270,t-380); 
		image2.setHeight(80) ;
		image2.setWidth(300) ;
		
	    document.add(image2) ; 
		
		//HEADER OF THE DOC : 
		document.add(new Paragraph("ROYAUME DU MAROC \r\n"
				+ "Université Abdelmalek Essaadi \r\n"
				+ "Ecole Nationale des Sciences \r\n"
				+ "Appliquées \r\n"
				+ "Tetouan \r\n"
				+ "Service des Affaires Estudiantines                \r\n \r\n"  ).setFontSize(10F));
		
		document.add(new Paragraph(""  ).setFontSize(10F));
		
		//Creating a table object that have an array as a parameter
		//And adding a new cell to the array so i can write on it
		Table table = new Table (columnWidth) ;
		table.setMarginLeft(90f) ; 
		table.addCell(new Cell().add( " RELEVE DE NOTES ET RESULTATS").setBold().setBorder(gb).setFontSize(20F).setPaddingLeft(20)) ; 
		document.add(table) ; 
		
		
		//BODY OF THE DOC :
		document.add(new Paragraph ( "\r\n"+nom+    "\r\n" ).setBold() ) ; 
	    document.add(new Paragraph("Numéro de la carte d’identité nationale : " +cin+        "\n"
				+ "Code national de l’étudiant :   " +code_natio+     " \n"
				+ "N°etudiant :   " +c_apoge+         "\n"
				+ "Ne le :   "+date_naiss+                      "\n"
				+ "Inscrit :   "+annee_actuel+ " \r\n"
				+ "\n"
				+ "A obtenue les notes suivantes :" +"\r\n"
				+"\n" ).setFontSize(10F)) ; 
	          
	          
	          Table table2 = new Table (4) ;
	          table2.addCell(new Cell().add(" " +"Modules ").setFontSize(10F)) ; 
	          table2.addCell(new Cell().add(" " +"Note/Baréme").setFontSize(10F)) ; 
	          table2.addCell(new Cell().add(" " +"Résultat ").setFontSize(10F)) ; 
	          table2.addCell(new Cell().add(" " +"Session").setFontSize(10F)) ; 
	          table2.addCell(new Cell().add(" "+matiere1).setFontSize(10F)) ; 
	          table2.addCell(new Cell().add(" "+note_matiere1).setFontSize(10F)) ; 
	          table2.addCell(new Cell().add(" "+Resultat_matiere1).setFontSize(10F)) ; 
	          table2.addCell(new Cell().add(" "+Session).setFontSize(10F)) ; 
	          table2.addCell(new Cell().add(" "+matiere2).setFontSize(10F)) ; 
	          table2.addCell(new Cell().add(" "+note_matiere2).setFontSize(10F)) ; 
	          table2.addCell(new Cell().add(" "+Resultat_matiere2).setFontSize(10F)) ; 
	          table2.addCell(new Cell().add(" "+Session).setFontSize(10F)) ; 
	          table2.addCell(new Cell().add(" "+matiere3).setFontSize(10F)) ; 
	          table2.addCell(new Cell().add(" "+note_matiere3).setFontSize(10F)) ; 
	          table2.addCell(new Cell().add(" "+Resultat_matiere3).setFontSize(10F)) ; 
	          table2.addCell(new Cell().add(" "+Session).setFontSize(10F)) ; 
	          table2.addCell(new Cell().add(" "+matiere4).setFontSize(10F)) ; 
	          table2.addCell(new Cell().add(" "+note_matiere4).setFontSize(10F)) ; 
	          table2.addCell(new Cell().add(" "+Resultat_matiere4).setFontSize(10F)) ; 
	          table2.addCell(new Cell().add(" "+Session).setFontSize(10F)) ; 
	          table2.addCell(new Cell().add(" "+matiere5).setFontSize(10F)) ; 
	          table2.addCell(new Cell().add(" "+note_matiere5).setFontSize(10F)) ; 
	          table2.addCell(new Cell().add(" "+Resultat_matiere5).setFontSize(10F)) ; 
	          table2.addCell(new Cell().add(" "+Session).setFontSize(10F)) ; 
	          document.add(table2); 
	
	          document.add(new Paragraph ("Résultat d'admission session 1 :        "+Resultat_total+"         " +admis ) .setFontSize(10F)) ; 
	         
	          //FOOTER OF THE DOC :
	          Table table3 = new Table (1) ;
	          table3.addCell(new Cell().add("\n \n \n \n\n\n\n\n\n\n\n\n Fait à TETOUAN, le "+date_attestation).setBorder(Border.NO_BORDER).setFontSize(10F).setPaddingLeft(10)) ;
	          document.add(table3); 
	          
	          
	          Table table4 = new Table (1) ;
	          table4.addCell(new Cell().add("Directeur de l'Ecole Nationale des Sciences Appliquées").setBorder(Border.NO_BORDER).setFontSize(10F)) ;
	          document.add(table4); 
		
		//Closing the document 
		document.close() ; 
		//Making sure the code got executed 
		System.out.println("hello") ; 
	
	
	
	
	}
}


