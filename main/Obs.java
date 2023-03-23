package main;

public class Obs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Academician academician = new Academician();
		 academician.setName("Muhammed");
		 academician.setSoyisim("Şen");
		 academician.setMail("muhammed@firat.edu.tr");
		 academician.setPasswod(289382);
		 
		 academician.sicilNo=3212901;
		 academician.fakülte="Mühendislik Fakültesi";
		 academician.bölüm="Bilgisayar Mühendisliği";
		 academician.uzmanlıkAlanı="Yapay Zeka";
		 
		 System.out.println("Akademisyen Bilgileri:");
		 System.out.println();
		 System.out.println("Adı: "+academician.getName());
		 System.out.println("Soyadı: "+academician.getSoyisim());
		 System.out.println("Mail: "+academician.getMail());
		 System.out.println("Şifre: "+academician.getPasswod());
		 System.out.println("Sicil No: "+academician.sicilNo);
		 System.out.println("Fakülte: "+academician.fakülte);
		 System.out.println("Bölüm: "+academician.bölüm);
		 System.out.println("Uzmanlık Alanı: "+academician.uzmanlıkAlanı);
		 
		 System.out.println();
		 System.out.println("/////////////////////////////////////////////////////");
		 System.out.println();
		 System.out.println("Öğrenci Bilgileri:");
		 System.out.println();
		 
		 Student student = new Student();
		 student.setName("Ömer");
		 student.setSoyisim("Kaplan");
		 student.setMail("ömer@firat.edu.tr");
		 student.setPasswod(323234);
		 student.okulNo=12931283;
		 student.fakülte="Mühendislik Fakültesi";
		 student.bölüm="Yazılım Mühendisliği";
		 student.ders ="Algoritma Analizi";
		 
		 System.out.println("Adı: "+student.getName());
		 System.out.println("Soyadı: "+student.getSoyisim());
		 System.out.println("Mail: "+student.getMail());
		 System.out.println("Şifre: "+student.getPasswod());
		 System.out.println("Sicil No: "+student.okulNo);
		 System.out.println("Fakülte: "+student.fakülte);
		 System.out.println("Bölüm: "+student.bölüm);
		 System.out.println("Uzmanlık Alanı: "+student.ders);
		 
		
		 
		 
		 

	}

}
