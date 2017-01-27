package com.coloniergames.superbill.locale;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public final class LocalizedTextStore {

    private static final Logger logger = LogManager.getLogger("LocalizedTextStore");
    
    private Locale associatedLocale;
    private HashMap<String, String> texts;

    public LocalizedTextStore(Locale loc) {
        this.associatedLocale = loc;
        this.texts = new HashMap<String, String>();
    }

    public void addEntry(String name, String value) {
        texts.put(name, value);
    }

    public String getLocalized(String name) {
        return texts.get(name);
    }

    public boolean isLocalized(String name) {
        return texts.containsKey(name);
    }

    public static LocalizedTextStore createFromLanguageFile(File languageFile) {

        logger.info ("createFromLanguageFile ({})", languageFile.getAbsolutePath());
        
        try {
            
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            
            Document languageXMLDocument = dBuilder.parse(languageFile);
            
                
        } catch (IOException ioException) {
            
            ioException.printStackTrace();
            throw new RuntimeException ("IOException in LocalizedTextStore.createFromLanguageFile ()");
            
        } catch (ParserConfigurationException pcException) {
            
            pcException.printStackTrace();
            throw new RuntimeException ("ParserConfigurationException in LocalizedTextStore.createFromLanguageFile ()");
        } catch (SAXException saxException) {
            
            saxException.printStackTrace();
            throw new RuntimeException ("SAXException in LocalizedTextStore.createFromLanguageFile ()");
            
        }
        
        return null;

    }

}
