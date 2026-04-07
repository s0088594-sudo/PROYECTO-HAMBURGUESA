package y;

public class hamburguesas {

}

    public static void main(String[] args) {
        hamburguesa cliente1 = new hamburguesa("normal", "cerdo", "doble crema", "una porcion", "una porcion",
                "tomate");
        hamburguesa cliente2 = new hamburguesa("normal", "pollo", "americano", "una porcion", "sin", "rosada");

        hamburguesa cliente3 = new hamburguesa();
        cliente3.setpan("integral");
        cliente3.setcarne("res");
        cliente3.setqueso("americano");
        cliente3.setlechuga("doble porcion");
        cliente3.settomate("una porcion");
        cliente3.setsalsa("BBQ");

        ArrayList<hamburguesa> hamburguesa = new ArrayList<>();
        hamburguesa.add(cliente1);
        hamburguesa.add(cliente2);
        hamburguesa.add(cliente3);

        for (hamburguesa cliente : hamburguesa) {
            System.out.println(cliente.menu());
            System.out.println("Pan: " + cliente.getpan());
            System.out.println("Carne: " + cliente.getcarne());
            System.out.println("Queso: " + cliente.getqueso());
            System.out.println("Lechuga: " + cliente.getlechuga());
            System.out.println("Tomate: " + cliente.gettomate());
            System.out.println("Salsa: " + cliente.getsalsa());
            System.out.println("----------------------------------");

        }

    }

}


                
