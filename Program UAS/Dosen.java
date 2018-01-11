import java.util.Scanner;
class Dosen { 
    private int ai1, oop1, ooad1, imk1, kompilasi1, graph1, web21;
    private String ai, oop ,ooad, imk, kompilasi, graph, web2;

    public void setAi(String ai) {
        this.ai = ai;
    }

    public void setOop(String oop) {
        this.oop = oop;
    }

    public void setOoad(String ooad) {
        this.ooad = ooad;
    }
     public void setImk(String imk) {
        this.imk = imk;
    }

    public void setKompilasi(String kompilasi) {
        this.kompilasi = kompilasi;
    }

    public void setGraph(String graph) {
        this.graph = graph;
    }
    public void setWeb2(String web2) {
        this.web2 = web2;
    }
//getter
    public String getAi() {
        return ai;   
    }

    public String getOop() {
        return oop;
    }

    public String getWeb2() {
        return web2;
    }
    public String getGraph() {
        return graph;   
    }

    public String getKompilasi() {
        return kompilasi;
    }

    public String getImk() {
        return imk;
    }
    public String getOoad() {
        return ooad;
    }
    public void Ai(){
        System.out.println("==============Dosen Pengampu Intelegensi Buatan===============");
        System.out.println("1.Susi Pujiastuti.ST");
        System.out.println("2.Ignasius Jonan.ST");
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih Dosen:");
        ai1=scan.nextInt();        
        switch(ai1)
        {
            case 1:
                ai="Susi Pujiastuti.ST";
            break;
            case 2:
                 ai="Ignasius Jonan.ST";
            break;
        }
    } 
    public void Oop(){
        System.out.println("==============Dosen Pengampu OOP===============");
        System.out.println("1.Yuliana.ST");
        System.out.println("2.Usep Gunawan.ST");
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih Dosen:");
        oop1=scan.nextInt();
        switch(oop1)
        {
            case 1:
                oop="Yuliana.ST";
            break;
            case 2:
                 oop="Usep Gunawan.ST";
            break;
        }
    }
     public void Ooad(){
        System.out.println("==============Dosen Pengampu OOAD===============");
        System.out.println("1.Alan Nurjaelani.ST");
        System.out.println("2.Sandi Kurnia.ST");
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih Dosen:");
        ooad1=scan.nextInt();
          switch(ooad1)
        {
            case 1:
                ooad="Alan Nurjaelani.ST";
            break;
            case 2:
                 ooad="Sandi Kurnia.ST";
            break;
        }
    }
     public void Web2(){
       System.out.println("==============Dosen Pengampu web 2===============");
        System.out.println("1.Komarudin.ST");
        System.out.println("2.Sri Wahyuni.ST");
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih Dosen:");
        web21=scan.nextInt();
        switch(web21)
        {
            case 1:
                web2="Komarudin.ST";
            break;
            case 2:
                 web2="Sri Wahyuni.ST";
            break;
        }
    }
     public void Graph(){
        System.out.println("==============Dosen Pengampu Teori Graph===============");
        System.out.println("1.Bilal.ST");
        System.out.println("2.Ali Nusaepudin.ST");
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih Dosen:");
        graph1=scan.nextInt();
        switch(graph1)
        {
            case 1:
                graph="Bilal.ST";
            break;
            case 2:
                graph="Ali Nusaepudin.ST";
            break;
        }
    }
     public void Imk(){
        System.out.println("==============Dosen Pengampu Interaksi Manusia dan Komputer===============");
        System.out.println("1.Andri Hermawan.ST");
        System.out.println("2.Yudi Sudrajat.ST");
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih Dosen:");
        imk1=scan.nextInt();
        switch(imk1)
        {
            case 1:
                imk="Andri Hermawan.ST";
            break;
            case 2:
                imk="Yudi Sudrajat.ST";
            break;
        }
     }
     public void Kompilasi(){
        System.out.println("==============Dosen Pengampu Teknik Kompilasi===============");
        System.out.println("1.Senie Setyawati.ST");
        System.out.println("2.Tira.ST");
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih Dosen:");
        kompilasi1=scan.nextInt();
        switch(kompilasi1)
        {
            case 1:
                imk="Senie Setyawati.ST";
            break;
            case 2:
                imk="Tira.ST";
            break;
        }
     }
}