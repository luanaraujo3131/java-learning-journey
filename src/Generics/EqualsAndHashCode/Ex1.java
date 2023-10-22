package Generics.EqualsAndHashCode;

public class Ex1 {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Luan Araújo", "luanaraujo3131@icloud.com", "894.342.782-52");
        Cliente clienteTest = new Cliente("Luan Araújo", "luanaraujo3131@icloud.com", "894.342.782-52");
        Cliente cliente2 = new Cliente("Diana Prince", "wonderwoman1984@gmail.com", "015.452.354-45");

        System.out.println(cliente1.hashCode());
        System.out.println(clienteTest.hashCode());
        System.out.println(cliente2.hashCode());
        System.out.println(cliente1.equals(clienteTest));//true
        System.out.println(cliente1 == clienteTest);//False, pois mesmo com o conteúdo igual, esses objetos estão em lugares diferentes na mémoria.
        System.out.println(cliente1.equals(cliente2));//false
    }
}

class Cliente{

    String name;
    String email;
    String CPF;

    public Cliente(String name, String email, String CPF){
        this.name = name;
        this.email = email;
        if(!cpfValidator(CPF))
            throw new IllegalArgumentException("CPF must have 14 characters: ***.***.***-**");
        this.CPF = CPF;    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF(){
        return CPF;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    //Métodos gerados automáticamente
    //Se o nome, email e o CPF forem iguais, retorna true: é o mesmo cliente.
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((CPF == null) ? 0 : CPF.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (CPF == null) {
            if (other.CPF != null)
                return false;
        } else if (!CPF.equals(other.CPF))
            return false;
        return true;
    }

    private boolean cpfValidator(String cpf){
        //REGEX
        return cpf != null && cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
    }
}
