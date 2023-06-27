/*
* Quando criamos os métodos getters e setter, o get, serve para acessarmos o atributo, por exemplo,
* se quisermos mostrar o atributo no System.out.println, devemos colocar o método get, não só o nome
* do atributo, por exemplo, getIdade, não apena "idade"; Já o set, serve para modificar os atributos
* sem mexerr diretamente nele, por exemplo, nesse caso, para colocar os nomes e valores nos atributos,
* eu coloquei o "setName", "setEmail", etc. e não o nome dos atributos em sim.
* */

package POO.Encapsulamento;

public class Account {
    public static void main(String[] args) {
        AccountData acc = new AccountData();
        acc.setAcc_no(2365478);
        acc.setName("Luan Araujo");
        acc.setEmail("luanaraujo3131@icloud.com");
        acc.setAmount(100000f);
        System.out.println(
                acc.getAcc_no()+ " " +acc.getName()+ " " +acc.getEmail()+ " " +acc.getAmount());
    }
}
class AccountData {
    private int acc_no;
    private String name, email;
    private float amount;

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
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

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}