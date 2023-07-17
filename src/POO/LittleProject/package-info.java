package POO.LittleProject;

/**
 * Em um banco, para se cadastrar uma conta bancária, é preciso informar o número da conta, o nome do titular da
 * conta e um valor do deposito atual. Entretanto, esse deposito é opcional, ou seja, caso a pessoa, não tenha
 * dinheiro para depositar no momento, ela pode depositar depois.
 *
 * Criado, o número da conta não poderá mais ser alterado. Já o nome, pode.
 *
 * Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso
 * O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque feito, o banco cobra
 * uma taxa de R$2.00.
 * Nota: A conta pode ficar com um saldo negativo, caso o saldo não seja suficiente para que o saque e/ou pagamento
 * seja feito.
 */