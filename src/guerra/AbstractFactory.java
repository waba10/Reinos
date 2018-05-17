/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guerra;

import Elfos.Elfo;
import Orcos.Orco;

/**
 *
 * @author HP PC
 */
public interface AbstractFactory {
    Elfo getElfos(String type);
    Orco getOrcos(String type);
}
