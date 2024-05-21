package SobreEscritaCarro;

public class Moto extends Veiculo {

        public Moto(Integer codigo, String marca, String modelo, TipoVeiculo tipoVeiculo) {
            super(marca, modelo, tipoVeiculo);
        }

        void acelerar() {
            setVelocidade(getVelocidade() + 15);
        }

        void frear() {
            setVelocidade(Math.max(0, getVelocidade() - 7));
        }
         
        void virar() {
            System.out.println("Inclinando a moto para fazer uma curva...");
        }

        void empinar() {
            System.out.println("Empinando a moto...");
        }
    }

