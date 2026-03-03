/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic;

/**
 *
 * @author Ali's Laptop
 */
public class MyException extends Throwable {
    String message;

    public MyException() {
        message="Please fill all the fields below.";
    }
}
