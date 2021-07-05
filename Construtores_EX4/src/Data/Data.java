/*
Crie uma classe Data com as seguintes capacidades:
Gerar saída da data em múltiplos formatos, como: DD/MM/AAAA; Agosto 08, 2017; DDD AAAA;
Utilize construtores sobrecarregados para criar objetos Data inicializados com datas no formato definido em cima.

No primeiro caso, o construtor deve receber 3 valores inteiros.
No segundo caso, deve receber uma String e 2 valores inteiros.
No terceiro caso deve receber 2 valores inteiros, o primeiro representando o número de dias no ano.
Faça uma classe principal que implemente o método main que deverá instanciar 2 objetos de cada formato e depois imprimir cada um deles.

 */
package Data;

/**
 *
 * @author roberto.leite
 */
public class Data {
    
    private int dia;
    private int mes;
    private int ano;
    private String mesTexto;
    
    public Data(int dia, int mes, int ano){
        
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
       
    }

    public Data(int dia, String mesTexto, int ano) {
        this.dia = dia;
        this.mesTexto = mesTexto;
        this.ano = ano;
        
    }

    public Data(int mes, int ano) {
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String getMesTexto() {
        return mesTexto;
    }
    
    
    
    public void mostraData1(int dia, int mes, int ano){
        
        if(dia>=1 && dia<=31 && mes >= 1 && mes<=12){
            if((mes==4 &&  dia==31) || (mes ==6 && dia ==31) || (mes==9 && dia==31) || (mes==11 && dia==31) ){
               System.out.println("Data invalida");
               
            }
            else{
                System.out.println(dia + "/" + mes + "/" + ano);
            }
        }
        else{
            System.out.println("Data invalida");
        }
        
        
    }
    
   public void mostrData2(String mesTexto, int dia, int ano){
       
       if( (dia>=1 && dia <=31) && (mesTexto!= "Janeiro" || mesTexto!="Fevereiro" || mesTexto!="Marco" || mesTexto!="Abril" || mesTexto!="Maio" || mesTexto!="Junho" || mesTexto!="Julho" || mesTexto!="Agosto" || mesTexto!="Setembro" || mesTexto!="Outubro" || mesTexto!="Novembro" || mesTexto!="Dezembro" ) ){
            System.out.println("PASSOU AQUI");
           if( (dia==31 && mesTexto!="Abril") || (dia ==31 && mesTexto!="Junho") || (dia==31 &&mesTexto!="Setembro") || (dia==31 && mesTexto!="Novembro" ) ){
               System.out.println("Data invalida");
           
            }
           else{
               System.out.print(mesTexto+ " " + dia + "," + ano);
           
           
           }
             
        }
       else{
           System.out.println("Data invalida");
       
       }
       
    }
       
       
}
    


