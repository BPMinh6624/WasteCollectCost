/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author tuanh
 */
import Repository.WasteCollectionRepository;
import java.util.ArrayList;
import java.util.List;


public class WasteCollection {
    List<Integer> lt;
    WasteCollectionRepository program;
    public WasteCollection() {
        lt = new ArrayList<Integer>();
        program = new WasteCollectionRepository();
    }

    public void run() {
        program.display(lt);
    }
}

