package javasmmr.zoowsome.repositories;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class EmployeeRepository extends EntityRepository<Employee>{
    public static final String XML_FILENAME = "Employee.xml";

    public EmployeeRepository(){
        super(XML_FILENAME, Constants.XML_TAGS.EMPLOYEE);
    }

    @Override
    protected Employee getEntityFromXmlElement(Element element) {
        String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();

        switch (discriminant){
            case Constants.Employee.Caretaker:
                Employee caretaker = new Caretaker();
                caretaker.decodeFromXml(element);
                return caretaker;

            default:
                break;
        }

        return null;
    }
}