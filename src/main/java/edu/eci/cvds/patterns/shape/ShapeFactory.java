/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.patterns.shape;
import  edu.eci.cvds.patterns.shape.concrete.Triangle;
import edu.eci.cvds.patterns.shape.concrete.Hexagon;
import edu.eci.cvds.patterns.shape.concrete.Quadrilateral;
import edu.eci.cvds.patterns.shape.concrete.Pentagon;
/**
 *
 * @author daniel.gomez-su
 */
public class ShapeFactory {
   public Shape create(RegularShapeType type ){
       Shape fig;
       switch(type){
           case Triangle:
               fig =new Triangle();
               break;
           
           case Quadrilateral:
               fig =new Quadrilateral();
               break;
           case Pentagon:
               fig = new Pentagon();
               break;
            case Hexagon:
               fig = new Hexagon();
               break;
            default : 
                fig =null;
       }
       return fig;
   }
}
