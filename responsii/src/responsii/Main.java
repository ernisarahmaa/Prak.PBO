/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsii;

/**
 *
 * @author asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ViewMovie view = new ViewMovie();
        ModelMovie model = new ModelMovie();
        ControllerMovie controller = new ControllerMovie(model, view);
    }
    
}
