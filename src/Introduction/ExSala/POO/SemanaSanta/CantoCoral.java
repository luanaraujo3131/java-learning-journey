/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Heranca.SemanaSanta;

import POO.Heranca.FestaJunina.Canto;

/**
 *
 * @author alexh
 */
public class CantoCoral extends Canto {
    void metodoQualquer() {
        Canto obj = new Canto();
        obj.metodoParaTodos();
       // obj.metodoParaOsFilhos();
        //obj.metodoParaPoucos();
        //obj.metodoEgoista();
        
        metodoParaTodos();
        metodoParaOsFilhos();
       // metodoParaPoucos();
        //metodoEgoista();
    }
    
}
