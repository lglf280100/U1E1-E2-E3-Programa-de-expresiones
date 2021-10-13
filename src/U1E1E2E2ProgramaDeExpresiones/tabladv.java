package U1E1E2E2ProgramaDeExpresiones;

public class tabladv {
    public void tabladv() {
        
        //Entrada de datos
        System.out.println("Resuelve: [(p->q)^p]->q");
        String p[]={"v","v","f","f"},q[]={"v","f","v","f"};
        String lg[]=new String[4];
        //ciclo for para mandar a retornar las variables
        for (int i=0; i< lg.length; i++) {
            if(p[i].equals("v")&&q[i].equals("f")) {
                lg[i]="f";
            }else{
                lg[i]="v";
            }
            System.out.println("Resultado aux: "+lg[i]);
        }
        for (int i=0; i< lg.length; i++) {
            if(lg[i].equals("v")&&q[i].equals("v")) {
                lg[i]="v";
            }else{
                lg[i]="f";
            }
            System.out.println("Resultado aux2: "+lg[i]);
        }
        for (int i=0; i< lg.length; i++) {
            if(lg[i].equals("v")&&q[i].equals("f")) {
                lg[i]="f";
            }else{
                lg[i]="v";
            }
            System.out.println("Resultado final de la expresión: "+lg[i]);
        }
    }
}

