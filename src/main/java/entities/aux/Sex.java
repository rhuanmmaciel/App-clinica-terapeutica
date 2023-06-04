package entities.aux;

public enum Sex {
    MALE{
        @Override
        public String toString(){
            return "Masculino";
        }
    },

    FEMALE{
        @Override
        public String toString(){
            return "Feminino";
        }
    };
}
