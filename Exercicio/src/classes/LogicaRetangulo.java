/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import objetos.Retangulo;

/**
 *
 * @author vinicius tarcisio
 */
public class LogicaRetangulo {
    public Retangulo somarArea(Retangulo q){
        q.setArea(q.getA() * q.getB());
        return q;
    }
}
