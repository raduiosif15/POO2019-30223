package javasmmr.zoowsome.repositories;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.*;
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

public class AnimalRepository extends EntityRepository<Animal> {

    public static final String XML_FILENAME = "Animals.xml";

    public AnimalRepository(){
        super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);

    }

    @Override
    protected Animal getEntityFromXmlElement(Element element) {
        String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();

        switch (discriminant){
            case Constants.Animal.Insect.Butterfly:
                Animal butterfly = new Butterfly();
                butterfly.decodeFromXml(element);
                return butterfly;

            case Constants.Animal.Insect.Cockroach:
                Animal cockroach = new Cockroach();
                cockroach.decodeFromXml(element);
                return cockroach;

            case Constants.Animal.Insect.Spider:
                Animal spider = new Spider();
                spider.decodeFromXml(element);
                return spider;

            case Constants.Animal.Aquatic.Carp:
                Animal carp = new Carp();
                carp.decodeFromXml(element);
                return carp;

            case Constants.Animal.Aquatic.Dolphin:
                Animal dolphin = new Dolphin();
                dolphin.decodeFromXml(element);
                return dolphin;

            case Constants.Animal.Aquatic.Whale:
                Animal whale = new Whale();
                whale.decodeFromXml(element);
                return whale;

            case Constants.Animal.Bird.Dove:
                Animal dove = new Dove();
                dove.decodeFromXml(element);
                return dove;

            case Constants.Animal.Bird.Hawk:
                Animal hawk = new Hawk();
                hawk.decodeFromXml(element);
                return hawk;

            case Constants.Animal.Bird.Hen:
                Animal hen = new Hen();
                hen.decodeFromXml(element);
                return hen;

            case Constants.Animal.Mammal.Cow:
                Animal cow = new Cow();
                cow.decodeFromXml(element);
                return cow;

            case Constants.Animal.Mammal.Monkey:
                Animal monkey = new Monkey();
                monkey.decodeFromXml(element);
                return monkey;

            case Constants.Animal.Mammal.Tiger:
                Animal tiger = new Tiger();
                tiger.decodeFromXml(element);
                return tiger;

            case Constants.Animal.Reptile.Crocodile:
                Animal crocodile = new Crocodile();
                crocodile.decodeFromXml(element);
                return crocodile;

            case Constants.Animal.Reptile.Snake:
                Animal snake = new Snake();
                snake.decodeFromXml(element);
                return snake;

            case Constants.Animal.Reptile.Turtle:
                Animal turtle = new Turtle();
                turtle.decodeFromXml(element);
                return turtle;

            default:
                break;

        }

        return null;
    }
}