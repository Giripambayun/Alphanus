import java.util.Scanner;
class Perwalian extends Dosen { 
    public String a, tanya,ai,blm,add;
    public double ip;
    public int dosen;
    public void mk(){
        System.out.println("==============================================================");
        System.out.println("=======perwalian Teknik informatika 15A semester lima (5)=====");
        System.out.println("==============================================================");
        System.out.println("mata kuliah yang akan di hadapi:");
        System.out.println("1.Intelegensi buatan");
        System.out.println("2.OOP1");
        System.out.println("3.OOAD");
        System.out.println("4.Web 2");
        System.out.println("5.Teori Graph");
        System.out.println("6.Teknik Kompilasi");
        System.out.println("7.Interaksi Manusia dan Komputer");        
        Oop();
        Ai();
        Ooad();
        Web2();
        Graph();
        Kompilasi();
        Imk();
    }
    public void Tbh(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Ip semester sebelumya:");
        ip=scan.nextDouble();
        if(ip<3.0){
            System.out.println("Maaf anda tidak diperbolehkan menambah mata kuliah lagi di semester ini");
            System.out.println("Anda hanya di perbolehkan mengambil mata kuliah yang belum tuntas saja");
            System.out.println("apakah anda punya mata kuliah yang belum lulus?(ya/tidak):");   
            Scanner scan = new Scanner(System.in);
            tanya=scan.next();
                if(tanya.equals("ya")){
                    System.out.println("Masukan matakuliah yang belum lulus:");
                    Scanner scann = new Scanner(System.in);
                    blm=scann.nextLine();
                    System.out.println("==============Dosen Pengampu===============");
                    System.out.println("1.Susi Pujiastuti.ST");
                    System.out.println("2.Ignasius Jonan.ST");
                    System.out.println("Pilih Dosen:");
                    dosen=scann.nextInt();        
                    switch(dosen)
                    {
                        case 1:
                            ai="Susi Pujiastuti.ST";
                        break;
                        case 2:
                             ai="Ignasius Jonan.ST";
                        break;
                    }
                }
                else if(quest.equals("tidak")){
                    System.out.println("tidak");
                }
        }
            else{
                Scanner scannn = new Scanner(System.in);
                System.out.println("apakah anda ingin matakuliah tambahan?:");
                add=scannn.nextLine();
                if(add.equals("ya")){
                    System.out.println("==============Dosen Pengampu===============");
                    System.out.println("1.Susi Pujiastuti.ST");
                    System.out.println("2.Ignasius Jonan.ST");
                    System.out.println("Pilih Dosen:");
                    dosen=scannn.nextInt();        
                    switch(dosen)
                    {
                        case 1:
                            ai="Susi Pujiastuti.ST";
                        break;
                        case 2:
                             ai="Ignasius Jonan.ST";
                        break;
                    }
                }
                else if(add.equals("tidak")){
                    System.out.println("tidak");
                }
            }
}