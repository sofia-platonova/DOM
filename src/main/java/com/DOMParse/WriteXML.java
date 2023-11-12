package com.DOMParse;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import com.DOMParse.Entity.Employee;
import com.DOMParse.Service.AddEmployee;
import com.DOMParse.Service.DeleteEmployee;
import com.DOMParse.Service.ReadXML;
import com.DOMParse.Service.SearchXML;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class WriteXML {

    public static void main(String[] args) throws IOException, ParserConfigurationException, TransformerException, SAXException {


        boolean running = true;
        Scanner in =  new Scanner(System.in);
        while(running)
        {

            System.out.print("""
                      \nChoose the action (1-5)
                       1 - Add new employee.
                       2 - Delete employee.
                       3 - Print all information.
                       4 - Search employee.
                       5 - Exit.
                      Your choice: \
                    """);

            switch (in.nextInt())
            {
                case 1: AddEmployee.addEmployee(); break;
                case 2: DeleteEmployee.deleteEmployee(); break;
                case 3: ReadXML.readXML();break;
                case 4: SearchXML.searchXML();  break;
                case 5: running=false; break;
            }


        }


    }


}
