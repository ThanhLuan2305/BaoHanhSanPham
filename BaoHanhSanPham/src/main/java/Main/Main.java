/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import View.LoginForm;
import View.MainForm;
import View.pnlCustomer;
import View.pnlCustomer_Product;
import View.pnlProduct;
import View.pnlWarrantyClaim;
import View.pnlWarrantyPolicy;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }
}
