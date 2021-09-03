import java.util.Calendar;

public class Main {
    /*
    public static void main(String[] args) {
        //Producto
        Productos productos =new Productos("12345","teclado");
        System.out.println(productos);

        //Alquilable
        Alquilable alquilable=new Alquilable("12345","MONITOR",10);
        System.out.println(alquilable);

        //Tecnologico
        Empresa empresa=new Empresa("Dell","america",1234);
        Tecnologico tecnologico=new Tecnologico("12345","Vostro","Italia", Calendar.getInstance().getTime(),empresa);
        System.out.println(tecnologico);

        //Monitor
        Monitores monitores=new Monitores("12345","dell",122,"FULL");
        System.out.println(monitores);

        //CPU
        Empresa toshiba=new Empresa("TOSHIBA","juan de la roza ",1234);
        CPU cpu=new CPU("1234","ITALIA",Calendar.getInstance().getTime(),toshiba,"dell",254);
        System.out.println(cpu);
    }


    //POLIMORFISMO
    Productos producto = new Productos("G120","Genius G120 + ");
    Productos lj750 = new Impresoras("lj758","Canon Laserjet 758",30);
    //System.out.println(lj750);
    Productos s200 = new Monitores("s200","Samsung s200 plus",15,"FULL HD");
    //System.out.println(s200);
    Productos n500 = new DiscoDuro("n500","Maxtor n500",10,500);
    //System.out.println(n500);

    Impresoras impresora = (Impresoras) lj750;
    //System.out.println(impresora);
    Monitores monitor = (Monitores) s200;
    //System.out.println(monitor);
    DiscoDuro discoDuro = (DiscoDuro) n500;
    //System.out.println(discoDuro);

       // System.out.println("-------------------------- REALIZADO --------------------------");

    Productos[] Productos= new Productos[3];
    Productos[0] = Impresoras;
    Productos[1] = Monitores;
    Productos[2] = DiscoDuro;

        for (int i = 0; i < Productos.println;i++){
        System.out.println(Productos[i]);
    }
    */
     Monitores lg180= new Monitores("lg180","monitores",10,"HD");
     lg180.reset();

     DiscoDuro s1000=new DiscoDuro("s1000","Samsung",10,150);
     s1000.reset();

}
