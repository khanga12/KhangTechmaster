/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki Thuat 88
 */
public interface IPlayable {
    public void playFootball();
    default void Moving()
    {
    System.out.println("iam moving!");
    }
    
    
}
