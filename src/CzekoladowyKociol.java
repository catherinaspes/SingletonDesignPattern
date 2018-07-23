public class CzekoladowyKociol {

    private boolean pusty;
    private boolean ugotowany;


    private CzekoladowyKociol() {
        pusty= true;
        ugotowany = false;

    }
//jeśli chcemy działać wielowątkowo, metoda powinna być synchronized
// lub można obiekt stworzyć deklarując go WCZEśNIEJ  w zmiennej unikalnaInstancja


    private static CzekoladowyKociol unikalnaInstancja;

    public static CzekoladowyKociol pobierzInstancje(){

       if(unikalnaInstancja == null){
           unikalnaInstancja = new CzekoladowyKociol();}

       return unikalnaInstancja;

    }

    public boolean jestPusty(){
        return pusty;
    }

    public boolean jestUgotowany(){
        return ugotowany;
    }

    public void napelniaj(){

        if(jestPusty() == true){
            pusty = false;
            ugotowany = false;
        }
    }
}
