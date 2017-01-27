/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coloniergames.superbill;

import javafx.application.Application;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author tthe
 */
public class Superbill extends Application {
    
    private static final Logger logger = LogManager.getLogger("main");
    
    @Override
    public void start(Stage primaryStage) {
        
        logger.info ("start ()");
        
        primaryStage.setTitle("SuperBill - Your favourite billing application!");
        
        logger.info ("End of start ()");
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        logger.info("Logger initialized, calling launch (args)");
        
        launch(args);
    }
    
}
