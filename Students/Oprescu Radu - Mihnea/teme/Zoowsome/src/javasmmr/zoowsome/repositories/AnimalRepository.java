package javasmmr.zoowsome.repositories;

import java.io.*;

import java.util.ArrayList;

import org.w3c.dom.Element;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.events.*;
import javax.xml.stream.*;

public class AnimalRepository {
	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() {
	
		public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		XMLEvent tab = eventFactory.createDTD("\t");
		// Create Start node
		StartElement sElement = eventFactory.createStartElement("", "", name);
		eventWriter.add(tab);
		eventWriter.add(sElement);
		// Create Content
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);
		// Create End node
		EndElement eElement = eventFactory.createEndElement("", "", name);
		eventWriter.add(eElement);
		eventWriter.add(end);
		}
		
	}

	public void save(ArrayList<Animals> animals) throws FileNotFoundException, XMLStreamException {
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		// Create X MLEvent Writer
		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
		// Create a EventF actory
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEventend = eventFactory.createDTD("\n ");
		// Create a nd writ e Start Tag
		StartDocument startDocument = eventFactory.createStartDocument();
		eventWriter.add(startDocument);
		// Create c ontent open tag
		StartElement configStartElement = eventFactory.createStartElement("", "", "content");
		eventWriter.add(configStartElement);
		eventWriter.add(end);
		for (Animals animal : animals) {
			StartElementsElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.ANIMAL);
			eventWriter.add(sElement);
			eventWriter.add(end);
			animal.encodeToXml(eventWriter);
			EndElement eElement = eventFactory.createEndElement("", "", Constants.XML_TAGS.ANIMAL);
			eventWriter.add(eElement);
			eventWriter.add(end);
		}
		eventWriter.add(eventFactory.createEndElement("", "", " content"));
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
	}

	public ArrayList<Animals> load() throws ParserConfigurationException, SAXException, IOException {
		ArrayList<Animals> animals = new ArrayList<Animals>();
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
						.getTextContent();
				switch (discriminant) {
				case Constants.Animal.Insect.Furnici:
					Animals Furnici = new Furnici();
					furnici.decodeFromXml(element);
					animals.add(furnici);
				case Constants.Animal.Insect.Buburuza:
					Animals Buburuza = new Buburuza();
					buburuza.decodeFromXml(element);
					animals.add(buburuza);
				case Constants.Animal.Insect.Paianjen:
					Animals Paianjen = new Paianjen();
					paianjen.decodeFromXml(element);
					animals.add(paianjen);
				case Constants.Animal.Mammal.Arici:
					Animals Arici = new Arici();
					arici.decodeFromXml(element);
					animals.add(arici);
				case Constants.Animal.Mammal.Maimuta:
					Animals Maimuta = new Maimuta();
					maimuta.decodeFromXml(element);
					animals.add(maimuta);
				case Constants.Animal.Mammal.Tigru:
					Animals Tigru = new Tigru();
					tigru.decodeFromXml(element);
					animals.add(tigru);
				case Constants.Animal.Aquatic.Crocodil:
					Animals Crocodil = new Crocodil();
					crocodil.decodeFromXml(element);
					animals.add(crocodil);
				case Constants.Animal.Aquatic.Delfin:
					Animals Delfin = new Delfin();
					delfin.decodeFromXml(element);
					animals.add(delfin);
				case Constants.Animal.Aquatic.Caracatita:
					Animals Caracatita = new Caracatita();
					caracatita.decodeFromXml(element);
					animals.add(caracatita);
				case Constants.Animal.Bird.Fazan:
					Animals Fazan = new Fazan();
					fazan.decodeFromXml(element);
					animals.add(fazan);
				case Constants.Animal.Bird.Papagal:
					Animals Papagal = new Papagal();
					papagal.decodeFromXml(element);
					animals.add(papagal);
				case Constants.Animal.Bird.Pelican:
					Animals Pelican = new Pelican();
					pelican.decodeFromXml(element);
					animals.add(pelican);

				default:
					break;
				}
			}
		}
		return animals;
	}

}