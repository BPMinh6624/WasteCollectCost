/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAccess.CostCalculateDAO;
import java.util.List;

/**
 *
 * @author tuanh
 */
public class WasteCollectionRepository implements IWasteCollectionRepository {
    @Override
    public void display(List<Integer> lt) {
        CostCalculateDAO.Instance().display(lt);
    }
}
