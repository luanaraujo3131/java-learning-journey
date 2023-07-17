/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Heranca.FestaJunina;

/**
 *
 * @author alexh
 */
public class Canto {
    public void metodoParaTodos() {
    }
    protected void metodoParaOsFilhos() {
    }
    void metodoParaPoucos() {
    }
    private void metodoEgoista() {
    }
    void metodoQualquer() {
        metodoParaTodos();
        metodoParaOsFilhos();
        metodoParaPoucos();
        metodoEgoista();
    }
}
