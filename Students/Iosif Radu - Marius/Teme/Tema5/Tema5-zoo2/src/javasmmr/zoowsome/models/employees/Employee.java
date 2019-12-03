package javasmmr.zoowsome.models.employees;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javax.swing.text.html.parser.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import java.math.BigDecimal;

public class Employee implements XML_Parsable {
	public String name;
	public Long id;
	public BigDecimal salary;
	public boolean isDead;
	
	public Employee() {
		this.isDead = false;
		this.salary = new BigDecimal(2000);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(Long id) {
		Long randomId = (long) (Math.random() * 10000000 * 1000000);
		this.id = randomId;
	}
	
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	public void setIsDead(boolean isDead) {
		this.isDead = isDead;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public BigDecimal getSalary() {
		return this.salary;
	}
	
	public boolean getIsDead() {
		return this.isDead;
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {

	}

	@Override
	public void decodeFromXml(Element element) {

	}

	public void decodeFromXml(org.w3c.dom.Element element) {
		setId(Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setIsDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
		setSalary(BigDecimal.valueOf(Long.parseLong(element.getElementsByTagName("salary").item(0).getTextContent())));
	}
}
